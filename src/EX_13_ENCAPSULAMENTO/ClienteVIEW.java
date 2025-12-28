/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_13_ENCAPSULAMENTO;
import javax.swing.JOptionPane;
/**
 *
 * @author pedro e paolo
 */
public class ClienteVIEW {
    public static void main (String args[]){
        try{
    ClienteDTO clienteDTO = new ClienteDTO();
    ClienteCTR clienteCTR = new ClienteCTR();
    
    clienteDTO.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
    clienteDTO.setRg(JOptionPane.showInputDialog("Digite seu RG: "));
    clienteDTO.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
    
    JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeRg(clienteDTO));
    JOptionPane.showMessageDialog(null, clienteCTR.mostrarNomeIDADE(clienteDTO));
    }
    catch (Exception e){
        JOptionPane.showMessageDialog(null, "Erro no sitema: " + e.getMessage());
    }    
}


}


