public class Bola {
  private String fabricante;
  private String cor;
  private double peso;

  public Bola(String fabricante, String cor, double peso){
    this.fabricante = fabricante;
    this.cor = cor;
    this.peso = peso;
  }

  public String getFabricante(){
    return fabricante;
  }

  public String getCor(){
    return cor;
  }

  public double getPeso(){
    return peso;
  }

  public void setFabricante(String fabricante){
    this.fabricante = fabricante;
  }

  public void setCor(String cor){
    this.cor = cor;
  }

  public void setPeso(double peso){
    this.peso = peso;
  }

}
