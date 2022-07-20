package ProjetoMercadinho;

public class Limpeza extends Produtos{
  private String classificacao;

  public Limpeza(String classificacao, String descricao, int codigo, String fabricacao, String validade, double valor){
    super(descricao, codigo, fabricacao, validade, valor);
    this.classificacao = classificacao;
  }

  public String getClassificacao(){
    return classificacao;
  }

  public void setClassificacao(String classificacao){
    this.classificacao = classificacao;
  }

  @Override
  public String toString(){
    return "Descrição: " + getDescricao() + "\nCódigo: " + getCodigo() + "\nFabricação: " + getFabricacao() + "\nValidade: " + getValidade() + "\nClassificação: " + classificacao + "\nValor: R$" + getValor();
  }
}
