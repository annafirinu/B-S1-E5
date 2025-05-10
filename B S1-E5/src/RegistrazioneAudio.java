public class RegistrazioneAudio extends ElementoMultimediale implements Riproduzione {
    private double durata;
    private int volume;

    public RegistrazioneAudio (String titolo, double durata, int volume) {
        super(titolo);
        this.durata=durata;
        this.volume=volume;
    }

    public double getDurata() {
        return durata;
    }

    public void setDurata(double durata) {
        this.durata = durata;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void aumentaVolume() {
        volume++;
    }

    public void diminuisciVolume() {
        if (volume > 0)
            volume --;
    }

    @Override
    public void play() {
        String esclamativi = "!".repeat(volume);
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo()+" "+ esclamativi);}
    }

    @Override
    public String toString() {
        return "RegistrazioneAudio{"+getTitolo() +": "+
                "durata=" + durata +
                ", volume=" + volume +
                '}';
    }
}
