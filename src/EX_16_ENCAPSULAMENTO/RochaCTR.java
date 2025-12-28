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
public class RochaCTR {
    RochaDAO rochadao = new RochaDAO();
    
    public String retornaclassif (RochaDTO rochadto){
        return rochadao.retornaclassif(rochadto);
    }
}
