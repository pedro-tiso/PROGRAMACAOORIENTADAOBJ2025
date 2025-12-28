/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_09_FOR;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author pedro e paolo
 */
public class PrincipalSalario {
    public static void main (String args []){
        DecimalFormat formatando = new DecimalFormat("##, ###.00");
        Salario atual = new Salario ();
        
        JOptionPane.showMessageDialog(null, "Seu salário é : R$  " +
               String.format("%.2f", atual.calc(
                Integer.parseInt(JOptionPane.showInputDialog("Em qual ano estamos?"))
                )
               ));
    }
}
