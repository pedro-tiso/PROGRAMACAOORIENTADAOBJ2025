/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_28_POLIMORFISMO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class ClienteVIEW {
    public static void main (String args[]){
        FisicoDTO dto = new FisicoDTO();
        FisicoCTR ctr = new FisicoCTR();
        
        dto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        dto.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        dto.setCidade(JOptionPane.showInputDialog("Digite sua cidade:"));
        dto.setEstado(JOptionPane.showInputDialog("Digite seu estado: "));
        dto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número de telefone: ")));
        dto.setRg(Integer.parseInt(JOptionPane.showInputDialog("Digite seu RG: ")));
        dto.setCpf(Integer.parseInt(JOptionPane.showInputDialog("Digite seu CPF: ")));
        
        JOptionPane.showMessageDialog(null, ctr.RetornaFisico(dto));
        
        JuridicoDTO jdto = new JuridicoDTO();
        JuridicoCTR jctr = new JuridicoCTR();
        
        jdto.setNome(JOptionPane.showInputDialog("Digite seu nome: "));
        jdto.setEndereco(JOptionPane.showInputDialog("Digite seu endereço: "));
        jdto.setCidade(JOptionPane.showInputDialog("Digite sua cidade:"));
        jdto.setEstado(JOptionPane.showInputDialog("Digite seu estado: "));
        jdto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite seu número de telefone: ")));
        jdto.setCnpj(Integer.parseInt(JOptionPane.showInputDialog("Digite seu CNPJ: ")));
        jdto.setIe(Integer.parseInt(JOptionPane.showInputDialog("Digite sua inscrição estadual: ")));
        
        JOptionPane.showMessageDialog(null, jctr.retornajuridico(jdto));
        
        
    }
}
