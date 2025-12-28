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
public class OrdemDAO {
    private String resp;
    
    public String retorna (OrdemDTO ordemdto){
        
        if(ordemdto.getN1() > ordemdto.getN2() && ordemdto.getN2()>ordemdto.getN3()){
            this.resp = "Na ordem crescente fica: " + ordemdto.getN1() + ", " + ordemdto.getN2()+ ", " + ordemdto.getN3();
        }
        else  if(ordemdto.getN1() > ordemdto.getN2() && ordemdto.getN2()<ordemdto.getN3()){
            this.resp = "Na ordem crescente fica: " + ordemdto.getN1() + ", " + ordemdto.getN3()+ ", " + ordemdto.getN2();
        }
        
        else if(ordemdto.getN2() > ordemdto.getN1() && ordemdto.getN1()>ordemdto.getN3()){
            this.resp = "Na ordem crescente fica: " + ordemdto.getN2() + ", " + ordemdto.getN1()+ ", " + ordemdto.getN3();
        }
        else if(ordemdto.getN2() > ordemdto.getN1() && ordemdto.getN1()<ordemdto.getN3()){
            this.resp = "Na ordem crescente fica: " + ordemdto.getN2() + ", " + ordemdto.getN3()+ ", " + ordemdto.getN1();
        }
        
        else if(ordemdto.getN3() > ordemdto.getN1() && ordemdto.getN1()>ordemdto.getN2()){
            this.resp = "Na ordem crescente fica: " + ordemdto.getN3() + ", " + ordemdto.getN1()+ ", " + ordemdto.getN2();
        }
        else if(ordemdto.getN3() > ordemdto.getN1() && ordemdto.getN1()<ordemdto.getN2()){
            this.resp = "Na ordem crescente fica: " + ordemdto.getN3() + ", " + ordemdto.getN2()+ ", " + ordemdto.getN1();
        }
    return this.resp;
}
}