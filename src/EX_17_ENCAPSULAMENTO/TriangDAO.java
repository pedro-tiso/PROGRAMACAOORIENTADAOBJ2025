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
public class TriangDAO {
    private String resp1, resp2;
    
    public boolean verifica (TriangDTO triangdto){
        if ((triangdto.getL1() + triangdto.getL2()) > triangdto.getL3()){
            return true;
        }
        else{
            return false;
        }
       
    }
    
    public String mostra (TriangDTO triangdto){
      
        if(verifica(triangdto)){
        if((triangdto.getL1() == triangdto.getL2()) && (triangdto.getL2() == triangdto.getL3())){
            this.resp2 = "O triângulo é equilátero.";
            
        }
        else if((triangdto.getL1() == triangdto.getL2()) || (triangdto.getL1() == triangdto.getL3())){
            this.resp2 = "O triângulo é isóceles.";
            
        }
        else if((triangdto.getL1() != triangdto.getL2()) && (triangdto.getL1() != triangdto.getL3())){
            this.resp2 = "O triângulo é escaleno.";
            
        }
        }
        else{
            this.resp2 = "Os lados informados não formam um triângulo;";
        }
        return this.resp2;
    }
    
}
