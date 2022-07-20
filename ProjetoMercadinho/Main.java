package ProjetoMercadinho;

public class Main {
  public static void main(String[] args){
    Proprietario jardiel = new Proprietario("Jardiel", "2004-01-09", "Masculino");

    Mercadinho Bonaparte = new Mercadinho("Bonaparte", jardiel);

    Alimentacao salsicha = new Alimentacao("Artificial", "salsicha", 1, "2022-06-10", "2022-08-01", 10.00);

    Limpeza sabonete = new Limpeza("Não nocivo", "sabonete", 2, "2022-04-10", "2021-07-10", 5.50);

    Bebida refrigerante = new Bebida(0, "Refrigerante", 3, "2022-08-15", "2022-09-20", 12.50);

    Alimentacao ovo = new Alimentacao("Natural", "ovo", 4, "2022-09-20", "2022-10-30", 5.00);

    Bonaparte.Cadastrar(salsicha);
    Bonaparte.Cadastrar(sabonete);
    Bonaparte.Cadastrar(refrigerante);
    Bonaparte.Cadastrar(ovo);


    Bonaparte.Consultar("sabonete");
    System.out.println();
    Bonaparte.totalCadastrado();
    System.out.println();
    Bonaparte.totalValor();
    System.out.println();
    System.out.println("Mais antigo");
    Bonaparte.Antigo();
    System.out.println();
    System.out.println("Vencido");
    Bonaparte.Vencido();
    System.out.println();
    Bonaparte.Alterar("ovo");
    Bonaparte.Remover("salsicha");
  }
}
