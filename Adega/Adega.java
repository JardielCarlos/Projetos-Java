package Adega;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Adega {
  private Vinho[][] colmeia;
  private int qtdcolum;
  private int qtdlinha;
  private int cont;
  
  public Adega(){
    this.colmeia = new Vinho[20][10];
    this.qtdcolum = 0;
    this.qtdlinha = 0;
  }
  // {{0,1,2,3,4,5},{0,1,2,3,4,5},{0,1,2,3,4,5}}
  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
  public void Incluir(Vinho vinho){
    this.colmeia[qtdlinha][qtdcolum++] = vinho;
    cont++;
    if(qtdcolum == 9){
      qtdcolum = 0;
      qtdlinha++;
    }if(qtdlinha == 19 && qtdcolum == 9){
      System.out.println("Colmeia cheia!");
      return;
    }
    
    }

  public void ObterVinho(String tipo){
    for(int linha = 0; linha < colmeia.length; linha++){
      for(int coluna = 0; coluna < colmeia[i].length; coluna++){
        if(colmeia[linha][coluna] != null){
          if(colmeia[linha][coluna].getTipoUva()== tipo){
            System.out.println(colmeia[linha][coluna] + "\n");
          }
        } 
      }
    }
  }

  public void Quantidade(){
    System.out.println("À adega possui: " + cont + " garrafa cadastrada");
  }

  public void TotAdega(){
    double valor = 0;
    for(int i = 0; i < colmeia.length; i++){
      for(int j = 0; j < colmeia[i].length; j++){
        if(colmeia[i][j] != null){
          valor += colmeia[i][j].getValor();
        }
      }
    }
    System.out.println("O valor da Adega é de R$ "+ valor);
  }

  public void Antigo() throws ParseException{
    Vinho dataFabMenor = colmeia[0][0];
    for(int i = 0; i < colmeia.length; i++){
      for(int j = 0; j < colmeia[i].length; j++){
        if(colmeia[i][j] != null){
          Vinho dataFabVez = colmeia[i][j];
          if(sdf.parse(dataFabVez.getDataFabricacao()).before(sdf.parse(dataFabMenor.getDataFabricacao()))){
            dataFabMenor = dataFabVez;
          }
        }
      }
    }
    System.out.println(dataFabMenor);
  }

  public void Vinhoespecifico(int linha, int coluna){
    try{
      System.out.println(colmeia[linha][coluna]);
    } catch(ArrayIndexOutOfBoundsException exception){
      System.out.println("Busca fora do tamanho maximo da adega!");
    }
    
  }

  @Override
  public String toString(){
    return "Colmeia: "+ colmeia;
  }
}
