/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_20_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class ClassifVIEW {
    public static void main (String args[]){
        ClassifCTR classifctr = new ClassifCTR();
        ClassifDTO classifdto = new ClassifDTO();
        
        try{
           classifdto.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
           classifdto.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Digite sua peso: ")));
           
           JOptionPane.showMessageDialog(null, classifctr.mostra(classifdto));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
