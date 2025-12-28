/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_06_IF;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class Principaltriangulo {
    public static void main (String args[]){
        Triangulocalc calc = new Triangulocalc();
        
        JOptionPane.showMessageDialog(null, 
                calc.mostra
                (Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do 1° lado do triângulo?")),
                 Integer.parseInt(JOptionPane.showInputDialog("Qual o valor do 2° lado do triângulo?")),
                 Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da base do triângulo?"))
                )
        );
    }
}
