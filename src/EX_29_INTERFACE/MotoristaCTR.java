/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_29_INTERFACE;

/**
 *
 * @author pedro e paolo
 */
public class MotoristaCTR {
    MotoristaDAO dao = new MotoristaDAO();
    
    public String Verifica (MotoristaDTO dto){
        return dao.Verifica(dto);
    }
}
