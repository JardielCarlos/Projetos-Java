package attVetor;

import java.util.Scanner;

public class vetor10somalista {
  public static void main(String[] main){
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[10];
    int B[] = new int[10];
    int C[] = new int[10];
    
    for(int i = 0; i < A.length; i++){
      System.out.print("Digite os valores do Vetor A: ");
      A[i] = teclado.nextInt();
    }
    System.out.println();
    for(int i = 0; i < A.length; i++){
      System.out.print("Digite os valores do Vetor B: ");
      B[i] = teclado.nextInt();
    }
    
    for(int i = 0; i < A.length; i++){
      C[i] = A[i] + B[i];
    }
    for(int i : C){
      System.out.print(i + " ");
    }

  }
}
