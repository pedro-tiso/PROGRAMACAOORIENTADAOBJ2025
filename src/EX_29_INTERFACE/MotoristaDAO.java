/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_29_INTERFACE;

/**
 *
 * @author pedro e paolo
 */
public class MotoristaDAO {
    private String resp;
     public String Verifica (MotoristaDTO dto){
         if(dto.getIdade() < 18){
             resp = "Você não pode dirigir!";
         }
         else{
             resp = "Você já pode dirigir!";
         }
         return resp;
     }
}
