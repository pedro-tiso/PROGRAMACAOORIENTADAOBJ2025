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
public class FisicaDAO extends PessoaDAO{
    
    public String imprimefisica (FisicaDTO dto){
        return imprimedadospessoa(dto) +  "\nO CPF é: " + dto.getCpf() +
                "\nO RG é: " + dto.getRg();
    }
}
