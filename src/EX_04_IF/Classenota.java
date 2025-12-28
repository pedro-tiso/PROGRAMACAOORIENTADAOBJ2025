/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_04_IF;

/**
 *
 * @author Aluno
 */
public class Classenota {
    
private double n1, n2, med;
private String situacao;

public String calc (double n1,double n2){
    
    this.n1 = n1;
    this.n2 = n2;
    
    this.med = (this.n1 + this.n2)/2;
    
    if(this.med >= 6){
        
        this.situacao = "Aprovado";
    }
    else {
        if(this.med >= 4 && this.med <6){
            this.situacao = "Recuperação";
        }
        else{
            this.situacao =  "Reprovado";
        }
    }
    return this.situacao;
}
        
    }
 