/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_24_HERANCA;

/**
 *
 * @author pedro e paolo
 */
public class JuridicaCTR {
      JuridicoDAO dao = new JuridicoDAO();
      
      public String retornajuridica (JuridicaDTO dto){
          return dao.imprimejurudico(dto);
      }
}
