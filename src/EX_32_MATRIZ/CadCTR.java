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
public class CadCTR {
    CadDAO dao = new CadDAO();
    
    public String Retornacad (CadDTO dto){
        return dao.Retornacad(dto);
    }
}
