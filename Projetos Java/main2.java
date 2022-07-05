import java.util.Scanner;

public class main2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Agenda agenda = new Agenda(4);
    String nome, telefone;
    int idade;

    for(int i = 0; i < 4; ++i){
      System.out.print("\nInforme o nome: ");
      nome = teclado.nextLine();
      System.out.print("\nInforme o telefone: ");
      telefone = teclado.nextLine();
      System.out.print("\nInforme a idade: ");
      idade = teclado.nextInt(); teclado.nextLine();
      agenda.add(new Pessoa2(nome, telefone, idade));
    }

    System.out.print("O nome da pessoa mais nova é: ");
    System.out.println(agenda.getPessoaMaisNova());
  }
}
