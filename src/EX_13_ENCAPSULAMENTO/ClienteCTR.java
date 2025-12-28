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
public class ClienteCTR {
    ClienteDAO clienteDAO = new ClienteDAO ();
    
    public String mostrarNomeRg (ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeRG(clienteDTO);
    }
    
    public String mostrarNomeIDADE (ClienteDTO clienteDTO){
        return clienteDAO.mostrarNomeIdade(clienteDTO);
    }
}
