package Adega;

import java.text.ParseException;

public class Main {
  public static void main(String[] args) throws ParseException {
    VinhoBranco Cabernet = new VinhoBranco("Cabernet Sauvignon", "roxa", "uniovinho", "10/05/1987", 250.50, "frisante");

    VinhoTinto Sauternes = new VinhoTinto("Sauternes", "verde", "americanVinho", "25/01/1999", 100.00, "1980");

    VinhoBranco Pomerol = new VinhoBranco("Pomerol", "roxa", "unionVinho", "05/08/1940", 300, "normal");

    Adega adega = new Adega();

    adega.Incluir(Cabernet);
    adega.Incluir(Sauternes);
    adega.Incluir(Pomerol);
    System.out.println();
    adega.ObterVinho("verde");
    // System.out.println();
    // adega.Quantidade();
    // System.out.println();
    // adega.TotAdega();
    // System.out.println();
    // adega.Antigo();
    // System.out.println();
    // adega.Vinhoespecifico(0, 1);

  }
}
