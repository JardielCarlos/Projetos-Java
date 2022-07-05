public class Circulo {
    private double raio;
    private final double pi = 3.141516; 
    
    public Circulo(double raio){
        this.raio = raio;
    }

    public double calcularArea(){
        return (pi * raio * raio);
    }

    public double calcularPerimetro(){
        return (2 * pi * raio);
    }

    public String imprimir(){
        return "Raio: " + raio + "\nPi" + pi + "\nÁrea: " + calcularArea() + "\nPerímetro: " + calcularPerimetro();
    }
}
