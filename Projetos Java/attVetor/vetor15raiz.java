package attVetor;

import java.util.Scanner;

public class vetor15raiz {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[15];
    double B[] = new double[15];

    for(int i = 0; i < A.length; i++){
      System.out.print("Digite os numeros do vetor: ");
      A[i] = teclado.nextInt();
    }

    for(int i = 0; i < A.length; i++){
      double raiz = Math.sqrt(A[i]);
      B[i] = raiz;
    }
    for(double i: B){
      System.out.printf("%.2f \n", i);
    }

  }

}
