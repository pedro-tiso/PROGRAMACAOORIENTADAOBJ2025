/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_24_HERANCA;

/**
 *
 * @author pedro e paolo
 */
public class PessoaDAO {
    
    public String imprimedadospessoa (PessoaDTO dto){
        return "Nome: " + dto.getNome() +
                "\nEndereço: " + dto.getEndereco() + 
                "\nCidade: " + dto.getCidade() + 
                "\nEstado: "+ dto.getEstado() + 
                "\nNumero: "+ dto.getNumero();
    }
}
