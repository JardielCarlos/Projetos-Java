package ProjetoMercadinho;

public class Bebida extends Produtos{
  private double gradualcool;

  public Bebida(double gradualcool, String descricao, int codigo, String fabricacao, String validade, double valor){
    super(descricao, codigo, fabricacao, validade, valor);
    this.gradualcool = gradualcool;
  }

  public double getGradualcool(){
    return gradualcool;
  }

  public void setGradualcool(double gradualcool){
    this.gradualcool = gradualcool;
  }

  @Override
  public String toString(){
    return "Descrição: " + getDescricao() + "\nCódigo: " + getCodigo() + "\nFabricação: " + getFabricacao() + "\nValidade: " + getValidade() + "\nGraduação alcoólica: " + gradualcool + "\nValor: " + getValor(); 
  }
}
