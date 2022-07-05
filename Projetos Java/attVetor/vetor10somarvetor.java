package attVetor;

import java.util.Scanner;

public class vetor10somarvetor {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[10];

    for(int i = 0; i < A.length; i++){
      System.out.print("Digite o valor do Vetor: ");
      A[i] = teclado.nextInt();
    }
    int soma = 0;
    for(int i = 0; i < A.length; i++){
      soma += A[i];
    }
    System.out.println("A soma do vetor é: " + soma);
  }
}
