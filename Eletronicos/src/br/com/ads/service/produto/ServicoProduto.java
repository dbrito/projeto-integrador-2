package br.com.ads.service.produto;

import br.com.ads.DAO.ProdutoDAO;
import br.com.ads.exceptions.ProdutoException;
import br.com.ads.mock.MockProduto;
import br.com.ads.exceptions.DataSourceException;
import br.com.ads.model.produtos.Produto;
import br.com.ads.model.validador.produto.ValidadorProduto;
import java.util.List;

//Classe de serviço de produto
public class ServicoProduto {

    //Insere um produto na fonte de dados
    public static void cadastrarProduto(Produto produto) throws ProdutoException, DataSourceException, Exception {        
        //Realiza validações no produto
        ValidadorProduto.validar(produto);
        
        if (ProdutoDAO.obter(produto.getCodigo()) != null) {
            throw new DataSourceException("Já existe um produto com esse código", new Exception());
        }
        
        try {
            //Realiza a chamada de inserção na fonte de dados
            ProdutoDAO.inserir(produto);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Atualiza um produto na fonte de dados
    public static void atualizarProduto(Produto produto) throws ProdutoException, DataSourceException {        
        //Realiza validações no produto
        ValidadorProduto.validar(produto);

        try {
            //Realiza a chamada de atualização na fonte de dados
            ProdutoDAO.atualizar(produto);
            return;
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Realiza a pesquisa de um produto por número na fonte de dados
    public static List<Produto> procurarProduto(String termo) throws ProdutoException, DataSourceException {
        try {
            //Verifica se um parâmetro de pesquisa não foi informado.
            //Caso afirmativo, realiza uma listagem simples do mock.
            //Caso contrário, realiza uma pesquisa com o parâmetro
            if (termo == null) {
                return ProdutoDAO.listar();
            } else {
                return ProdutoDAO.procurar(termo);
            }
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    //Obtem o produto com ID informado do mock
    public static Produto obterProduto(String codigo)
            throws ProdutoException, DataSourceException {
        try {
            //Retorna o produto obtido com o DAO
            return ProdutoDAO.obter(codigo);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }
    public static void excluirProduto(String codigo)
            throws ProdutoException, DataSourceException {
        try {
            //Solicita ao DAO a exclusão do cliente informado
            
            ProdutoDAO.excluir(codigo);
        } catch (Exception e) {
            //Imprime qualquer erro técnico no console e devolve
            //uma exceção e uma mensagem amigável a camada de visão
            e.printStackTrace();
            throw new DataSourceException("Erro na fonte de dados", e);
        }
    }

    
    }
