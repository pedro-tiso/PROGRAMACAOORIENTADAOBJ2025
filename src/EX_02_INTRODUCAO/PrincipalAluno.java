/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_02_INTRODUCAO;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class PrincipalAluno {
    public static void main (String agrs[]){
        
        Aluno aluno = new Aluno();
        
        JOptionPane.showMessageDialog(null, "A média final é: " + 
        aluno.calc(
                
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 1: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 2: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Informe a nota 3: ")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 1")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 2")),
                Integer.parseInt(JOptionPane.showInputDialog("Informe o peso 3"))
        ));
        
    }
    
}
