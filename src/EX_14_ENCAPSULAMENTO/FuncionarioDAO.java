/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_14_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class FuncionarioDAO {
    
    public String MostrarCodigoTelefone(FuncinarioDTO funcionarioDTO){
        return "O código informado foi: " + funcionarioDTO.getCod() + "\n o telefone informado foi: "
                + funcionarioDTO.getTelefone();
    }
}
