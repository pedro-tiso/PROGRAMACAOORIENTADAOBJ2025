/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_25_HERANCA;

/**
 *
 * @author pedro e paolo
 */
public class PessoaDAO {
    
    public String Mostra (PessoaDTO dto){
        return "Nome: " + dto.getNome() +
                "\nIdade: " + dto.getIdade() +
                "\nTelefone: " + dto.getEndereco() + 
                "\nEndereço: " + dto.getEndereco();
    } 
}
