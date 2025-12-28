/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_19_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class OrdemVIEW {
    public static void main (String args[]){
        OrdemDTO ordemdto = new OrdemDTO();
        OrdemCTR ordemctr = new OrdemCTR();
        
        try{
            ordemdto.setN1(Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:")));
            ordemdto.setN2(Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:")));
            ordemdto.setN3(Integer.parseInt(JOptionPane.showInputDialog("Digite o terceiro número:")));
            
            JOptionPane.showMessageDialog(null, ordemctr.mostra(ordemdto));
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
