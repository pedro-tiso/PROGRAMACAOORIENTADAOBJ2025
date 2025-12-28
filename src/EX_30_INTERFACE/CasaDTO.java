/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_30_INTERFACE;

/**
 *
 * @author pedro e paolo
 */
public class CasaDTO extends ImovelDTO implements IInterfaceCasa {
    private int quartos, banheiros;
    /**
     * @return the quartos
     */
    public int getQuartos() {
        return quartos;
    }

    /**
     * @param quartos the quartos to set
     */
    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    /**
     * @return the banheiros
     */
    public int getBanheiros() {
        return banheiros;
    }

    /**
     * @param banheiros the banheiros to set
     */
    public void setBanheiros(int banheiros) {
        this.banheiros = banheiros;
    }
    
}
