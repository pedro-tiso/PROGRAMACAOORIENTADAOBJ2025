/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_07_IF;

/**
 *
 * @author pedro e paolo
 */
public class Operacao {
    private double a,b;
    private String resul,op;
    
    public String calcula (double a, double b, String op){
        this.a = a;
        this.b = b;
        this.op = op;
        
        switch(this.op){
            case "A" : this.resul = "A soma resultou em " + (this.a + this.b);
              break;
            case "S" : this.resul = "A subtração resultou em " + (this.a - this.b);
              break;
            case "M" : this.resul = "A multiplicação resultou em " + (this.a * this.b);
              break;
            case "D" : this.resul = "A divisão resultou em " + (this.a / this.b);
              break;
            default: this.resul = "Operação inválida";
            }
    return resul;    
    }
    }

