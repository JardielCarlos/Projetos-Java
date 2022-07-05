import java.util.Scanner;

public class Vetor {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero[] = {56, 75, 30, 40};
    int numeros[][] = new int[5][5];
    int numero_teste[] = new int[5];
    System.out.println(numero.length);
    
    //For normal
    for (int i = 0; i < numero.length; i++) {
      System.out.print(numero[i] + " ");
    }

    System.out.println();

    //for simplificado
    for (int numeroVez : numero){
      System.out.print(numeroVez + " ");
    }

    System.out.println();
    // for reversed
    for (int i = numero.length - 1; i >= 0; i--){
      System.out.print(numero[i] + " ");
    }
    
    
    for (int test = 0; test < 5 ; test++) {
      System.out.print("\nDigite um numero: ");
      numero_teste[test] = teclado.nextInt();
    }
    for(int add = 0; add < numero_teste.length; add++){
      System.out.println(numero_teste[add]);
    }
  }
}
