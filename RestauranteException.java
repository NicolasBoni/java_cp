package br.com.restaurante.cardapio;

public class RestauranteException extends RuntimeException {
    public RestauranteException(String mensagem) {
        super(mensagem);
    }
}