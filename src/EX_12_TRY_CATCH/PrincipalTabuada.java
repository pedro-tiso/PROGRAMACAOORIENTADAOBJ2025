/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_12_TRY_CATCH;

import javax.swing.JOptionPane;

/**
 *
 * @author pedro e paolo
 */
public class PrincipalTabuada {
    public static void main (String args[]){
        try{
        Tabuada tab = new Tabuada ();
        JOptionPane.showMessageDialog(null, 
                tab.calcular(
                Integer.parseInt(JOptionPane.showInputDialog("Informe o número: "))
                
                )
        );
        }
        
        catch (Exception e){
        JOptionPane.showMessageDialog(null, "Erro 001 - Apenas números devem ser informados.");
        System.out.print("Erro: "+ e.getMessage());
        }   
        finally{
            JOptionPane.showMessageDialog(null, "Fim do sistema");
    }
    }
}
