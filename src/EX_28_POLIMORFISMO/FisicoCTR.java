/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_28_POLIMORFISMO;

/**
 *
 * @author pedro e paolo
 */
public class FisicoCTR {
 
    FisicoDAO dao = new FisicoDAO();

   public String RetornaFisico (FisicoDTO dto){
       return dao.imprimedadospessoa(dto);
   }    
}

