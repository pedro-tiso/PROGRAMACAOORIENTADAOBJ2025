/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_14_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class FuncionarioVIEW {
    public static void main (String args[]){
        
        try{
            FuncinarioDTO funcionarioDTO = new FuncinarioDTO();
            FuncionarioCTR funcionarioCTR = new FuncionarioCTR();
            
            funcionarioDTO.setCod(Integer.parseInt(JOptionPane.showInputDialog("Digite o código: ")));
            funcionarioDTO.setTelefone(Integer.parseInt(JOptionPane.showInputDialog("Digite seu telefone")));
            
            JOptionPane.showMessageDialog(null, funcionarioCTR.mostrarCodTel(funcionarioDTO));
            
        }
        catch (Exception e ){
            JOptionPane.showMessageDialog(null, "Erro no sistema: " + e.getMessage());
        }
    }
}
