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
public class AlunoCTR {
    AlunoDAO dao = new AlunoDAO();

  public String retorna (AlunoDTO dto){
      return dao.mostraaluno(dto);
}
}
