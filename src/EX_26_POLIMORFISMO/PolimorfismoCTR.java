/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_26_POLIMORFISMO;

/**
 *
 * @author pedro e paolo
 */
public class PolimorfismoCTR {
    PolimorfismoDAO dao = new  PolimorfismoDAO();
    
    public String Retorna (PolimorfismoDTO dto){
        return dao.Mostra(dto);
    }
}
