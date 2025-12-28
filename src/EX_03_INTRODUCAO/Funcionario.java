/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_03_INTRODUCAO;

/**
 *
 * @author Aluno
 */
public class Funcionario {
    private double sal, aument, fim;
    
    public double calc (double sal, double aument){
        this.sal = sal;
        this.aument = aument;
        
        this.fim = this.sal * (1+(this.aument/100));
        
        return this.fim;
    }
}
