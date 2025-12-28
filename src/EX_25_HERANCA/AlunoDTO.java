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
public class AlunoDTO extends PessoaDTO{
   private String pront, curso;
    /**
     * @return the pront
     */
    public String getPront() {
        return pront;
    }

    /**
     * @param pront the pront to set
     */
    public void setPront(String pront) {
        this.pront = pront;
    }

    /**
     * @return the curso
     */
    public String getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }
    
}
