/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_32_MATRIZ;

/**
 *
 * @author pedro e paolo
 */
public class CadDAO {
    String resp="";
    
    public String Retornacad (CadDTO dto){
        String cad [][] = dto.getCad();
        
        for (int i = 0; i<5 ; i++){
            for(int j=0 ; j<2 ; j++){
                this.resp += cad[i][j] + " ";
            }
            this.resp += "\n";
        }
        return this.resp;
    }
}
