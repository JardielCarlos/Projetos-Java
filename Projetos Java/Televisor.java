public class Televisor {
    private int canal, volume;
    private boolean ligado;
    
    public Televisor(int canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume =volume;
        this.ligado = ligado;
    }

    public boolean getligado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public int getVolume(){
        return volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getCanal(){
        return canal;
    }

    public void setCanal(int canal){
        this.canal = canal;
    }

    public void ligar(){
        if(!ligado){
            this.ligado = true;
        }       
    }

    public void desligar(){
        if(ligado){
            this.ligado = false;
        } 
    }

    public void aumentarVolume(){
        if(volume >= 100){
            volume = 100;
        }else{
            volume++;
        }
        
    }

    public void diminuirVolume(){
        if(volume == 0){
            volume = 0;
        }else{
            volume--;
        }
        
    }

    public void trocarCanal(int canal){
        if(canal > 0 && canal < 10){
            this.canal = canal;
        }
       
    }

    public String toString(){
        return "Canal: " + canal + "\nVolume: " + volume + "\nligado: " + ligado;
    }

}
