/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_30_INTERFACE;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class ImovelVIEW {
    public static void main (String args[]){
        CasaDTO dto = new CasaDTO();
        CasaCTR ctr = new CasaCTR();
        try{
        dto.setEndereco(JOptionPane.showInputDialog("Digite o endereço do ímovel: "));
        dto.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Digite o número do imóvel: ")));
        dto.setBairro(JOptionPane.showInputDialog("Digite o bairro do ímovel: "));
        dto.setCidade(JOptionPane.showInputDialog("Digite o cidade do ímovel: "));
        dto.setProprietario(JOptionPane.showInputDialog("Digite o nome do proprietário do ímovel: "));
        dto.setQuartos(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de quartos do imóvel: ")));
        dto.setBanheiros(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de banheiros do imóvel?")));
        
        
        JOptionPane.showMessageDialog(null, ctr.Mostra(dto));
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"ERRO NO SISTEMA: " + e);
        }
    }
}
