package br.com.eletronicos.model;

import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();    
    
    public Venda (Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void addProduto(Produto produto) {
        produtos.add(produto);
    }
    
    public void removeProduto(Produto produto) {
        int indiceProduto = findProduto(produto);
        if (indiceProduto != -1) {
            produtos.remove(indiceProduto);
        }
    }
    
    private int findProduto(Produto produto) {
        for (int i=0; i < produtos.size(); i++) {
            if (produtos.get(i).getCodigo() == produto.getCodigo()) return i;
        }
        return -1;
    }
    
    public float getTotal() {
        float total=0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    
}