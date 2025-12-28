/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_34_MATRIZ;

/**
 *
 * @author pedro e paolo
 */
public class MatrizDAO {
    String resposta = "";
    public String Retorna (MatrizDTO dto){
        int mat [][] = dto.getMat();
        
        for(int i = 0; i<2;i++){
            for (int j = 0; j<3; j++){
                this.resposta += mat[i][j] + " ";
            }
            this.resposta += "\n";
        }
        return this.resposta;
    }
}
