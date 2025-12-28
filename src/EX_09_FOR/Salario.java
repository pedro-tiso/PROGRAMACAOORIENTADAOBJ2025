/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_09_FOR;

/**
 *
 * @author pedro e paolo
 */
public class Salario {
    private double salario, aument;
    private int ano;
    private String resp;
    public double calc(int ano){
        int i;
        this.ano = ano;
        this.salario = salario;
        this.salario = 1000;
        this.aument = aument;
        this.aument = 0.015;
        if (this.ano == 2010){
            resp = "Seu salário é R$ 1000,00";
        }
        else{
            for (i = 0 ; i < this.ano - 2010 ; i++ ){
                this.salario = this.salario*(1 +aument);
                this.aument = this.aument * 2;
            }
            this.resp = "Seu salário é R$ " + this.salario;
        }
    return salario;
    }
}
