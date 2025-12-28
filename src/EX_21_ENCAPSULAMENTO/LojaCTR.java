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
public class LojaCTR {
    LojaDAO lojadao = new LojaDAO ();
    
    public void registra(LojaDTO dto) {
        lojadao.Registra(dto); // repassa o objeto dto para o DAO
    }
    public String mostrar (LojaDTO dto){
        return lojadao.mostra(dto);
    }
}
