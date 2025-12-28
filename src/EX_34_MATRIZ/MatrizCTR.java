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
public class MatrizCTR {
    MatrizDAO dao = new MatrizDAO();
    
    
    public String retorna (MatrizDTO dto){
        return dao.Retorna(dto);
    }
}
