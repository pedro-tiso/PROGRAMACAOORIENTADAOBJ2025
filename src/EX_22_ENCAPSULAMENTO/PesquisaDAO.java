/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EX_22_ENCAPSULAMENTO;

/**
 *
 * @author pedro e paolo
 */
public class PesquisaDAO {
    private String resp, teste;
    
public void Acumula (PesquisaDTO dto){
    
    if(dto.getSexo().equalsIgnoreCase("M")){
        dto.setQtdm(dto.getQtdm() + 1);
        dto.setSaltot(dto.getSaltot() + dto.getSal());
        dto.setQtd(dto.getQtd() + 1);
                          }
    else if (dto.getSexo().equalsIgnoreCase("F") && dto.getSal()>300){
        dto.setQtdf(dto.getQtdf() + 1);
        dto.setSaltot(dto.getSaltot() + dto.getSal());
        dto.setQtdmm(dto.getQtdmm() + 1);
        dto.setQtd(dto.getQtd() + 1);
                                                    }
    else if (dto.getSexo().equalsIgnoreCase("F") && dto.getSal()<=300){
        dto.setQtdf(dto.getQtdf() + 1);
        dto.setSaltot(dto.getSaltot() + dto.getSal());
        dto.setQtd(dto.getQtd() + 1);
                                                    }
                                      }


    public String mostra (PesquisaDTO dto){
        
        this.resp = "A média salarial dos habitantes foi: " + (dto.getSaltot()/dto.getQtd()) +
                    "\nA porcentagem de homens ouvidos foi: " + (dto.getQtdm()/dto.getQtd())*100 + "%" +
                    "\nA porcentagem de mulheres ouvidas foi: " + (dto.getQtdf()/dto.getQtd())*100 + "%" +
                    "\nA porcentagem de mulheres que recebem menos de R$300,00 ouvidas foi: " + (dto.getQtdmm()/dto.getQtdf())*100 + "%";
        //this.teste = "Homem: " + dto.getQtdm() + "Mulher: " + dto.getQtdf()+"Mulher menos 300: " + dto.getQtdmm() + "Total: " + dto.getQtd();
        return this.resp;
        //return this.teste;
    }
                         }

