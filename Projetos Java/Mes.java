
public class Mes {
  public static void main(String[] args) {
    String mes[] = {"janeiro", "Fevereiro", "Março", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
    int dia[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 30, 31};

    for(int i = 0; i < mes.length; i++){
      System.out.println("\nO Mês de " + mes[i] + " tem " + dia[i] + " Dias.");
    } 
  }
}
