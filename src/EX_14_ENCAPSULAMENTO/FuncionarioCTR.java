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
public class FuncionarioCTR {
    FuncionarioDAO funcionarioDAO= new FuncionarioDAO();
    
    public String mostrarCodTel (FuncinarioDTO funcionarioDTO){
        return funcionarioDAO.MostrarCodigoTelefone(funcionarioDTO);
    }
}
