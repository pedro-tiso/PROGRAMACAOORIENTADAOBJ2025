/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_08_FOR;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PrincipalIdades {
    public static void main (String args[]){
        Idades calc = new Idades();
        
        int i;
        
        for (i = 0 ; i < 20 ; i++){
            calc.recebe(
            Double.parseDouble(JOptionPane.showInputDialog("Qual sua altura?"))
            );
        }
        JOptionPane.showMessageDialog(null, 
                calc.mostra());
            
    }
}
