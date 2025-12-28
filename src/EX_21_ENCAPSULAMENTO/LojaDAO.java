/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_21_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class LojaDAO {
    private String resp;
    
    public void Registra (LojaDTO lojadto){
        
        switch(lojadto.getCod()){
            case 1: 
                lojadto.setH(lojadto.getH() + 1);
                lojadto.setVh(lojadto.getVh() + 1.5);
                
                lojadto.setValtotal(lojadto.getValtotal() + 1.5);
                
           break;
           
           case 2: 
                lojadto.setC(lojadto.getC() + 1);
                lojadto.setVc(lojadto.getVc() + 1);
                
                lojadto.setValtotal(lojadto.getValtotal() + 1);
                
           break;
           
           case 3: 
                lojadto.setM(lojadto.getM() + 1);
                lojadto.setVm(lojadto.getVm() + 1.20);
                
                lojadto.setValtotal(lojadto.getValtotal() + 1.2);
                
           break;
           
           case 4: 
                lojadto.setA(lojadto.getA() + 1);
                lojadto.setVa(lojadto.getVa() + 2);
                
                lojadto.setValtotal(lojadto.getValtotal() + 2);
                
           break;
           
           case 5: 
                lojadto.setQ(lojadto.getQ() + 1);
                lojadto.setVq(lojadto.getVq() + 1);
                
                lojadto.setValtotal(lojadto.getValtotal() + 1);
                
           break;
        }
    }
    
    public String mostra(LojaDTO dto){
         
        if(dto.getH() > 0){
            this.resp += "A quantidade de Hamburgeres foi: " + dto.getH() + "     R$" + dto.getVh();
        }
        if(dto.getC() > 0){
            this.resp += "\nA quantidade de Hamburgeres foi: " + dto.getC() + "     R$" + dto.getVc();
        }
        if(dto.getM() > 0){
            this.resp += "\nA quantidade de Hamburgeres foi: " + dto.getM() + "     R$" + dto.getVm();
        }
        if(dto.getA() > 0){
            this.resp += "\nA quantidade de Hamburgeres foi: " + dto.getA() + "     R$" + dto.getVa();
        }
        if(dto.getQ() > 0){
            this.resp += "\nA quantidade de Hamburgeres foi: " + dto.getQ() + "     R$" + dto.getVq();
        }
        this.resp += "\nO valor total foi: " + dto.getValtotal();
        
        return resp;
    }
            
}
