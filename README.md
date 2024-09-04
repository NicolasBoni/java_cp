<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Restaurante Cardápio - README</title>
</head>
<body>

    <h1>🍽️ Restaurante Cardápio - README</h1>

    <h2>📖 Descrição do Projeto</h2>
    <p>Este projeto é um sistema simples de gerenciamento de cardápio para um restaurante. O usuário pode visualizar um cardápio com pratos e bebidas, selecionar os itens que deseja consumir e, ao final, obter uma nota fiscal com o valor total dos itens escolhidos.</p>

    <h2>🎯 Funcionalidades</h2>
    <ul>
        <li>📝 <strong>Exibição do Cardápio:</strong> O sistema exibe um cardápio formatado, com pratos e bebidas disponíveis, seus preços e descrições.</li>
        <li>📋 <strong>Seleção de Itens:</strong> O usuário pode interagir com o sistema para adicionar pratos e bebidas à sua conta.</li>
        <li>🧾 <strong>Geração de Nota Fiscal:</strong> Após selecionar os itens, o sistema exibe uma nota fiscal com a lista de itens consumidos e o valor total da compra.</li>
    </ul>

    <h2>🛠️ Estrutura do Código</h2>
    <ul>
        <li>💻 <strong>Classe Main:</strong> Ponto de entrada do programa. Gerencia a lógica principal do sistema, como exibição do cardápio, interação com o usuário e geração da nota fiscal.</li>
        <li>🧩 <strong>Método <code>exibirCardapioFormatado(Cardapio)</code>:</strong> Exibe o cardápio de forma organizada, com formatação clara para facilitar a escolha dos itens.</li>
        <li>📑 <strong>Listagem de Itens:</strong> Os pratos e bebidas são armazenados em listas, e o usuário pode interagir com o sistema para selecionar os itens que deseja consumir.</li>
    </ul>

    <h2>🚀 Como Usar</h2>
    <ol>
        <li>Ao iniciar o sistema, o cardápio será exibido com a lista de pratos e bebidas disponíveis.</li>
        <li>O usuário deve digitar o número correspondente ao item que deseja adicionar à conta.</li>
        <li>Após finalizar as escolhas (digitando <code>0</code>), o sistema exibirá a nota fiscal com os itens escolhidos e o valor total da conta.</li>
    </ol>

    <h3>🍴 Figura 1: Exibição do Cardápio</h3>
    <img src="https://via.placeholder.com/1024x400.png?text=Card%C3%A1pio+do+Restaurante" alt="Figura 1: Cardápio de pratos e bebidas">

    <hr>

    <h3>🤖 Figura 2: Interação de Seleção de Itens</h3>
    <img src="https://via.placeholder.com/1024x400.png?text=Sele%C3%A7%C3%A3o+de+Itens" alt="Figura 2: Seleção de itens pelo usuário">

    <hr>

    <h3>🧾 Figura 3: Exibição da Nota Fiscal</h3>
    <img src="https://via.placeholder.com/1024x400.png?text=Nota+Fiscal" alt="Figura 3: Nota fiscal com itens consumidos">

    <hr>

    <h2>🧑‍💻 Exemplo de Execução</h2>
    <pre>
========================================
         CARDÁPIO DO RESTAURANTE
========================================

PRATOS:
----------------------------------------
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
    </pre>

    <h2>🖥️ Requisitos do Sistema</h2>
    <ul>
        <li><strong>Java 8</strong> ou superior.</li>
        <li>Biblioteca padrão do Java (não há dependências externas).</li>
    </ul>

    <h2>❗ Exceções Tratadas</h2>
    <p>O código está preparado para lidar com possíveis erros ao adicionar pratos e bebidas ao cardápio. Além disso, trata entradas inválidas do usuário durante a seleção dos itens, evitando que o sistema quebre.</p>

    <h2>🌟 Futuras Melhorias</h2>
    <ul>
        <li>Adicionar mais categorias de itens (sobremesas, entradas).</li>
        <li>Implementar uma interface gráfica.</li>
        <li>Integrar com um sistema de pagamento.</li>
    </ul>

    <hr>

    <p>Este README fornece uma visão geral sobre o projeto e suas funcionalidades. Para executar o sistema, basta compilar e rodar a classe <code>Main</code>.</p>

</body>
</html>
