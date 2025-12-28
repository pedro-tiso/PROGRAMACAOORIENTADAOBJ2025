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
public class VetorCTR {
    VetorDAO dao = new VetorDAO();
    
    public String verificaPosicao (VetorDTO dto){
        return dao.verificaPosicao(dto);
    }
}
