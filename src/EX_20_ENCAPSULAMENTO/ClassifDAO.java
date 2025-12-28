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
public class ClassifDAO {
    private String resp;
    
    public String retorna(ClassifDTO classifdto){
        if(classifdto.getAltura() < 1.20){
            if(classifdto.getPeso()<=60){
                this.resp = "Sua faixa de classificação é A";
            }
            else if(classifdto.getPeso()>60 && classifdto.getPeso()<=90 ){
                this.resp = "Sua faixa de classificação é D";
            }
            else{
                 this.resp = "Sua faixa de classificação é G";
            }
        }
        
        else if(classifdto.getAltura() >= 1.20 &&  classifdto.getAltura() < 1.70 ){
            if(classifdto.getPeso()<=60){
                this.resp = "Sua faixa de classificação é B";
            }
            else if(classifdto.getPeso()>60 && classifdto.getPeso()<=90 ){
                this.resp = "Sua faixa de classificação é E";
            }
            else{
                 this.resp = "Sua faixa de classificação é H";
            }
        }
        else {
            if(classifdto.getPeso()<=60){
                this.resp = "Sua faixa de classificação é C";
            }
            else if(classifdto.getPeso()>60 && classifdto.getPeso()<=90 ){
                this.resp = "Sua faixa de classificação é F";
            }
            else{
                 this.resp = "Sua faixa de classificação é I";
            }
        }
        return this.resp;
    }
}
