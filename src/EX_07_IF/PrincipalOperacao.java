/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_07_IF;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PrincipalOperacao {
     public static void main (String args[]){
      Operacao calc = new Operacao();
      
      JOptionPane.showMessageDialog(null, 
              calc.calcula(
              Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:")),
              Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número:")),
              JOptionPane.showInputDialog("Qual operação deseja realizar? A-para adição, S-para subtração, M-para multiplicação, D-para divisão.")
              ));
    }
}
