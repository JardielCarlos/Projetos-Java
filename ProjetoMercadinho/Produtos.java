package ProjetoMercadinho;

import java.time.LocalDate;

public abstract class Produtos {
  private String descricao;
  private int codigo;
  private LocalDate fabricacao;
  private LocalDate validade;
  private double valor;

  public Produtos(String descricao, int codigo, String fabricacao, String validade, double valor){
    this.descricao = descricao;
    this.codigo = codigo;
    this.fabricacao =  LocalDate.parse(fabricacao);
    this.validade = LocalDate.parse(validade);
    this.valor = valor;
  }

  public String getDescricao(){
    return descricao;
  }

  public void setDescricao(String descricao){
    this.descricao = descricao;
  }

  public int getCodigo(){
    return codigo;
  }

  public void setCodigo(int codigo){
    this.codigo = codigo;
  }

  public LocalDate getFabricacao(){
    return fabricacao;
  }

  public void setFabricacao(String fabricacao){
    this.fabricacao = LocalDate.parse(fabricacao);
  }

  public LocalDate getValidade(){
    return validade;
  }

  public void setValidade(String validade){
    this.validade = LocalDate.parse(validade);
  }

  public double getValor(){
    return valor;
  }

  public void setValor(double valor){
    this.valor = valor;
  }


  @Override
  public String toString(){
    return "Descrição: " + descricao + "\nCódigo: " + codigo + "\nFabricação: "+ fabricacao + "\nValidade: " + validade + "\nValor: " + valor; 
  }
}
