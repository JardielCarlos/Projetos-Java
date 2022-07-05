public class Calendario {
    private int dia, mes, ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int m){
        if(m == 1){
            return "Janeiro";
        } else if(m == 2){
            return "Fevereiro";
        } else if (m == 3){
            return "Março";
        } else if (m == 4){
            return "Abril";
        } else if(m == 5){
            return "Maio";
        } else if(m == 6){
            return "Junho";
        } else if(m == 7){
            return "Julho";
        } else if (m == 8){
            return "Agosto";
        } else if(m == 9){
            return "Setembro";
        } else if (m == 10){
            return "Outubro";
        } else if(m == 11){
            return "Novembro";
        } else if(m == 12){
            return "Dezembro";
        }else {
            return null;
        }
    }

    public void mostrarData(){
        System.out.println(dia + " de " + nomeMes(mes) + " de " + ano);
    }

    public void anoBissexto(){
        if(ano % 4 != 0){
            System.out.println("O ano não é bissexto"); 
            
        }else {
            System.out.println("O ano é bissexto");
        }
    }
}
