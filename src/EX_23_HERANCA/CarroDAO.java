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
public class CarroDAO extends VeiculoDAO {
    

    public String ImprimeDadosCarro(CarroDTO dto){
        return ImprimeDadosVeiculo(dto) + "A Potência é: " + dto.getPotencia()+
                "\nA quantidade de portas é: " + dto.getQtdporta();
}
}
