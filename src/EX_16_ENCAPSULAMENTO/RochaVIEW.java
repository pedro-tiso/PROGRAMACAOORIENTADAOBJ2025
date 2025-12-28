/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_16_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class RochaVIEW {
    public static void main (String args[]){
        RochaDTO rochadto = new RochaDTO();
        RochaCTR rochactr = new RochaCTR();
        try{
        rochadto.setQtdagua(Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de água presente no solo: ")));
        
        JOptionPane.showMessageDialog(null, rochactr.retornaclassif(rochadto));
        }
        
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    } 
}
