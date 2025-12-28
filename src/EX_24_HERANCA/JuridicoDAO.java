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
public class JuridicoDAO extends PessoaDAO{
     public String imprimejurudico (JuridicaDTO dto){
         return imprimedadospessoa(dto) + "\nO CNPJ é: " + dto.getCnpj() + 
                 "\nA inscrição estadual é: " + dto.getIe();
     }       
}
