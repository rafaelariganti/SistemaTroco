/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distribuicaotroco;

/**
 *
 * @author Rafaela
 */
public abstract class CalculadorTroco {
    protected SistemaMonetario sistemaMonetario;

    public CalculadorTroco(SistemaMonetario sistemaMonetario) {
        this.sistemaMonetario = sistemaMonetario;
    }

    // Método que as subclasses vão implementar
    public abstract String calcular(double valorCompra, double valorPago);
}
