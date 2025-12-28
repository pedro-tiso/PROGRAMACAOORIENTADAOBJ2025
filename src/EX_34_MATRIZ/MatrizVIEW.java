/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_34_MATRIZ;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class MatrizVIEW {
    public static void main (String args[] ){
        MatrizDTO dto = new MatrizDTO();
        MatrizCTR ctr = new MatrizCTR();
        
        int mat [][] = new int [2][3];
        
        for(int i = 0; i<2;i++){
            for (int j = 0; j<3; j++){
                 mat[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Informe o número da linha " + i + " e da coluna " + j + " :"));
            }
        }
        dto.setMat(mat);
        JOptionPane.showMessageDialog(null, ctr.retorna(dto));
    }
}
