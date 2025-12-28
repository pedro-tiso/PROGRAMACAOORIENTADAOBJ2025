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
public class MotoDTO extends VeiculoDTO{
    private int cilindrada;
    private String tpmotor;//2 tempos ou 4 tempos
    /**
     * @return the cilindrada
     */
    public int getCilindrada() {
        return cilindrada;
    }

    /**
     * @param cilindrada the cilindrada to set
     */
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    /**
     * @return the tpmotor
     */
    public String getTpmotor() {
        return tpmotor;
    }

    /**
     * @param tpmotor the tpmotor to set
     */
    public void setTpmotor(String tpmotor) {
        this.tpmotor = tpmotor;
    }
    
}
