package br.com.ads.model.validador.cliente;

import br.com.ads.exceptions.ClienteException;
import br.com.ads.model.clientes.Cliente;

//Validador de dados do cliente
public class ValidadorCliente {
    public static  void validar(Cliente cliente) throws ClienteException {
        //Realização de validações de negócio
        if (cliente == null) {
            throw new ClienteException("Não foi informado um cliente");
        }
        if (cliente.getNome() == null || "".equals(cliente.getNome())) {
            throw new ClienteException("É necessário informar "
                    + "um nome de cliente");
        }
        if (cliente.getCpf()== null
                || "".equals(cliente.getCpf())) {
            throw new ClienteException("É necessário informar o "
                    + "CPF do cliente");
        }
        /*if (cliente.getDataNascimento() == null) {
            throw new ClienteException("É necessário informar um "
                    + "valor de idade válido");
        }*/
        
        /*System.out.println("MUEK" + cliente.getEndereco());
        if (cliente.getEndereco() == null || "".equals(cliente.getEndereco())
                || cliente.getNumero() == null
                || cliente.getCep() == null 
                || cliente.getCidade() == null || "".equals(cliente.getCidade())
                || cliente.getEstado() == null || "".equals(cliente.getEstado())) {
            throw new ClienteException("É necessário informar o "
                    + "endereço do cliente");
        }*/
    }
}
