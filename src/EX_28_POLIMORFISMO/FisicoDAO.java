/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_28_POLIMORFISMO;

/**
 *
 * @author pedro e paolo
 */
public class FisicoDAO extends ClienteDAO {
    public String imprimedadospessoa (FisicoDTO dto){
        return super.imprimedadospessoa(dto) +  "\nO CPF é: " + dto.getCpf() +
                "\nO RG é: " + dto.getRg();
    }
}
