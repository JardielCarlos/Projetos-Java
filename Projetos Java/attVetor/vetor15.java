package attVetor;

import java.util.Scanner;

public class vetor15 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[15];
    int B[] = new int[15];
  
    for(int i = 0; i < B.length; i++){
      System.out.print("Digite os numeros do vetor: ");
      B[i] = teclado.nextInt();
    }

    for(int i = 0; i < B.length; i++){
      A[i] = B[i] * B[i];
    }

    for(int i : B){
      System.out.println(i);
    }
  }
}
