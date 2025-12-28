/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_08_FOR;

/**
 *
 * @author pedro e paolo
 */
public class Idades {
    private double idade, acum, maior;
    private double media;
    public void recebe (double idade){
    this.idade = idade;
    this.acum = acum;
    this.maior = maior;
    
    this.acum += this.idade;
    
    if(this.idade > 2){
        this.maior ++;
    }
    
}
    public double mediaa (){
        this.media = media;
        
        this.media = this.acum/20;
        
        return this.media;
    }
    
    public String mostra (){
        this.media = mediaa();
        return "A média das alturas foi: " + this.media + " e a quantidade de alunos maiores que 2 metros foi " + this.maior;
    }
}
