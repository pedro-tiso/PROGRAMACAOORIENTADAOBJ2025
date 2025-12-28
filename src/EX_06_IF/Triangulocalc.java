/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_06_IF;

/**
 *
 * @author pedro e paolo
 */
public class Triangulocalc {
    private int a,b,c;
    private String resp;
    
    public String mostra (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        
        if((this.a + this.b)< this.c){
            this.resp = "Os lados apresentados não formam um triângulo.";
        }
        else{
            if(this.a == this.b && this.a == this.c && this.b == this.c){
                this.resp = "O triângulo é Equilátero.";
            }
            else if (this.a == this.b || this.a == this.c || this.b == this.c){
                this.resp = "O triângulo é Isóceles.";
            }
            else if(this.a != this.b && this.a != this.c && this.b != this.c){
                this.resp = "O triângulo é Escaleno.";
            }
        }
       return resp;
    }
}
