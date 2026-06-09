# Sistema de Distribuição de Troco

Repositório destinado à entrega da atividade prática da disciplina de **Modelos e Padrões de projeto** ministrada pela professora Cristiane Palomar.

## Sobre a Atividade
O objetivo deste trabalho foi desenvolver uma aplicação para calcular e distribuir o troco de uma compra utilizando o menor número possível de notas e moedas. Na prática, foi aplicado o padrão de projeto estrutural **Bridge**. O sistema separa a abstração (a lógica matemática do cálculo de troco mínimo) da implementação (o sistema monetário específico, como o Real Brasileiro), permitindo que novas moedas ou regras sejam adicionadas futuramente sem necessidade de alterar a lógica principal do calculador.

## O que foi entregue neste repositório:
- **Interface de Usuário:** Interação construída através da biblioteca `JOptionPane` para recebimento de dados (valor da compra e valor pago) e exibição do demonstrativo de troco.
- **Lógica de Padrões de Projeto (Java):** Implementação da estrutura Bridge através das interfaces e classes `SistemaMonetario` (Implementação), `RealBrasileiro` (Implementação Concreta), `CalculadorTroco` (Abstração) e `CalculadorTrocoMinimo` (Abstração Refinada).
- **Sistema de Execução:** Classe `Main` responsável por instanciar a ponte entre as classes, tratar os dados inseridos e gerenciar o fluxo da aplicação.

## Tecnologias Utilizadas:
- Java
- Swing (JOptionPane)

## Integrantes:
- Maria Julia Loureiro
- Sophia Araujo
- Rafaela Riganti
