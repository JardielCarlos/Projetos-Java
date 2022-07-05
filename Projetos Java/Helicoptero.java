import java.util.Scanner;

public class Helicoptero {
    private boolean ligado;
    private int altitude, capacidade, pessoasPresentes;

    public Helicoptero(int capacidade){
        this.capacidade = capacidade;
        this.ligado = false;
        this.altitude = 0;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public void Entrar(){
        if(capacidade > pessoasPresentes){
            setPessoasPresentes(++pessoasPresentes);
            System.out.println("Entrou uma pessoa no helicóptero");
        } else {
            System.out.println("O helicóptero estar cheio!");
        }
      }
      
      public void Sair(){
        if (pessoasPresentes > 0){
            setPessoasPresentes(--pessoasPresentes);
            System.out.println("Saiu uma pessoa do helicóptero");
        } else{
            System.out.println("O helicóptero estar vazio");
        }
      }
      
      public void Ligar(){
        if(!ligado){
            setLigado(true);
            System.out.println("O helicóptero estar ligado");
        }else{
            System.out.println("O helicóptero ja estar ligado");
        }
      }
      
      public void Decolar(){
        Scanner teclado = new Scanner(System.in);
        if (ligado && altitude == 0){
            System.out.print("Digite para qual altura o helicoptero deve ir: ");
            altitude = teclado.nextInt();
            setAltitude(altitude);
            System.out.println("O helicoptero subiu para altitude de " + altitude + " metros de altura\n");
        }
      }
      
      public void Aterrisar(){
        if(ligado && altitude > 0){
            setAltitude(0);
            System.out.println("O helicóptero aterrisou");
        }else{
            System.out.println("O helicóptero ja estar no chão");
        }
      }
      
      public void Desligar(){
        if (ligado){
            setLigado(false);
            System.out.println("O helicóptero desligou");
        } else{
            System.out.println("O helicóptero ja estar desligado");
        }
      }
      
      
      @Override
      public String toString(){
          return "Ligado: " + ligado + "\nAltitude: " + altitude + "m"+ "\nCapacidade: " + capacidade + "\npessoas embarcadas: " + pessoasPresentes;
      }
}
