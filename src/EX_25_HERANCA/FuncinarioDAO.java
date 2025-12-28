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
public class FuncinarioDAO extends PessoaDAO{
    
    private String resp;
    private int Calc (FuncionarioDTO dto){
        return dto.getIdade() - 60;
        
    }
    
    
    public String MostraFunc (FuncionarioDTO dto)
    {
         int idade = Calc(dto);
        if (idade >= 0){
        this.resp = Mostra(dto) + "\nSiape: " + dto.getSiape() +
                              "\nFunção: " + dto.getFuncao() + 
                              "\nVocê já possui idade para se aposentar!";}
        else{
            this.resp = Mostra(dto) + "\nSiape: " + dto.getSiape() +
                              "\nFunção: " + dto.getFuncao() + 
                              "\nFaltam " + idade*(-1) + " anos para você se aposentar.";
        }
        return this.resp;
                                 
    }
    
    
}
