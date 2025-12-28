/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_01_INTRODUCAO;
//import javax.swing.JOptionPane;
/**
 *
 * @author Aluno
 */
public class Cliente {
    
    private String nome, rg;
    
    public String mostrar(String nome, String rg){
        this.nome = nome;
        this.rg = rg;
        return "O nome informado foi: " + this.nome + " O RG informado: " + this.rg ;
        //System.out.print("O nome informado foi: " + this.nome + " O RG informado: " + this.rg );
        
    }
    public String mostrarNome(String nome){
        this.nome = nome;
        
        return "O nome informado foi: " + this.nome;
    }
}
