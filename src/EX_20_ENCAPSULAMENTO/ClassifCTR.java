/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_20_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class ClassifCTR {
    ClassifDAO classifdao = new ClassifDAO();
    
    public String mostra (ClassifDTO classifdto){
        return classifdao.retorna(classifdto);
    }
}
