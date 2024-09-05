package br.com.restaurante.cardapio;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private List<Prato> pratos;
    private List<Bebida> bebidas;

    // Construtor
    public Cardapio() {
        this.pratos = new ArrayList<>();
        this.bebidas = new ArrayList<>();
    }

    // Método para adicionar um prato ao cardápio
    public void adicionarPrato(Prato prato) {
        if (prato == null) {
            throw new RestauranteException("Não é possível adicionar um prato nulo.");
        }
        pratos.add(prato);
    }

    // Método para adicionar uma bebida ao cardápio
    public void adicionarBebida(Bebida bebida) {
        if (bebida == null) {
            throw new RestauranteException("Não é possível adicionar uma bebida nula.");
        }
        bebidas.add(bebida);
    }

    // Método getter para a lista de pratos
    public List<Prato> getPratos() {
        return pratos;
    }

    // Método getter para a lista de bebidas
    public List<Bebida> getBebidas() {
        return bebidas;
    }

    // Método para exibir o cardápio completo
    public void exibirCardapio() {
        System.out.println("Cardápio de Pratos:");
        for (Prato prato : pratos) {
            System.out.println(prato);
        }

        System.out.println("Cardápio de Bebidas:");
        for (Bebida bebida : bebidas) {
            System.out.println(bebida);
        }
    }
}