package br.com.ads.model.validador.venda;

import br.com.ads.exceptions.ProdutoException;
import br.com.ads.exceptions.VendaException;
import br.com.ads.model.produtos.Produto;
import br.com.ads.model.vendas.Venda;

//Validador de Venda
public class ValidadorVenda {
    public static  void validar(Venda venda) throws VendaException {
        if (venda.getCliente()== null) {
            throw new VendaException("Selecione um cliente para efetuar a venda");
        }
        
        if (venda.getItens().size()== 0) {
            throw new VendaException("Selecione pelo menos um produto para realizar a venda");
        }
    }
}
