/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_05_IF;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class SoloPrincipal {
    public static void main (String args[]){
        ClasseSolo solo = new ClasseSolo();
        
        JOptionPane.showMessageDialog(null, 
                solo.classif(
                Double.parseDouble(JOptionPane.showInputDialog("Qual a pontuação de água presente na amostra?"))
                )
                );
    }
    
}
