/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package distribuicaotroco;

/**
 *
 * @author Rafaela
 */
public interface SistemaMonetario {
        // Retorna as cédulas e moedas disponíveis em centavos em ordem decrescente

        int[] getDenominacoesEmCentavos();

        // Formata o valor de centavos para exibição (ex: 500 vira "R$ 5,00")
        String formatar(int centavos);

        // Retorna o nome da denominação (ex: "nota(s)", "moeda(s)")
        String getNomeDenominacao(int centavos);
}
