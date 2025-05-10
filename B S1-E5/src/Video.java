public class Video extends ElementoMultimediale implements Riproduzione {
    private double durata;
    private int volume;
    private int luminosita;


    public Video (String titolo, double durata, int volume, int luminosita) {
        super(titolo);
        this.durata=durata;
        this.volume=volume;
        this.luminosita = luminosita;
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

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita() {
        luminosita++;
    }

    public void diminuisciLuminosita() {
        if (luminosita > 0)
            luminosita --;
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
        String asterischi = "*".repeat(luminosita);

        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() +" "+ esclamativi+" "+asterischi);}

    }

    @Override
    public String toString() {
        return "Video{"+getTitolo() +": "+
                "durata=" + durata +
                ", volume=" + volume +
                ", luminosita=" + luminosita +
                '}';
    }
}
