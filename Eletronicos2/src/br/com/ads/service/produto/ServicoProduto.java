package br.com.ads.service.produto;

import br.com.ads.exceptions.ProdutoException;
import br.com.ads.mock.MockProduto;
import br.com.ads.exceptions.DataSourceException;
import br.com.ads.model.produtos.Produto;
import br.com.ads.model.validador.produto.ValidadorProduto;
import java.util.List;

//Classe de serviço de protudo
public class ServicoProduto {

    //Insere um produto na fonte de dados
    public static void cadastrarProduto(Produto produto)
            throws ProdutoException, DataSourceException {
        
        //Realiza validações no produto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de inserção na fonte de dados
            MockProduto.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro nos dados", e);
        }
    }

    //Atualiza um ptoduto na fonte de dados
    public static void atualizarProduto(Produto pro)
            throws ProdutoException, DataSourceException {
        
        //Realiza validações no produto
        ValidadorProduto.validar(pro);

        try {
            //Realiza a chamada de atualização na fonte de dados
            MockProduto.atualizar(pro);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro nos dados ", e);
        }
    }

    //Realiza a pesquisa de um produto por número na fonte de dados
    public static List<Produto> procurarProduto(Long nome)
            throws ProdutoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (nome == null) {
                return MockProduto.listar();
            } else {
                return MockProduto.procurar(nome);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro nos dados", e);
        }
    }

    //Obtem o produto  com ID informado do mock
    public static Produto obterProduto(Integer id)
            throws ProdutoException, DataSourceException {
        try {
            //Retorna o produto obtido com o DAO
            return MockProduto.obter(id);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro nos dados", e);
        }
    }

    //Exclui o produto com ID informado do mock
    public static void excluirProduto(Integer nome)
            throws ProdutoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do produto informado
            MockProduto.excluir(nome);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro nos dados", e);
        }
    }
}