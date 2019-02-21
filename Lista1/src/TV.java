public class TV {
    private int canal;
    private int volume;

    public TV(int ch, int vol){
        this.canal = ch;
        this.volume = vol;
    }

    public void aumentarVolume(){
        if (volume < 100){
            this.volume = this.volume + 1;
        }
    }

    public void diminuirVolume(){
        if (volume > 0){
            this.volume = this.volume - 1;
        }
    }

    public void mudarCanal(int ch){
        this.canal = ch;
    }

    public int getVolume(){
        return this.volume;
    }

    public int getCanal(){
        return this.canal;
    }
}
