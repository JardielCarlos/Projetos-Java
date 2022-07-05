public class Usuario {
  private String nome;
  private int cpf;
  private String telefone;
  private String matricula;

  public Usuario(String nome, int cpf, String telefone, String matricula){
    this.nome = nome;
    this.cpf = cpf;
    this.telefone = telefone;
    this.matricula = matricula;
  }

  public String getNome(){
    return nome;
  }

  public int getCpf(){
    return cpf;
  }

  public String getTelefone(){
    return telefone;
  }

  public String getMatricula(){
    return matricula;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public void setCpf(int cpf) {
    this.cpf = cpf;
  }
  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String toString(){
    return "Nome: " + nome + " Telefone: " + telefone + " Matricula: " + matricula + " CPF: " + cpf; 
  }
}
