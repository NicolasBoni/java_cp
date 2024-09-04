# 🍽️ Restaurante Cardápio 

## 📖 Descrição do Projeto

Este projeto é um sistema simples de gerenciamento de cardápio para um restaurante. O usuário pode visualizar um cardápio com pratos e bebidas, selecionar os itens que deseja consumir e, ao final, obter uma nota fiscal com o valor total dos itens escolhidos.

## 🎯 Funcionalidades

1. 📝 Exibição do Cardápio: O sistema exibe um cardápio formatado, com pratos e bebidas disponíveis, seus preços e descrições.
2. 📋 Seleção de Itens: O usuário pode interagir com o sistema para adicionar pratos e bebidas à sua conta.
3. 🧾 Geração de Nota Fiscal: Após selecionar os itens, o sistema exibe uma nota fiscal com a lista de itens consumidos e o valor total da compra.

## 🛠️ Estrutura do Código

+ 💻 Classe Main: Ponto de entrada do programa. Gerencia a lógica principal do sistema, como exibição do cardápio, interação com o usuário e geração da nota fiscal.
+ 🧩 Método exibirCardapioFormatado(Cardapio): Exibe o cardápio de forma organizada, com formatação clara para facilitar a escolha dos itens.
+ 📑 Listagem de Itens: Os pratos e bebidas são armazenados em listas, e o usuário pode interagir com o sistema para selecionar os itens que deseja consumir.

## 🚀 Como Usar

1. Ao iniciar o sistema, o cardápio será exibido com a lista de pratos e bebidas disponíveis.
2. O usuário deve digitar o número correspondente ao item que deseja adicionar à conta.
3. Após finalizar as escolhas (digitando 0), o sistema exibirá a nota fiscal com os itens escolhidos e o valor total da conta.

## 🖥️ Exemplo de Execução

 ===========  CARDÁPIO DO RESTAURANTE ===========
        
 PRATOS:
 1. Lasanha                    R$ 25.90
   Lasanha de carne com molho branco.
 2. Frango Grelhado            R$ 19.90
   Frango grelhado com legumes.
 3. Salada Caesar              R$ 15.50
   Salada de alface com croutons e molho Caesar.
 ...

 Escolha os itens que deseja adicionar à conta (digite o número ou 0 para finalizar):
 Escolha o item (ou 0 para finalizar): 1
 Você adicionou: Lasanha

 Escolha o item (ou 0 para finalizar): 0

 =========== NOTA FISCAL ===========
 Lasanha - R$ 25.90

 Total da compra: R$ 25.90

## ❗ Exceções Tratadas

O código está preparado para lidar com possíveis erros ao adicionar pratos e bebidas ao cardápio. Além disso, trata entradas inválidas do usuário durante a seleção dos itens, evitando que o sistema quebre.

