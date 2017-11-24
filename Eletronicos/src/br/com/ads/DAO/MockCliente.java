package br.com.ads.DAO;

import br.com.ads.model.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;

public class MockCliente {
    private static int totalClientes = 0;
    private static List<Cliente> listaClientes = new ArrayList<Cliente>();

    //Insere um cliente
    public static void inserir(Cliente cliente) throws Exception {
        cliente.setId(totalClientes++);
        listaClientes.add(cliente);
    }

    //Realiza a atualização dos dados de um cliente
    public static void atualizar(Cliente clienteProcura)
            throws Exception {
        if (clienteProcura != null && clienteProcura.getId() != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null && clienteLi.getId() == clienteProcura.getId()) {


                    clienteLi.setNome(clienteProcura.getNome());

                    break;
                }
            }
        }
    }

    //Realiza a exclusão de um cliente
    public static void excluir(Integer id) throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                Cliente clienteLi = listaClientes.get(i);
                if (clienteLi != null && clienteLi.getId() == id) {
                    listaClientes.remove(i);
                    break;
                }
            }
        }
    }

    //Lista todos os clientes
    public static List<Cliente> listar() throws Exception {
        return listaClientes;
    }

    //Procura um cliente no mock, de acordo com o nome ou cpf
    public static List<Cliente> procurar(String valor) throws Exception {
        List<Cliente> listaResultado = new ArrayList<Cliente>();

        if (valor != null && !listaClientes.isEmpty()) {
            for (Cliente clienteLi : listaClientes) {
                if (clienteLi != null) {
                    //busco pelo nome e cpf
                    if ( clienteLi.getNome().toUpperCase().contains(valor.toUpperCase()) || clienteLi.getCpf().toString().contains(valor)) {
                        listaResultado.add(clienteLi);
                    }
                }
            }
        }

        return listaResultado;
    }

    //Obtém um cliente da lista
    public static Cliente obter(Integer id) throws Exception {
        if (id != null && !listaClientes.isEmpty()) {
            for (int i = 0; i < listaClientes.size(); i++) {
                if (listaClientes.get(i) != null && listaClientes.get(i).getId() == id) {
                    return listaClientes.get(i);
                }
            }
        }
        return null;
    }
}
