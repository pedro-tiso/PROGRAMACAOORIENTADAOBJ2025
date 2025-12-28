/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_05_IF;

/**
 *
 * @author Aluno
 */
public class ClasseSolo {
    private double quantag;
    private String situacao;
    
    public  String classif (double quantag){
     this.quantag = quantag;
     
     if(this.quantag <= 10){
         this.situacao = "A situacao do solo é: Rochosa";
     }
     else if(this.quantag > 10 && this.quantag <= 40){
         this.situacao = "A situacao do solo é: Firme";
     }
     else if(this.quantag > 40 && this.quantag <= 80){
         this.situacao = "A situacao do solo é: Pantanosa";
     }
     else {
         this.situacao = "Quantidade de água inválida";
     }
     
     return this.situacao;
}
}
