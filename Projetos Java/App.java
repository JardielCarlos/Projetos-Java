
import java.util.Date;
import java.util.Scanner;


public class App {
  public static void main(String[] args){
    
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite seu nome: ");
    String nome = teclado.nextLine();
    System.out.print("Digite seu CPF:");
    int cpf = teclado.nextInt();
    System.out.print("Digite seu telefone: \n");
    String telefone = teclado.nextLine();
    System.out.print("Digite sua matricula: ");
    String matricula = teclado.nextLine();

    Usuario pedro = new Usuario(nome, cpf, telefone, matricula);
    System.out.println(pedro);
    System.out.printf("Nome: %s\nCPF: %s\nTelefone: %s\nMatricula: %s\n", 
    pedro.getNome(), pedro.getCpf(), pedro.getTelefone(), pedro.getMatricula());
    
    Livro livro = new Livro("Harry Potter ", "JK", new Date(), 221, "mais brasil", "1");
    
    Exemplar exemplar = new Exemplar(1, false, true, livro);

    Emprestimo emprestar = new Emprestimo(new Date(), new Date(), new Date(), 0, pedro, exemplar);

    System.out.println("\n\n\nData de emprestimo:  " + emprestar.getDataDeEmprestimo()); 

    System.out.println("Previsão de devolução: " + emprestar.getDataPrevistaDeDevolucao());
    
    System.out.println("Data de entrega real: "+ emprestar.getDataDeEntregaReal()); 

    System.out.println("Situacao: "+ emprestar.getSituacao());
  }

  
  
}
