/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_21_ENCAPSULAMENTO;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class LojaVIEW {
    public static void main (String args[]){
        LojaCTR ctr = new LojaCTR();
        LojaDTO dto = new LojaDTO();
        
        try{
            
            do{
                dto.setCod(Integer.parseInt(JOptionPane.showInputDialog("----Lanchonete----"
                                                                      + "\n------------------"
                                                                      + "\n1 - Hamburger - R$ 1,50"
                                                                      + "\n2 - Cheseburger - R$ 1,00"
                                                                      + "\n3 - Misto Quente - R$ 1,20"
                                                                      + "\n4 - Açai - R$ 2,00"
                                                                      + "\n5 - Queijo - R$ 1,00"
                                                                      + "\n------------------"
                                                                      + "\nDigite o código do que deseja comprar:"))
                );
            if(dto.getCod()!=0){
            ctr.registra(dto);
            }
           
            }
            while(dto.getCod()!=0);
            
            JOptionPane.showMessageDialog(null, ctr.mostrar(dto));
        }
        
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro no sistema:" + e.getMessage());
        }
        
    

    }
}