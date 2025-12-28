/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_10_WHILE;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PrincipalWhile {
    public static void main (String args[]){
    Exemplowhile1 ex = new Exemplowhile1();
   String letra;
   letra = JOptionPane.showInputDialog("Informe a letra");
   
   while(letra.equalsIgnoreCase("x")){
       ex.verificar(letra);
       letra = JOptionPane.showInputDialog("Informe a letra");
   }
   JOptionPane.showMessageDialog(null, ex.mostra());
    }
}
