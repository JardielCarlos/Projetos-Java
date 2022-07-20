package ProjetoMercadinho;

import java.time.LocalDate;
import java.util.Scanner;

public class Mercadinho {
  private String nomeMercadinho;
  private Proprietario proprietario;
  private Produtos[] estoque;
  private int qtde;

  public Mercadinho(String nomeMercadinho, Proprietario proprietario){
    this.nomeMercadinho = nomeMercadinho;
    this.estoque = new Produtos[1000];
    this.proprietario = proprietario;   
    this.qtde = 0;
  }

  public String getNomeMercadinho(){
    return nomeMercadinho;
  }

  public void setNomeMercadinho(String nomeMercadinho){
    this.nomeMercadinho = nomeMercadinho;
  }

  public Proprietario getProprietario(){
    return proprietario;
  }

  public void setProprietario(Proprietario proprietario){
    this.proprietario = proprietario;
  }

  public void Cadastrar(Produtos produto){
    if (qtde <= 1000){
      this.estoque[qtde++] = produto ;

      
    } else{
      System.out.println("Estoque cheio!");
    }
  }
  
  public void Consultar(String consulta){
    try{
      for(int i = 0; i < estoque.length; i++){
        if(estoque[i].getDescricao() == consulta){
          System.out.println(estoque[i]);
          break;
        }
      }
    } catch(NullPointerException exception){
      if(exception != null){
        System.out.println("Item não encontrado");
      }
    }
  }

  public void Alterar(String DescricaoProdut){
    Scanner teclado = new Scanner(System.in);
    try{
      for(int i = 0; i < estoque.length; i++){
        if(estoque[i].getDescricao() == DescricaoProdut){
          System.out.println("O que você deseja alterar em " + DescricaoProdut+ "\n[ 1 ] Código\n[ 2 ] Fabricação\n[ 3 ] Validade\n[ 4 ] Valor \n\n");
          System.out.print("Qual opção você deseja: ");
          int escolha = teclado.nextInt();
          
          if (escolha == 1) {
            System.out.print("Qual Código você deseja: ");
            int novoCodigo = teclado.nextInt();
            estoque[i].setCodigo(novoCodigo);
            System.out.println("Código alterado com sucesso");
          } if(escolha == 2){
              System.out.print("Qual a nova data de fabricação EX: yyyy-MM-dd: ");
              String fabricacao = teclado.next();
              estoque[i].setFabricacao(fabricacao);
              System.out.println("Data de fabricação alterada com sucesso!");
          } if(escolha == 3){
              System.out.print("Qual a nova data de validade EX: yyyy-MM-dd: ");
              String validade = teclado.next();
              estoque[i].setValidade(validade);
              System.out.println("Data de validade alterada com sucesso!");
          } if(escolha == 4){
              System.out.print("Qual o novo Valor: ");
              double valor = teclado.nextDouble();
              estoque[i].setValor(valor);
              System.out.println("Novo valor alterado com sucesso!");
          } if (escolha == 5){
            System.out.print("Qual a nova Descrição: ");
            String descricao = teclado.next();
            estoque[i].setDescricao(descricao);
          }
          break;
        }
      }
    } catch(NullPointerException exception){
      if(exception != null){
        System.out.println("Item não encontrado");
      }
    }
  }

  public void Remover(String removeProdut){
    try{
      for(int i = 0; i < estoque.length; i++){
        if(estoque[i].getDescricao() == removeProdut){
          estoque[i] = null;
          System.out.println("Sabonete removido com sucesso");
          --qtde;
          break;
        }
      }
    } catch(NullPointerException exception){
      System.out.println("Item não encontrado");
    }
  }

  public void totalCadastrado(){
    System.out.println("O total de produtos cadastrados é de: " + qtde);  
  }

  public void totalValor(){
    double valor = 0;
    try{
      for(int i = 0; i < estoque.length; i++){
        valor += estoque[i].getValor();
      }
    } catch(NullPointerException exception) {
      if(exception != null){
        System.out.println("O valor total do estoque é de R$ " + valor);
      }
      
    }
  }

  public void Antigo(){
    Produtos menor = estoque[0];
    for(int i = 0; i < estoque.length; i++){
      if(estoque[i] != null){
        Produtos vez = estoque[i];
        if(vez.getFabricacao().isBefore(menor.getFabricacao())){
          menor = vez;
        } 
      } 
    }
    System.out.println(menor);  
  }

  public void Vencido(){
    try{
      LocalDate hoje = LocalDate.now();
      for(int i = 0; i < estoque.length; i++){
        if(estoque[i].getValidade().isBefore(hoje)){
          System.out.println(estoque[i]);
        }
      } 
    } catch(NullPointerException exception){}  
  }

  @Override
  public String toString(){
    return "Nome do Mercadinho: " + nomeMercadinho + "Proprietario: " + proprietario;
  }
}

