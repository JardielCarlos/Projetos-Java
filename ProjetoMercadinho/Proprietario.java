package ProjetoMercadinho;

import java.time.LocalDate;

public class Proprietario{
  private String nome;
  private LocalDate nascimento;
  private String sexo;
  // Formato do nascimento yyyy-MM-dd
  public Proprietario(String nome, String nascimento, String sexo){
    this.nome = nome;
    this.nascimento = LocalDate.parse(nascimento);
    this.sexo = sexo;
  }

  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome = nome;
  }

  public LocalDate getNascimento(){
    return nascimento;
  }

  public void setNascimento(String nascimento){
    this.nascimento = LocalDate.parse(nascimento);
  }

  public String getSexo(){
    return sexo;
  }

  public void setSexo(String sexo){
    this.sexo = sexo;
  }

  @Override
  public String toString(){
    return  "Nome: " + nome + "\nData de Nascimento: " + nascimento + "\nSexo: " + sexo;
  }
}
