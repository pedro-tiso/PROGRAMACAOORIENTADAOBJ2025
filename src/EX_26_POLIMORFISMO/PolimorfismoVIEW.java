/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_26_POLIMORFISMO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PolimorfismoVIEW {
    public static void main (String args[]){
        
        PolimorfismoDTO dto = new PolimorfismoDTO();
        PolimorfismoCTR ctr = new PolimorfismoCTR();
        
        dto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        dto.setRg(JOptionPane.showInputDialog("Digite seu RG: "));
        dto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        dto.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: ")));
        
        JOptionPane.showMessageDialog(null, ctr.Retorna(dto));
    }
}
