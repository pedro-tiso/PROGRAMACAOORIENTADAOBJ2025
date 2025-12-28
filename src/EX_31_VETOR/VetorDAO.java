/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_31_VETOR;

/**
 *
 * @author pedro e paolo
 */
public class VetorDAO {
    private String resp="";
    
    public String verificaPosicao (VetorDTO dto){
        int n[] = dto.getN();
        
        for(int cont=0 ; cont < n.length; cont++){
            if(cont % 2 == 0){
                this.resp += n[cont] + "\n";
            }
        }
        return this.resp;
    }
}
