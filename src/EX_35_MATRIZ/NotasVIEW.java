/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_35_MATRIZ;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro e paolo
 */
public class NotasVIEW {
    public static void main (String args[]){
        NotasDTO dto = new NotasDTO();
        NotasCTR ctr = new NotasCTR();
        
        double mat [][] = new double [4][5];
        
         for(int i = 0; i<20;i++){
            for (int j = 0; j<5; j++){
                if(j!=4){
                mat[i][j] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (j+1) + " :"));
                        }
                }
        }
        dto.setNot(mat);
        JOptionPane.showMessageDialog(null, ctr.retorna(dto));
    }
}
