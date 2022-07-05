package attVetor;

import java.util.Scanner;

public class vetor10restolista {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[10];
    int B[] = new int[10];
    
    for(int i = 0; i< B.length; i++){
      System.out.print("Digite os Valores do vetor B: ");
      B[i] = teclado.nextInt();
    }
    for(int i = 0; i < A.length; i++){
      A[i] = B[i] % 2;
    }
    for(int i : A){
      System.out.println(i);
    }
  }
}
