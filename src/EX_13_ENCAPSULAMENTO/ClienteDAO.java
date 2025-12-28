/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_13_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class ClienteDAO {
    public String mostrarNomeRG(ClienteDTO clienteDTO){
        return "O nome informado foi: " 
        + clienteDTO.getNome() + "\n o RG informado foi: "
        + clienteDTO.getRg();
    }

    public String mostrarNomeIdade(ClienteDTO clienteDTO){
        return "O nome informado foi: " 
        + clienteDTO.getNome() + "\n a idade informada foi: "
        + clienteDTO.getIdade();
    }


}