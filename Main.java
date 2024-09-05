package br.com.restaurante.cardapio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cardapio cardapio = new Cardapio();
        List<String> itensConsumidos = new ArrayList<>();  // Lista para armazenar os itens escolhidos pelo usuário

        // Adicionando pratos ao cardápio
        try {
            Prato prato1 = new Prato("Lasanha111", 25.90, "Lasanha de carne com molho branco.");
            cardapio.adicionarPrato(prato1);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar prato: " + e.getMessage());
        }

        try {
            Prato prato2 = new Prato("Frango Grelhado", 19.90, "Frango grelhado com legumes.");
            cardapio.adicionarPrato(prato2);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar prato: " + e.getMessage());
        }

        try {
            Prato prato3 = new Prato("Salada Caesar", 15.50, "Salada de alface com croutons e molho Caesar.");
            cardapio.adicionarPrato(prato3);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar prato: " + e.getMessage());
        }

        try {
            Prato prato4 = new Prato("Risotto de Camarão", 39.90, "Risotto cremoso com camarões frescos.");
            cardapio.adicionarPrato(prato4);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar prato: " + e.getMessage());
        }

        try {
            Prato prato5 = new Prato("Picanha na Brasa", 45.00, "Picanha fatiada na brasa com alho.");
            cardapio.adicionarPrato(prato5);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar prato: " + e.getMessage());
        }

        try {
            Prato prato6 = new Prato("Spaghetti Carbonara", 28.00, "Spaghetti com molho Carbonara.");
            cardapio.adicionarPrato(prato6);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar prato: " + e.getMessage());
        }

        // Adicionando bebidas ao cardápio
        try {
            Bebida bebida1 = new Bebida("Suco de Laranja", 5.90, "300ml");
            cardapio.adicionarBebida(bebida1);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar bebida: " + e.getMessage());
        }

        try {
            Bebida bebida2 = new Bebida("Refrigerante", 4.50, "350ml");
            cardapio.adicionarBebida(bebida2);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar bebida: " + e.getMessage());
        }

        try {
            Bebida bebida3 = new Bebida("Água com Gás", 3.50, "500ml");
            cardapio.adicionarBebida(bebida3);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar bebida: " + e.getMessage());
        }

        try {
            Bebida bebida4 = new Bebida("Água Mineral", 2.90, "500ml");
            cardapio.adicionarBebida(bebida4);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar bebida: " + e.getMessage());
        }

        try {
            Bebida bebida5 = new Bebida("Chá Gelado", 4.00, "400ml");
            cardapio.adicionarBebida(bebida5);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar bebida: " + e.getMessage());
        }

        try {
            Bebida bebida6 = new Bebida("Cerveja Artesanal", 12.00, "600ml");
            cardapio.adicionarBebida(bebida6);
        } catch (RestauranteException e) {
            System.out.println("Erro ao adicionar bebida: " + e.getMessage());
        }

        // Exibindo o cardápio
        exibirCardapioFormatado(cardapio);

        // Novo código para interação com o usuário e exibição da nota
        Scanner scanner = new Scanner(System.in);
        double totalConta = 0;

        System.out.println("\nEscolha os itens que deseja adicionar à conta (digite o número ou 0 para finalizar):");

        int numeroItem = 1;

        // Processando as escolhas do usuário
        while (true) {
            try {
                System.out.print("Escolha o item (ou 0 para finalizar): ");
                int escolha = scanner.nextInt();

                if (escolha == 0) {
                    break;
                } else if (escolha > 0 && escolha <= cardapio.getPratos().size()) {
                    Prato pratoEscolhido = cardapio.getPratos().get(escolha - 1);
                    totalConta += pratoEscolhido.getPreco();
                    itensConsumidos.add(pratoEscolhido.getNome() + " - R$ " + pratoEscolhido.getPreco());
                    System.out.println("Você adicionou: " + pratoEscolhido.getNome());
                } else if (escolha > cardapio.getPratos().size() && escolha <= cardapio.getPratos().size() + cardapio.getBebidas().size()) {
                    Bebida bebidaEscolhida = cardapio.getBebidas().get(escolha - cardapio.getPratos().size() - 1);
                    totalConta += bebidaEscolhida.getPreco();
                    itensConsumidos.add(bebidaEscolhida.getNome() + " - R$ " + bebidaEscolhida.getPreco());
                    System.out.println("Você adicionou: " + bebidaEscolhida.getNome());
                } else {
                    System.out.println("Escolha inválida, tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro durante a seleção dos itens: " + e.getMessage());
                scanner.next(); // Limpa a entrada inválida
            }
        }

        // Exibindo a nota com os itens consumidos e o valor total
        System.out.println("\n=========== NOTA FISCAL ===========");
        for (String item : itensConsumidos) {
            System.out.println(item);
        }
        System.out.printf("\nTotal da compra: R$ %.2f\n", totalConta);
    }

    // Método para exibir o cardápio de forma formatada
    public static void exibirCardapioFormatado(Cardapio cardapio) {
        System.out.println("=".repeat(40));
        System.out.println("         CARDÁPIO DO RESTAURANTE");
        System.out.println("=".repeat(40));
        System.out.println("\nPRATOS:");
        System.out.println("-".repeat(40));
        int numeroItem = 1;
        for (Prato prato : cardapio.getPratos()) {
            System.out.printf("%d. %-25s R$ %-6.2f\n", numeroItem++, prato.getNome(), prato.getPreco());
            System.out.printf("   %s\n", prato.getDescricao());
        }

        System.out.println("\nBEBIDAS:");
        System.out.println("-".repeat(40));
        for (Bebida bebida : cardapio.getBebidas()) {
            System.out.printf("%d. %-25s R$ %-6.2f\n", numeroItem++, bebida.getNome(), bebida.getPreco());
            System.out.printf("   %s\n", bebida.getTamanho());
        }
        System.out.println("=".repeat(40));
    }
}
