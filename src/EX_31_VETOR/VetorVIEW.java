/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_31_VETOR;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class VetorVIEW {
    public static void main (String args[]){
        VetorDTO dto = new VetorDTO();
        VetorCTR ctr = new VetorCTR();
        
        int num[] = new int [5];
        
        for(int cont = 0; cont < 5; cont++){
            num[cont] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a posição " + (cont+1)));
            
        }
        dto.setN(num);
        JOptionPane.showMessageDialog(null, ctr.verificaPosicao(dto));
    }
}
