/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_25_HERANCA;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PessoaVIEW {
    public static void main (String args[]){
        FuncionarioDTO dto = new FuncionarioDTO();
        FuncionarioCTR ctr = new FuncionarioCTR();
        
        dto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        dto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        dto.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        dto.setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
        dto.setFuncao(JOptionPane.showInputDialog("Digite sua função: "));
        dto.setSiape(JOptionPane.showInputDialog("Digite seu sipe: "));
        
        JOptionPane.showMessageDialog(null, ctr.retorna(dto));
        AlunoDTO adto = new AlunoDTO();
        AlunoCTR actr = new AlunoCTR();
        
        adto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        adto.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: ")));
        adto.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        adto.setTelefone(JOptionPane.showInputDialog("Digite seu telefone: "));
        adto.setPront(JOptionPane.showInputDialog("Digite seu prontuário: "));
        adto.setCurso(JOptionPane.showInputDialog("Digite seu curso: "));
        
        JOptionPane.showMessageDialog(null, actr.retorna(adto));
    } 
}
