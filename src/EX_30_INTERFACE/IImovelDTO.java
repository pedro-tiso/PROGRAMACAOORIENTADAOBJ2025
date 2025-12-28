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
public interface IImovelDTO {
    public String getEndereco();
    public void setEndereco(String endereco);
   
   public int getNumero();
   public void setNumero(int numero);
   
   public String getBairro();
   public void setBairro(String bairro);
   
   public String getCidade();
   public void setCidade(String cidade);
   
   public String getProprietario();
   public void setProprietario(String proprietario);
}
