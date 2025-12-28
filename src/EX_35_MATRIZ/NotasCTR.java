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
public class NotasCTR {
    NotasDAO dao = new NotasDAO();
    
    public String retorna (NotasDTO dto){
        return dao.retorna(dto);
    }
}
