import java.util.Random;

public class Guerreiro {
  private String codigo, nome;
  private int energia;
  
  public Guerreiro(String codigo, String nome){
    this.codigo = codigo;
    this.nome = nome;
    this.energia = 5;
  }
  Random random = new Random();
  int energiaOponente = 5;

  public String getCodigo() {
      return codigo;
  }

  public void setCodigo(String codigo) {
      this.codigo = codigo;
  }

  public String getNome() {
      return nome;
  }

  public void setNome(String nome) {
      this.nome = nome;
  }

  public int getEnergia() {
      return energia;
  }

  public void setEnergia(int energia) {
      this.energia = energia;
  }

  public int getEnergiaOponente(){
    return energiaOponente;
  }

  public void setEnergiaOponente(int energiaOponente){
    this.energiaOponente = energiaOponente;
  }

  public void Incremento(){
    if(energia < 5){
      setEnergia(++energia);
    }
  }

  public void Decremento(){
    if(energia > 0){
      setEnergia(--energia);
    } else {
      System.out.println("Você estar sem energia!");
    }
  }
  
  public void Alimentar_se(){
    if(energia < 5){
      Incremento();
    }else{
      System.out.println("Sua energia ja estar cheia!");
    }
  }
  public int Atacar(){
    int aleatorio = random.nextInt(2);
    return aleatorio;
  }
  
  @Override
  public String toString(){
    return "Nome: " + nome + "\nCódigo: "+ codigo + "\nEnergia: " + energia;
  }

  public void Lutar(Guerreiro oponente){
    while(true){
      int atacante = random.nextInt(2);
      oponente.Atacar();
      if(oponente.Atacar() == 1){
        System.out.println(oponente.nome + " Acertou " + nome + "\n");
        --energia;
      }
      if(atacante == 1){
        System.out.println(nome + " Acertou " + oponente.nome + "\n");
        --energiaOponente;
      }
      if (energia == 0){
        System.out.println(oponente.nome + " Ganhou");
        break;
      }
      if (energiaOponente == 0){
        System.out.println(nome + " Ganhou");
        break;
      }
    }
  }

  public String LutarRecursiva(Guerreiro oponente){
    int atacante = random.nextInt(2);
    if (energia == 0){
      System.out.println(oponente.nome + " Ganhou"); 
      return null;
    }
    
    if (energiaOponente == 0){
      System.out.println(nome + " Ganhou");
      return null;
    }

    oponente.Atacar();
    if(oponente.Atacar() == 1){
      System.out.println(oponente.nome + " Acertou " + nome + "\n");
      --energia;
    }
    if(atacante == 1){
      System.out.println(nome + " Acertou " + oponente.nome + "\n");
      --energiaOponente;
    }
    return  LutarRecursiva(oponente);   
  }
}