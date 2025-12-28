/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_01_INTRODUCAO;
import javax.swing.JOptionPane;

/**
 *
 * @author Aluno
 */
public class PrincipalCliente {
    public static void main (String[] args){
        Cliente cliente = new Cliente();
        
        System.out.println("===Chamando os métodos do objeto ===\n");
        
        JOptionPane.showMessageDialog(null, cliente.mostrar (JOptionPane.showInputDialog("Informe o nome:"),
        JOptionPane.showInputDialog("Informe o RG:")));
        
        //cliente.mostrar (JOptionPane.showInputDialog("Informe o nome:"),
        //JOptionPane.showInputDialog("Informe o RG:"));
        
//        cliente.mostrar("Prof.André Gobbi", "11.111.111-11");
//       cliente.mostrar("Prof.Ivan Lopes", "22.222.222-22");
        
//        cliente.mostrarNome("Prof.André Gobbi");
//       cliente.mostrarNome("Prof.Ivan Lopes");
        
        System.out.println("=== Fim da chamada dos métodos do objeto ===\n");
    }
}
