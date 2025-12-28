/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_33_MATRIZ;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class DiagVIEW {
    public static void main (String args[]){
        DiagDTO dto = new DiagDTO();
        DiagCTR ctr = new DiagCTR();
        
        int mat[][] = new int [20][20];
        
        for(int i = 0; i <20 ; i++){
            for(int j = 0; j <20 ; j++){
               mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para linha " + (i+1) + " e coluna " + (j+1) + " :" ));
              
            }
        }
        
        dto.setMat(mat);
        
        JOptionPane.showMessageDialog(null, ctr.retorna(dto));
        JOptionPane.showMessageDialog(null, ctr.retornadiag(dto));
    }
}
