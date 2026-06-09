/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distribuicaotroco;

/**
 *
 * @author Rafaela
 */
public class CalculadorTrocoMinimo extends CalculadorTroco {
    public CalculadorTrocoMinimo(SistemaMonetario sistemaMonetario) {
        super(sistemaMonetario); // Conecta com o Bridge
    }

    @Override
    public String calcular(double valorCompra, double valorPago) {
        // Converte os valores para centavos para evitar bugs de ponto flutuante
        int compraCentavos = (int) Math.round(valorCompra * 100);
        int pagoCentavos = (int) Math.round(valorPago * 100);

        if (pagoCentavos < compraCentavos) {
            return "Erro: O valor pago é menor que o valor da compra!";
        }

        int trocoCentavos = pagoCentavos - compraCentavos;

        if (trocoCentavos == 0) {
            return "Sem troco: O valor foi pago exato.";
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("Troco total: ").append(sistemaMonetario.formatar(trocoCentavos)).append("\n\n");
        resultado.append("Distribuição:\n");

        int[] denominacoes = sistemaMonetario.getDenominacoesEmCentavos();

        // O algoritmo vai dividindo pelo maior valor possível e pegando resto
        for (int denom : denominacoes) {
            if (trocoCentavos >= denom) {
                int quantidade = trocoCentavos / denom;
                trocoCentavos = trocoCentavos % denom; // Pega o que sobrou

                String nome = sistemaMonetario.getNomeDenominacao(denom);
                String valorFormatado = sistemaMonetario.formatar(denom);
                
                resultado.append("- ").append(quantidade).append(" ").append(nome)
                         .append(" ").append(valorFormatado).append("\n");
            }
        }

        // Se sobrou de 1 a 4 centavos (como não temos mais moeda de 1 centavo no BR pode ignorar ou avisar)
        if (trocoCentavos > 0) {
            resultado.append("\n(Aviso: Sobraram ").append(trocoCentavos).append(" centavos que não podem ser devolvidos com as moedas atuais).");
        }

        return resultado.toString();
    }
}
