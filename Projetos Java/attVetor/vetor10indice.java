package attVetor;

import java.util.Scanner;

public class vetor10indice {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[10];
    int B[] = new int[10];

    for(int i = 0; i < B.length; i++){
      System.out.print("Digite os numeros do vetor: ");
      B[i] = teclado.nextInt();
    }
    
    for(int i = 0; i < B.length; i++){
      A[i] = B[i] * i;
    }
    for(int i : A){
      System.out.println(i);
    }
  }
}
