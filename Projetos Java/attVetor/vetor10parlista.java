package attVetor;

import java.util.Scanner;

public class vetor10parlista {
  public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    int A[] = new int[10];
  
    for(int i = 0; i < A.length; i++){
      System.out.print("Digite o valor do Vetor: ");
      A[i] = teclado.nextInt();
    }

    for(int i = 0; i < A.length; i++){
      if(A[i] % 2 == 0){
        System.out.println("O número "+ A[i]+ " é par");
      } 
    }
  }
  
}
