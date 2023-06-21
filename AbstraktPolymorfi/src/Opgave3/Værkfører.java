package Opgave3;

public class Værkfører extends Ansat {
    private int udnævnelsesÅr;
    private double tillæg;

    public Værkfører(String navn, String adresse, int udnævnelsesÅr, double tillæg, double timeløn) {
        super( navn ,adresse, timeløn);
        this.udnævnelsesÅr = udnævnelsesÅr;
        this.tillæg = tillæg;
    }

    public int getUdnævnelsesÅr() {
        return udnævnelsesÅr;
    }

    public void setUdnævnelsesÅr(int udnævnelsesÅr) {
        this.udnævnelsesÅr = udnævnelsesÅr;
    }

    public double getTillæg() {
        return tillæg;
    }

    public void setTillæg(double tillæg) {
        this.tillæg = tillæg;
    }
    @Override
    public double beregnLøn(){
        return getTimeløn()*37 + tillæg;
    }
}
