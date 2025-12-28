/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_12_TRY_CATCH;

/**
 *
 * @author pedro e paolo
 */
public class Tabuada {
    private int numero;
    private String resp ="";
    
    public String calcular (int numero){
        
        try{
            this.numero = numero;
            for(int cont  = 0; cont <10; cont++){
                this.resp += this.numero + " x " + cont + " = " + this.numero*cont+"\n";
            }
            return this.resp;
        }
        catch (Exception e){
            return this.resp;
        }
    }
}
