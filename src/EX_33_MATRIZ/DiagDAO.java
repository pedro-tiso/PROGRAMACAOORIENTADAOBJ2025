/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_33_MATRIZ;

/**
 *
 * @author pedro e paolo
 */
public class DiagDAO {
    String resp1 ="", resp2 ="";
    
    public String mostra (DiagDTO dto){
        int mat[][] = dto.getMat();
        
       for (int i = 0; i<20 ; i++){
            for(int j=0 ; j<20 ; j++){
                this.resp1 += mat[i][j] + " ";
            }
            this.resp1 += "\n";
        }
        return this.resp1;
    }
    
     public String mostradiag (DiagDTO dto){
        int mat[][] = dto.getMat();
        
       for (int i = 0; i<20 ; i++){
            for(int j=0 ; j<20 ; j++){
                if(i==j){
                this.resp2 += mat[i][j];
                }
                else{
                this.resp2+=" ";}
                                    }
            
                   this.resp2 += "\n"; 
                                 }
            return this.resp2;
                                           }
        }
        

