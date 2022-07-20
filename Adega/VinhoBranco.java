package Adega;

import java.text.ParseException;

public class VinhoBranco extends Vinho{
  private String tipo;

  public VinhoBranco(String nome, String tipoUva, String fabricante, String dataFabricacao, double valor, String tipo) throws ParseException{
    super(nome, tipoUva, fabricante, dataFabricacao, valor);
    this.tipo = tipo;
  }

  public String getTipo(){
    return tipo;
  }

  public void setTipo(String tipo){
    this.tipo = tipo;
  }

  @Override
  public String toString(){
    return "Nome: "+ getNome() + "\nTipo da uva:" + getTipoUva() + "\nFabricante: "+ getFabricante() + "\nData de Fabricação: " +getDataFabricacao() + "\nValor: R$" + getValor()+ "\nTipo: " + tipo;
  }
}
