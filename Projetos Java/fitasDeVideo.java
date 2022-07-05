public class fitasDeVideo {
    private String tituloDaFita;
    private int precoAluguelDia;
    
    public fitasDeVideo(String tituloDaFita, int precoAluguelDia){
        this.tituloDaFita = tituloDaFita;
        this.precoAluguelDia = precoAluguelDia;
    }

    public int getValorAluguel(int numeroDeDiasAlugada){
        return precoAluguelDia * numeroDeDiasAlugada;
    }

    public String toString(){
        return ("Título: "+ tituloDaFita + "\nPreço do Aluguel por Dia: " + precoAluguelDia + "\nNumero de dias alugado: " + getValorAluguel(5));
    }

}
