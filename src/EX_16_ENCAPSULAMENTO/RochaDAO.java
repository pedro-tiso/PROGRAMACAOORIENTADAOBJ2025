/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_16_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class RochaDAO {
    private String resp;
    
    public String retornaclassif (RochaDTO rochadto){
        
        if(rochadto.getQtdagua() <= 10){
            this.resp = "A solo é rochoso";
        }
        else if(rochadto.getQtdagua() > 10 && rochadto.getQtdagua()<=40){
            this.resp = "O solo é firme";
        }
        else if(rochadto.getQtdagua() > 40 && rochadto.getQtdagua()<=80){
            this.resp = "O solo é Pantanoso";
        }
        else {
            this.resp = "Quantidade de água inválida.";
        }
        return this.resp;
    }
}
