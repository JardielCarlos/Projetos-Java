package Adega;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class VinhoTinto extends Vinho{
  private Date safra;

  SimpleDateFormat sdfa = new SimpleDateFormat("yyyy");

  public VinhoTinto(String nome, String tipoUva, String fabricante, String dataFabricacao, double valor, String safra) throws ParseException {
    super(nome, tipoUva, fabricante, dataFabricacao, valor);
    this.safra= sdfa.parse(safra);
  }

  public String getSafra(){
    return sdfa.format(safra);
  }

  public void setSafra(String safra) throws ParseException{
    this.safra= sdfa.parse(safra);
  }

  @Override
  public String toString(){
    return "Nome: "+ getNome() + "\nTipo da uva: " + getTipoUva() + "\nFabricante: "+ getFabricante() + "\nData de Fabricação: "+ getDataFabricacao() + "\nValor: R$"+ getValor() + "\nSafra: " + getSafra();
  }
}
