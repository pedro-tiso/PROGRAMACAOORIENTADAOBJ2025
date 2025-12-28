/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_22_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PesquisaVIEW {
    public static void main (String args[]){
        
        PesquisaDAO dao = new PesquisaDAO();
        PesquisaDTO dto = new PesquisaDTO();
        PesquisaCTR ctr = new PesquisaCTR();
        
        do{
            dto.setSexo(JOptionPane.showInputDialog("Qual o sexo do habitante?"));
            dto.setSal(Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do habitante")));
            ctr.Calcula(dto);
            dto.setCont(JOptionPane.showInputDialog("Deseja inserir mais habitantes?"));
        }
        while(dto.getCont().equalsIgnoreCase("S"));
        JOptionPane.showMessageDialog(null, ctr.Mostra(dto));
    }
}
