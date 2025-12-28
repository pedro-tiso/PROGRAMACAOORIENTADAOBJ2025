/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_04_IF;
import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class IF_PRINCIPAL {
    public static void main (String args[]){
        Classenota ifprincipal = new Classenota();
        
        JOptionPane.showMessageDialog(null, "Sua situação é: " + 
                ifprincipal.calc(
                        
                Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: ")),
                Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "))
                ));
        
    }
}
