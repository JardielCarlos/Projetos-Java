package Adega;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Vinho {
  private String nome;
  private String tipoUva;
  private String fabricante;
  private Date dataFabricacao;
  private double valor;

  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  public Vinho(String nome, String tipoUva, String fabricante, String dataFabricacao, double valor) throws ParseException{
    this.nome = nome;
    this.tipoUva = tipoUva;
    this.fabricante = fabricante;
    this.dataFabricacao = sdf.parse(dataFabricacao);
    this.valor = valor;
  }
  
  
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public String getTipoUva(){
    return tipoUva;
  }

  public void setTipoUva(String tipoUva){
    this.tipoUva = tipoUva;
  }

  public String getFabricante(){
    return fabricante;
  }

  public void setFabricante(String fabricante){
    this.fabricante = fabricante;
  }

  public String getDataFabricacao(){
    return sdf.format(dataFabricacao);
  }

  public void setDataFabricacao(String dataFabricacao) throws ParseException{
    this.dataFabricacao = sdf.parse(dataFabricacao);
  }

  public double getValor(){
    return valor;
  }

  public void setValor(double valor){
    this.valor = valor;
  }

  @Override
  public String toString(){
    return "Nome: " + nome + "\nTipo da uva: " + tipoUva + "\nFabricante: " + fabricante + "\nData de Fabricação: " + sdf.format(dataFabricacao) + "\nValor: R$" + valor;
  }

}
