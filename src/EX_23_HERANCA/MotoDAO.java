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
public class MotoDAO extends VeiculoDAO{
    public String ImprimeDadosMoto(MotoDTO dto){
        return ImprimeDadosVeiculo(dto) + "A cilindrada é: " + dto.getCilindrada()+
                "\nO tipo do motor é: " + dto.getTpmotor();
}
}