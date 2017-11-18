package br.com.ads.model.vendas;

import br.com.ads.model.clientes.Cliente;
import br.com.ads.model.produtos.Produto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItemVenda {

    //Atributos
    private Produto produto;
    private Integer quantidade;
    
    //Métodos de acesso
    public Produto getProduto() {
        return produto;
    }
    
    public void setProduto(Produto prd) {
        this.produto = prd;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
    
    public void setQuantidade(Integer qtd) {
        this.quantidade = qtd;
    }
          
}
