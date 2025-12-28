/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_35_MATRIZ;

/**
 *
 * @author pedro e paolo
 */
public class NotasDAO {
    String resp = "";
    double acum = 0;
    
    public String retorna (NotasDTO dto){
        double mat [][] = dto.getNot();
        
        for(int i = 0; i<20; i++){
            for(int j = 0; j<5; j++){
             if(j!=4){
                 this.resp+= mat[i][j] + " ";
                 this.acum+= mat[i][j];
             }
             else{
                 mat[i][j] = acum/4;
                 this.resp+= "   " + mat[i][j];
             }
            }
            this.acum = 0;
            this.resp+="\n";
        }
        return this.resp;
    }
}
