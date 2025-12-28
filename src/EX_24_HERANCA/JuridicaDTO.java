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
public class JuridicaDTO extends PessoaDTO{
    private int cnpj, ie;
    /**
     * @return the cnpj
     */
    public int getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    /**
     * @return the ie
     */
    public int getIe() {
        return ie;
    }

    /**
     * @param ie the ie to set
     */
    public void setIe(int ie) {
        this.ie = ie;
    }
    
}
