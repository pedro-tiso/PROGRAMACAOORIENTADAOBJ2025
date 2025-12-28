/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_22_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class PesquisaCTR {
    PesquisaDAO dao = new PesquisaDAO();
    
    public void Calcula(PesquisaDTO dto){
        dao.Acumula(dto);
    }
    
    public String Mostra (PesquisaDTO dto){
        return dao.mostra(dto);
    }
}
