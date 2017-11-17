package br.com.ads.model.vendas;

import br.com.ads.model.clientes.Cliente;
import br.com.ads.model.produtos.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

    //Atributos
    private List<Produto> listaProdutos;
    private Cliente cliente;
    private Date data;
    private Integer id;
    
    //Métodos de acesso
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public Date getData() {
        return data;
    }

    public void setId(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<Produto> getProdutos() {
        return listaProdutos;
    }

    public void setCliente(List<Produto> produtos) {
        this.listaProdutos = produtos;
    }
          
}
