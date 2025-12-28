/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_18_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class NumDAO {
    private String resp;
    
    public String retorna (NumDTO numdto){
        
        if(numdto.getN3()<= numdto.getN4()){
            this.resp = numdto.getN4() + "," + numdto.getN3() + "," + numdto.getN2() + "," + numdto.getN1();
        }
        else if(numdto.getN3()>=numdto.getN4() && numdto.getN2() < numdto.getN4()){
            this.resp = numdto.getN3() + "," + numdto.getN4() + "," + numdto.getN2() + "," + numdto.getN1();
        }
        else if(numdto.getN2()>=numdto.getN4() && numdto.getN1() <= numdto.getN4()){
            this.resp = numdto.getN3() + "," + numdto.getN2() + "," + numdto.getN4() + "," + numdto.getN1();
        }
        else{
            this.resp = numdto.getN3() + "," + numdto.getN2() + "," + numdto.getN1() + "," + numdto.getN4();
        }
        return resp;
    }
}
