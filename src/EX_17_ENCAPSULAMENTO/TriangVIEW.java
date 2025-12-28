/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_17_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class TriangVIEW {
    public static void main (String args[]){
        TriangDTO triangdto = new TriangDTO();
        TriangCTR triangctr = new TriangCTR();
        try{
        triangdto.setL1(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 1: ")));
        triangdto.setL2(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 2: ")));
        triangdto.setL3(Integer.parseInt(JOptionPane.showInputDialog("Digite o lado 3: ")));
     
        JOptionPane.showMessageDialog(null, triangctr.mostra(triangdto));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
