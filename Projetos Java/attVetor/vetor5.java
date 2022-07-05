package attVetor;

public class vetor5 {
  public static void main(String[] args) {
    int A[] = {10, 5, 15, 3, 1};
    int B[] = {10, 5, 15, 3, 1};
    for(int i = 0; i < A.length; i++){
      if(B[i] == A[i]){
        System.out.println("São iguais!");
      }else{
        System.out.println("São diferentes!");
      }
    }
  }
}
