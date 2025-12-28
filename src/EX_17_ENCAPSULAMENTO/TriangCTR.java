/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_17_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class TriangCTR {
    TriangDAO triangdao = new TriangDAO();
    
  
    public String mostra (TriangDTO triangdto){
        return triangdao.mostra(triangdto);
    }
}
