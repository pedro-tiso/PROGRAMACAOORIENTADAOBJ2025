/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_03_INTRODUCAO;

import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalFuncionario {
    public static void main (String agrs[]){
    Funcionario funcionario = new Funcionario();
    
    JOptionPane.showMessageDialog(null, "O salário final foi: " + 
        funcionario.calc(
        Double.parseDouble(JOptionPane.showInputDialog("Informe seu salário: ")),
        Double.parseDouble(JOptionPane.showInputDialog("Qual foi o aumento?"))
        ));
    }
}
