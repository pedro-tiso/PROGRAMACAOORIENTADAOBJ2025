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
public class CasaDAO implements IinterfaceCasaDAO {
    private String resp;
    
    public String Mostra (CasaDTO dto){
        resp = "Endereço:  " + dto.getEndereco() + 
                "\nNúmero: " + dto.getNumero() + 
                "\nBairro: " + dto.getBairro() + 
                "\nCidade: " + dto.getCidade() +
                "\nProprietário: " + dto.getProprietario() + 
                "\nNúmero de quartos: " + dto.getQuartos() + 
                "\nNúmero de banheiros: " + dto.getBanheiros();
        
        return resp;
    }
}
