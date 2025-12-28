/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_30_INTERFACE;

/**
 *
 * @author pedro e paolo
 */
public class CasaCTR {
    CasaDAO dao = new CasaDAO();
    
    public String Mostra (CasaDTO dto){
        return dao.Mostra(dto);
    }
}
