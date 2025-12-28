/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_36_TRABSEMESTRAL;

/**
 *
 * @author pedro e paolo
 */
public class TrabDAO {
    private double valhoracomum, valsalmin, valhoraextra, salbruto, horatrabalhada,horasex ,valhorasex, salfinal;
    
    public double Calcula ( double valsalmin, double horatrabalhada, double valhorasex){
        this.valsalmin = valsalmin;
        this.horatrabalhada = horatrabalhada;
        this.valhorasex = valhorasex;
        
        this.valhoracomum = this.valsalmin/8;
        this.valhoraextra = this.valsalmin/4;
        
        this.salbruto = this.valhoracomum * this.horatrabalhada;
        this.horasex = this.valhoraextra * this.valhorasex;
        
        this.salfinal = this.salbruto + this.horasex;
        
        return this.salfinal;
    }
}
