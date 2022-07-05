public class ContaAgua {
  private double consumoMetros;
  private double valorMetros;
  private String cliente;

  public ContaAgua(double consumoMetros, double valorMetros, String cliente) {
    this.consumoMetros = consumoMetros;
    this.valorMetros = valorMetros;
    this.cliente = cliente;
  }

  public double getConsumoMetros() {
    return consumoMetros;
  }

  public void setConsumoMetros(double consumoMetros) {
    this.consumoMetros = consumoMetros;
  }

  public double getValorMetros() {
    return valorMetros;
  }

  public void valorMetros(double valorMetros) {
    this.valorMetros = valorMetros;
  }

  public String getCliente() {
    return cliente;
  }

  public void setCliente(String cliente) {
    this.cliente = cliente;
  }

  public void getPrecoConta() {
    if (consumoMetros <= 10){
      valorMetros = 1.96;
    }else if (consumoMetros <= 25) {
      valorMetros = 9.11;
    }else if (consumoMetros <= 50 ) {
      valorMetros = 12.18;
    }else{
      valorMetros = 15.32;
    }
    double conta = consumoMetros * valorMetros;
    System.out.printf("\nO preço da conta de água de %s é de: R$" + conta, cliente);
  }
  public static void main(String[] args){
    ContaAgua conta_jardiel = new ContaAgua(60, 0, "Jardiel");
    ContaAgua conta_luiz = new ContaAgua(50, 0, "luiz");
    conta_jardiel.getPrecoConta();
    conta_luiz.getPrecoConta();
  }
  
}
