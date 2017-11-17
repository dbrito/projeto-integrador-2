package br.com.ads.model.validador.produto;

import br.com.ads.exceptions.ProdutoException;
import br.com.ads.model.produtos.Produto;

//Validador de Produto
public class ValidadorProduto {
    public static  void validar(Produto pro) throws ProdutoException {
        //Realização de validações de negócio
        if (pro.getCodigo() == null || pro.getCodigo().trim().equals("")) {
            throw new ProdutoException("Não foi informado um código");
        }

        if (pro.getNome() == null || pro.getNome().trim().equals("")) {
            throw new ProdutoException("Não foi informado um Nome");
        }

        if (pro.getMarca() == null  || pro.getMarca().trim().equals("")) {
            throw new ProdutoException("Não foi informado uma Marca");
        }

        if (pro.getPreco() <= 0) {
            throw new ProdutoException("Informe um preço válido");
        }

        if (pro.getQuantidade() <= 0) {
            throw new ProdutoException("Informe a quantidade");
        }

        if (pro.getDescricao() == null  || pro.getDescricao().trim().equals("")) {
            throw new ProdutoException("Não foi informado uma Descricao");
        }
        
    }
}
