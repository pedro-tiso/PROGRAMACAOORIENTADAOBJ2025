/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_23_HERANCA;

/**
 *
 * @author pedro e paolo
 */
public class VeiculoDAO {
    
    public String ImprimeDadosVeiculo(VeiculoDTO dto){
        return "A placa é: " + dto.getPlaca() +
                "\nA cor é: " + dto.getCor();
    }
}
