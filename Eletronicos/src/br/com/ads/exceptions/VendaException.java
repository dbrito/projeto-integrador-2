package br.com.ads.exceptions;

//Indica uma exceção de produto
public class VendaException extends Exception {
    //Construtor de exceções que permite informar uma mensagem
    public VendaException(String message) {
        super(message);
    }
}
