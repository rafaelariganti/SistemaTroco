/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distribuicaotroco;

/**
 *
 * @author Rafaela
 */
public class RealBrasileiro implements SistemaMonetario  {
        // Notas e moedas do Real em centavos (200 reais = 20000 centavos)
        private final int[] denominacoes = {
            20000, 10000, 5000, 2000, 1000, 500, 200,
            100, 50, 25, 10, 5
        };

        @Override
        public int[] getDenominacoesEmCentavos() {
            return denominacoes;
        }

        @Override
        public String formatar(int centavos) {
            double valorReais = centavos / 100.0;
            return String.format("R$ %.2f", valorReais);
        }

        @Override
        public String getNomeDenominacao(int centavos) {
            if (centavos >= 200) {
                return "nota(s) de";
            } else {
                return "moeda(s) de";
            }
        }
}
