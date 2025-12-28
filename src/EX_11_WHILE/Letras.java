/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_11_WHILE;

/**
 *
 * @author pedro e paolo
 */
public class Letras {
    private String letra;
    private int qtdc,qtdv;
    private String resp;
    
    public void conta(String letra){
        this.letra = letra;
        this.qtdv = qtdv;
        if(this.letra.equalsIgnoreCase("a")||
          this.letra.equalsIgnoreCase("e")||
          this.letra.equalsIgnoreCase("i")||
          this.letra.equalsIgnoreCase("o")||
          this.letra.equalsIgnoreCase("u") 
          ){
            this.qtdv++;
        }
        else if(!this.letra.equalsIgnoreCase("0")){
            this.qtdc++;
        }
        
}
    public String mostra (){
        return resp = "O número de vogais é: " + qtdv + "O número de consoantes é: " + qtdc; 
    }
}
