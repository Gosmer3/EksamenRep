package Opgave3;

public class Mekaniker extends Ansat {
    private int svendeprøve;


    public Mekaniker(String navn, String adresse, int svendeprøve, double timeløn) {
        super(navn, adresse, timeløn);
        this.svendeprøve = svendeprøve;

    }

    public int getSvendeprøve() {
        return svendeprøve;
    }

    public void setSvendeprøve(int svendeprøve) {
        this.svendeprøve = svendeprøve;
    }


    @Override
    public double beregnLøn() {
        return getTimeløn()*37;
    }
}

