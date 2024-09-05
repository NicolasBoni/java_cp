package br.com.restaurante.cardapio;

public class Bebida {
    private String nome;
    private double preco;
    private String tamanho;

    // Construtor
    public Bebida(String nome, double preco, String tamanho) {
        if (nome == null || nome.matches(".*\\d.*")) {
            throw new RestauranteException("Nome de bebida inválido: " + nome);
        }
        this.nome = nome;
        this.preco = preco;
        this.tamanho = tamanho;
    }

    // Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    // Método toString para exibir as informações da bebida
    @Override
    public String toString() {
        return nome + " - R$ " + preco + " (" + tamanho + ")";
    }
}
