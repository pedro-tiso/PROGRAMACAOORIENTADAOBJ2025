/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_23_HERANCA;

/**
 *
 * @author pedro e paolo
 */
public class CarroDTO extends VeiculoDTO {
    private int potencia, qtdporta;
    /**
     * @return the potencia
     */
    public int getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the qtdporta
     */
    public int getQtdporta() {
        return qtdporta;
    }

    /**
     * @param qtdporta the qtdporta to set
     */
    public void setQtdporta(int qtdporta) {
        this.qtdporta = qtdporta;
    }
    
}
