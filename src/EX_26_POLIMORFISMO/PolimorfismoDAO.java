/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_26_POLIMORFISMO;

/**
 *
 * @author pedro e paolo
 */
public class PolimorfismoDAO {
    private String verifica (int idade){
        if(idade > 18){
            return "\n Idade maior que 18 anos, pode entrar no brinquedo.";
        }
        else{
            return "\n Idade menor que 18 anos, não pode entrar no brinquedo.";
        }
    }
    
    private String verifica (double altura){
        if(altura > 1.50){
            return "\n Altura maior que 1.50, pode entrar no brinquedo.";
        }
        else{
            return "\n  Altura menor que 1.50, não pode entrar no brinquedo.";
        }
    }
    
    public String Mostra (PolimorfismoDTO dto){
        return "O nome informado foi: " + dto.getNome() +
                "\n o RG informado foi: " + dto.getRg() + 
                verifica(dto.getIdade()) + 
                verifica(dto.getAltura());
    }
}

