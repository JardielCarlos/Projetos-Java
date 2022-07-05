public class Retangulo {
    private double comprimento;
    private double largura;
    
    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea(){
        return comprimento * largura;
    }

    public double calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }

    public String imprimir(){
        return "Largura: " + largura + "\nComprimento: "+ comprimento + "\nÁrea: "+ calcularArea() + "\nPerímetro: " + calcularPerimetro(); 
    }
}
