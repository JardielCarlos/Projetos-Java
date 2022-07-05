package attVetor;

public class vetor8 {
  public static void main(String[] args) {
    int A[] = { 10, 4, 8, 98, 65, 14, 32, 0 };
    int B[] = new int[8];

    for (int i = 0; i < A.length; i++) {
      A[i] = A[i] * 2;
      
    }
    for (int posicao = 0; posicao < A.length; posicao++) {
      B[posicao] = A[posicao];
    }

    for (int j = 0; j < A.length; j++) {
      if (B[j] == A[j]) {
        System.out.print("São iguais! " + B[j] + "|" + A[j]+ " ");
      } else {
        System.out.println("São diferentes!");
      }
    }

    for (int i : A){
      System.out.println(i);
    }
  }
}
