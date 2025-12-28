/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_11_WHILE;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class Principalletras {
    public static void main (String args[]){
        Letras let = new Letras();
        String letra;
        
        letra = JOptionPane.showInputDialog("Digite uma letra");
        
        while(!letra.equalsIgnoreCase("0")){
           let.conta(letra);
           JOptionPane.showInputDialog("Digite uma letra: ");
        }
        let.mostra();
    }
}
