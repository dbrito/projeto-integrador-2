package br.com.ads.service.produto;

import br.com.ads.exceptions.QuartoException;
import br.com.ads.mock.MockProduto;
import br.com.ads.exceptions.DataSourceException;
import br.com.ads.model.produtos.Produto;
import br.com.ads.model.validador.produto.ValidadorProduto;
import java.util.List;

//Classe de serviço de quarto
public class ServicoProduto {

    //Insere um quarto na fonte de dados
    public static void cadastrarQuarto(Produto quarto)
            throws QuartoException, DataSourceException {
        
        //Realiza validações no quarto
        ValidadorProduto.validar(quarto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            MockProduto.inserir(quarto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um quarto na fonte de dados
    public static void atualizarQuarto(Produto quarto)
            throws QuartoException, DataSourceException {
        
        //Realiza validações no quarto
        ValidadorProduto.validar(quarto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MockProduto.atualizar(quarto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um quarto por número na fonte de dados
    public static List<Produto> procurarQuarto(Long numero)
            throws QuartoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (numero == null) {
                return MockProduto.listar();
            } else {
                return MockProduto.procurar(numero);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o quarto com ID informado do mock
    public static Produto obterQuarto(Integer id)
            throws QuartoException, DataSourceException {
        try {
            //Retorna o quarto obtido com o DAO
            return MockProduto.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Exclui o quarto com ID informado do mock
    public static void excluirQuarto(Integer id)
            throws QuartoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do quarto informado
            MockProduto.excluir(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
}