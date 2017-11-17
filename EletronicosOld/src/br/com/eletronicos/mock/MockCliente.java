package br.com.eletronicos.mock;

import br.com.eletronicos.model.Cliente;
import java.util.ArrayList;
import java.util.List;

public class MockCliente {
    static private List<Cliente> clientes = new ArrayList<>();
    
    public static void adicionaCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public static void removeCliente(Cliente cliente) {
        int indiceCliente = encontraCliente(cliente);
        if (indiceCliente != -1) clientes.remove(indiceCliente);
        else {
            System.err.println("O cliente não foi encontrado");
        }
    }
    
    private static int encontraCliente(Cliente cliente) {
        for (int i=0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf()== cliente.getCpf()) return i;
        }
        return -1;
    }   
}
