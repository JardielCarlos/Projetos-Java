public class contador {
  public static void main(String[] args) {
    int cc = 0;
    while (cc < 10){
      cc ++;
      if (cc == 5 || cc == 7){
        continue;
      }
      System.out.println(cc + " Cambalhota");
    }
  }
}
