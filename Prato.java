package br.com.restaurante.cardapio;

public class Prato {
    private String nome;
    private double preco;
    private String descricao;

    // Construtor
    public Prato(String nome, double preco, String descricao) {
        if (nome == null || nome.matches(".*\\d.*")) {
            throw new RestauranteException("Nome de prato inválido: " + nome);
        }
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    // Getters para acessar os atributos
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

    // Método toString para exibir as informações do prato
    @Override
    public String toString() {
        return nome + " - R$ " + preco + ": " + descricao;
    }
}
