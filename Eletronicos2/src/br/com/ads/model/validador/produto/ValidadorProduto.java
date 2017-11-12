package br.com.ads.model.validador.produto;

import br.com.ads.exceptions.ProdutoException;
import br.com.ads.model.produtos.Produto;

//Validador de Produto
public class ValidadorProduto {
    public static  void validar(Produto pro) throws ProdutoException {
        //Realização de validações de negócio
        if (pro == null) {
            throw new ProdutoException("Não foi informado um codigo");
        }
        if (pro.getCodigo()== null || pro.getCodigo()<= 0) {
            throw new ProdutoException("O número do quarto precisa ser "
                + "um valor positivo e maior que zero.");
        }
        
        if (pro.getCodigo()== null || "".equals(pro.getCodigo())
                || (!pro.getCodigo().equals("Simples"))
                && !pro.getCodigo().equals("Luxo")) {
            throw new ProdutoException("É necessário informar o "
                    + "tipo do quarto");
        }
    }
}
