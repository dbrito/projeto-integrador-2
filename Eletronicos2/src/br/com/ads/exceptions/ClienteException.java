package br.com.ads.exceptions;

//Indica uma exceção de cliente
public class ClienteException extends Exception {

    //Construtor de exceções que permite informar uma mensagem  
    public ClienteException(String message) {
        super(message);
    }

}
