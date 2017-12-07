package br.com.ads.service.cliente;

import br.com.ads.exceptions.ClienteException;
import br.com.ads.mock.MockCliente;
import br.com.ads.exceptions.DataSourceException;
import br.com.ads.model.clientes.Cliente;
import br.com.ads.model.validador.cliente.ValidadorCliente;
import br.com.ads.DAO.ClienteDAO;
import java.util.List;

//Classe de serviço de cliente
public class ServicoCliente {

    //Insere um cliente na fonte de dados
    public static void cadastrarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {

        //Chama o validador para verificar o cliente
        ValidadorCliente.validar(cliente);

        try {
            //Realiza a chamada de inserção na fonte de dados
            ClienteDAO.inserir(cliente);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um cliente na fonte de dados
    public static void atualizarCliente(Cliente cliente)
            throws ClienteException, DataSourceException {
        
        //Chama o validador para verificar o cliente
        ValidadorCliente.validar(cliente);

        try {
            //Realiza a chamada de atualização na fonte de dados
            ClienteDAO.atualizar(cliente);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um cliente por nome na fonte de dados
    public static List<Cliente> procurarCliente(String nome)
            throws ClienteException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (nome == null || "".equals(nome)) {
                return ClienteDAO.listar();
            } else {
                return ClienteDAO.procurar(nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o cliente com ID informado do mock
    public static Cliente obterCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
            //Retorna o cliente obtido com o DAO
            return ClienteDAO.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o cliente com ID informado do mock
    public static void excluirCliente(Integer id)
            throws ClienteException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do cliente informado
            ClienteDAO.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}
