/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_36_TRABSEMESTRAL;

/**
 *
 * @author pedro e paolo
 */
public class TrabDTO {
    private int horas;
    private double sal, valhora;
    private double salmin;
    /**
     * @return the valhora
     */
    public double getValhora() {
        return valhora;
    }

    /**
     * @param valhora the valhora to set
     */
    public void setValhora(double valhora) {
        this.valhora = valhora;
    }
    /**
     * @return the horas
     */
    public int getHoras() {
        return horas;
    }

    /**
     * @param horas the horas to set
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * @return the sal
     */
    public double getSal() {
        return sal;
    }

    /**
     * @param sal the sal to set
     */
    public void setSal(double sal) {
        this.sal = sal;
    }

    /**
     * @return the salmin
     */
    public double getSalmin() {
        return salmin;
    }

    /**
     * @param salmin the salmin to set
     */
    public void setSalmin(double salmin) {
        this.salmin = salmin;
    }
    
}
