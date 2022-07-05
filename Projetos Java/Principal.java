public class Principal {
  public static void main(String[] args){
    Helicoptero helico = new Helicoptero(10);
    Helicoptero ptero = new Helicoptero(5);


    ptero.Entrar();
    ptero.Entrar();
    ptero.Entrar();
    ptero.Entrar();
    ptero.Entrar();

    ptero.Ligar();

    ptero.Decolar();
    ptero.Aterrisar();
    ptero.Desligar();

    ptero.Sair();
    ptero.Sair();
    ptero.Sair();
    ptero.Sair();
    ptero.Sair();

    System.out.println();
    System.out.println(ptero);

  }
}
