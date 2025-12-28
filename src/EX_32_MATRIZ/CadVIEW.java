/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_32_MATRIZ;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class CadVIEW {
    public static void main (String args[]){
        CadDTO dto = new CadDTO();
        CadCTR ctr = new CadCTR();
        
        String mat [][] = new String [5][2];
        
         for(int i = 0; i<5;i++){
            for (int j = 0; j<2; j++){
                 if(j!=1){
                    mat[i][j]=JOptionPane.showInputDialog("Digite o nome: ");
                 }
                 else{
                     mat[i][j]=JOptionPane.showInputDialog("Digite o endereço: ");
                 }
            }
        }
        dto.setCad(mat);
        JOptionPane.showMessageDialog(null, ctr.Retornacad(dto));
    }
}
