/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_25_HERANCA;

/**
 *
 * @author pedro e paolo
 */
public class FuncionarioCTR {
    FuncinarioDAO dao = new FuncinarioDAO();

  public String retorna (FuncionarioDTO dto){
      return dao.MostraFunc(dto);
  }     
}
