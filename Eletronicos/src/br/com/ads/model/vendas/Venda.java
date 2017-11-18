package br.com.ads.model.vendas;

import br.com.ads.model.clientes.Cliente;
import br.com.ads.model.produtos.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {

    //Atributos
    private List<ItemVenda> listaItens = new ArrayList<ItemVenda>();
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

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public List<ItemVenda> getItens() {
        return listaItens;
    }

    public void addItem(ItemVenda item) {
        listaItens.add(item);
    }
          
}
