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

    //Insere um produtos no mock 
    public static void inserir(Produto pro)
            throws Exception {
        pro.setCodigo(totalProdutos++);
        listaProdutos.add(pro);
    }

    //Realiza a atualização dos dados de um produto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Produto"
    public static void atualizar(Produto produtoProcura)
            throws Exception {
        if (produtoProcura != null && produtoProcura.getCodigo()!= null && !listaProdutos.isEmpty()) {
            for (Produto produtoCli : listaProdutos) {
                if (produtoCli != null && produtoCli.getCodigo()== produtoProcura.getCodigo()) {
                    produtoCli.setCodigo(produtoProcura.getCodigo());
                    produtoCli.setNome(produtoProcura.getNome());
                    produtoCli.setMarca(produtoProcura.getMarca());
                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                Produto produto = listaProdutos.get(i);
                if (produto != null && produto.getCodigo() == id) {
                    listaProdutos.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os produtos
    public static List<Produto> listar()
            throws Exception {        
        //Retorna a lista de produto 
        return listaProdutos;
    }

    //Procura um produto na lista, de acordo com o numero
    //do produto passado como parâmetro
    public static List<Produto> procurar(Long valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if (valor != null && !listaProdutos.isEmpty()) {
            for (Produto produtoLi : listaProdutos) {
                if (produtoLi != null && produtoLi.getCodigo()!= null &&
                    produtoLi.getCategoria()!= null) {
                    if (Objects.equals(produtoLi.getCodigo(), valor) ||
                        Objects.equals(produtoLi.getCodigo(), valor)) {
                        listaResultado.add(produtoLi);
                    }
                }
            }
        }
        
        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um produto da lista
    public static Produto obter(Integer id)
            throws Exception {
        if (id != null && !listaProdutos.isEmpty()) {
            for (int i = 0; i < listaProdutos.size(); i++) {
                if (listaProdutos.get(i) != null && listaProdutos.get(i).getCodigo()== id) {
                    return listaProdutos.get(i);
                }                
            }
        }
        return null;
    }
}
