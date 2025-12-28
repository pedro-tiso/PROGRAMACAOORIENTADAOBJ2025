/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_23_HERANCA;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class VeiculoVIEW {
    public static void main (String args[]){
    CarroDTO dto = new CarroDTO ();
    CarroCTR ctr = new CarroCTR();
    
    dto.setPlaca(JOptionPane.showInputDialog("Informe a placa: "));
    dto.setCor(JOptionPane.showInputDialog("Informe a cor: "));
    dto.setPotencia(Integer.parseInt(JOptionPane.showInputDialog("Informe a potência: ")));
    dto.setQtdporta(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de portas: ")));
    
    JOptionPane.showMessageDialog(null, ctr.imprimedadoscarro(dto));
    
    MotoDTO mdto = new MotoDTO ();
    MotoCTR mctr = new MotoCTR();
    
    mdto.setPlaca(JOptionPane.showInputDialog("Informe a placa: "));
    mdto.setCor(JOptionPane.showInputDialog("Informe a cor: "));
    mdto.setCilindrada(Integer.parseInt(JOptionPane.showInputDialog("Informe a cilindrada: ")));
    mdto.setTpmotor(JOptionPane.showInputDialog("Informe o tipo do motor (2 tempos ou 4 tempos): "));
    
    JOptionPane.showMessageDialog(null, mctr.imprimedadosmoto(mdto));
}
}

