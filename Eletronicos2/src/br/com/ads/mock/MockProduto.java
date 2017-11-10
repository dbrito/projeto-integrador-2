package br.com.ads.mock;

import br.com.ads.model.produtos.Produto;
import java.util.ArrayList;
import java.util.List;

//Mock de Produto. Realiza operações de mock com o quarto
public class MockProduto {
    private static int totalQuartos = 0;
    /** Armazena a lista de quartos inseridos para manipulação. #MOCK **/    
    private static List<Produto> listaQuartos = new ArrayList<Produto>();

    //Insere um quarto no mock "quarto"
    public static void inserir(Produto quarto)
            throws Exception {
        quarto.setId(totalQuartos++);
        listaQuartos.add(quarto);
    }

    //Realiza a atualização dos dados de um quarto, com ID e dados
    //fornecidos como parâmetro através de um objeto da classe "Produto"
    public static void atualizar(Produto quartoProcura)
            throws Exception {
        if (quartoProcura != null && quartoProcura.getId() != null && !listaQuartos.isEmpty()) {
            for (Produto quartoCli : listaQuartos) {
                if (quartoCli != null && quartoCli.getId() == quartoProcura.getId()) {
                    quartoCli.setAndar(quartoProcura.getAndar());
                    quartoCli.setNumero(quartoProcura.getNumero());
                    quartoCli.setTipo(quartoProcura.getTipo());
                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um cliente no mock, com ID fornecido
    //como parâmetro.
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaQuartos.isEmpty()) {
            for (int i = 0; i < listaQuartos.size(); i++) {
                Produto quartoLi = listaQuartos.get(i);
                if (quartoLi != null && quartoLi.getId() == id) {
                    listaQuartos.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os quartos
    public static List<Produto> listar()
            throws Exception {        
        //Retorna a lista de quartos 
        return listaQuartos;
    }

    //Procura um quarto na lista, de acordo com o numero
    //do quarto passado como parâmetro
    public static List<Produto> procurar(Long valor)
            throws Exception {
        List<Produto> listaResultado = new ArrayList<Produto>();
        
        if (valor != null && !listaQuartos.isEmpty()) {
            for (Produto quartoLi : listaQuartos) {
                if (quartoLi != null && quartoLi.getNumero() != null &&
                    quartoLi.getAndar() != null) {
                    if (quartoLi.getNumero() == valor ||
                        quartoLi.getAndar() == valor) {
                        listaResultado.add(quartoLi);
                    }
                }
            }
        }
        
        //Retorna a lista de clientes encontrados
        return listaResultado;
    }

    //Obtém um quarto da lista
    public static Produto obter(Integer id)
            throws Exception {
        if (id != null && !listaQuartos.isEmpty()) {
            for (int i = 0; i < listaQuartos.size(); i++) {
                if (listaQuartos.get(i) != null && listaQuartos.get(i).getId() == id) {
                    return listaQuartos.get(i);
                }                
            }
        }
        return null;
    }
}
