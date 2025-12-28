/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_29_INTERFACE;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class MotoristaView {
    public static void main (String args[]){
        try{
        MotoristaDTO dto = new MotoristaDTO();
        MotoristaCTR ctr = new MotoristaCTR();
        
        dto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Qual a sua idade?")));
        
        JOptionPane.showMessageDialog(null, ctr.Verifica(dto));
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e);
        }
    }
}
