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
public class AlunoDAO extends PessoaDAO {
    
    public String mostraaluno (AlunoDTO dto){
        return Mostra(dto) + "\nProntuário: " + dto.getPront() + 
                             "\nCurso: " + dto.getCurso();
    }
}
