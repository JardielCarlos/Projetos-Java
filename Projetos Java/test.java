import java.util.Scanner;

public class test {
    public static void main(String[] args) { // psvm ou main "atalho"

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome do Aluno: ");  // sout "atalho"
        String nome = teclado.nextLine();

        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();

        System.out.printf("A nota de %s e %.1f\n", nome, nota);

        int numero = 10;
        String numero_letra = Integer.toString(numero);
        System.out.println(numero_letra);
        
        
    }
}
