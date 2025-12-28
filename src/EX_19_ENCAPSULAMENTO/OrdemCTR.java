/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_19_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class OrdemCTR {
    OrdemDAO ordemdao = new OrdemDAO();
    
    public String mostra (OrdemDTO ordemdto){
        return ordemdao.retorna(ordemdto);
    }
}
