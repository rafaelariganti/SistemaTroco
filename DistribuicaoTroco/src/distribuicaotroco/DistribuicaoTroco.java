/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package distribuicaotroco;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafaela
 */
public class DistribuicaoTroco {
     public static void main(String[] args) {
        // Instancia o padrão Bridge 
        // Abstração (Calculador) + Implementação (Real Brasileiro)
        SistemaMonetario moedaReal = new RealBrasileiro();
        CalculadorTroco maquinaDeTroco = new CalculadorTrocoMinimo(moedaReal);

        try {
            // Recebe dados do usuário
            String inputCompra = JOptionPane.showInputDialog(null, "Digite o valor da compra (Ex: 35.50):", "Caixa", JOptionPane.QUESTION_MESSAGE);
            if (inputCompra == null) return; // Usuário cancelou
            
            String inputPago = JOptionPane.showInputDialog(null, "Digite o valor pago pelo cliente (Ex: 50.00):", "Caixa", JOptionPane.QUESTION_MESSAGE);
            if (inputPago == null) return; // Usuário cancelou

            // Converte strings para double (trocando vírgula por ponto caso o usuário digite padrão PT-BR)
            double valorCompra = Double.parseDouble(inputCompra.replace(",", "."));
            double valorPago = Double.parseDouble(inputPago.replace(",", "."));

            // Calcula o troco
            String cupomDeTroco = maquinaDeTroco.calcular(valorCompra, valorPago);

            // Exibe o resultado
            JOptionPane.showMessageDialog(null, cupomDeTroco, "Resultado do Troco", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, digite apenas números válidos usando ponto ou vírgula.", "Erro de Entrada", JOptionPane.ERROR_MESSAGE);
        }
    }
}
