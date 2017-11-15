package br.com.ads.mock;

import br.com.ads.model.produtos.Produto;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//Mock de Produto. Realiza operações de mock com o produto
public class MockProduto {
    private static int totalProdutos = 0;
    /** Armazena a lista de produtos inseridos para manipulação. #MOCK **/    
    private static List<Produto> listaProdutos = new ArrayList<Produto>();

    //Insere um produto no mock "produto"
    public static void inserir(Produto pro)
            throws Exception {
        //pro.setCodigo(totalProdutos++);
        listaProdutos.add(pro);
    }

    //Realiza a atualização dos dados de um produto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Produto"
    public static void atualizar(Produto produtoProcura)
            throws Exception {
        if (produtoProcura != null && produtoProcura.getCodigo()!= null && !listaProdutos.isEmpty()) {
            for (Produto produto : listaProdutos) {
                if (produto != null && produto.getCodigo()== produtoProcura.getCodigo()) {
                    produto.setNome(produtoProcura.getNome());
                    produto.setMarca(produtoProcura.getMarca());
                    produto.setPreco(produtoProcura.getPreco());
                    produto.setQuantidade(produtoProcura.getQuantidade());
                    produto.setCategoria(produtoProcura.getCategoria());                                        
                    produto.setDescrição(produtoProcura.getDescricao());
                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
    public static void excluir(String codigo) throws Exception {
        if (codigo != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto produtoLi = listaProdutos.get(i);
                if (produtoLi != null && produtoLi.getCodigo() == codigo) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os produtos
    public static List<Produto> listar()
            throws Exception {        
        //Retorna a lista de produtos 
        return listaProdutos;
    }

    //Procura um produto na lista, de acordo com o numero
    //do produto passado como parâmetro
    public static List<Produto> procurar(String termo)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if (termo != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getCodigo()!= null &&
                    produtoLi.getCategoria()!= null) {
                    //procuro o produto por nome, marca e código
                    if (produtoLi.getNome().contains(termo) || produtoLi.getMarca().contains(termo) || produtoLi.getCodigo().contains(termo) ){
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        
        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um produto da lista
    public static Produto obter(String codigo)
            throws Exception {
        if (codigo != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i) != null && listaProdutos.get(i).getCodigo()== codigo) {
                    return listaProdutos.get(i);
                }
            }
        }
        return null;
    }
}
