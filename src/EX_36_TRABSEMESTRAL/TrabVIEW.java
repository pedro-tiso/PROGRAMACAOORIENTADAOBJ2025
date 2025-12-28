/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_36_TRABSEMESTRAL;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class TrabVIEW {
    public static void main(String args[]){
        TrabDAO dao = new TrabDAO();
        
        JOptionPane.showMessageDialog(null, 
                dao.Calcula(
                Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário mínimo:")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas:")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas extras trabalhadas:"))));
    }
}
