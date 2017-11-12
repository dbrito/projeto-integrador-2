package br.com.ads.exceptions;

//Indica uma exceção de quarto
public class ProdutoException extends Exception {

    //Construtor de exceções que permite informar uma mensagem
    public ProdutoException(String message) {
        super(message);
    }

}
