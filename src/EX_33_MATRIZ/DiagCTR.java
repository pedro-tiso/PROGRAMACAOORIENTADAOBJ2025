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
public class DiagCTR {
    DiagDAO dao = new DiagDAO();
    
    public String retorna (DiagDTO dto){
        return dao.mostra(dto);
    } 
    public String retornadiag (DiagDTO dto){
        return dao.mostradiag(dto);
    } 
}
