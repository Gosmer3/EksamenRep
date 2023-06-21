package Opgave3;

public class Synsmand extends Mekaniker {
    private int synPerUge;


    public Synsmand(String navn, String adresse, int svendeprøve, double timeløn, int synPerUge) {
        super(navn, adresse, svendeprøve, timeløn);
        this.synPerUge = synPerUge;

    }

    public int getSynPerUge() {
        return synPerUge;
    }

    public void setSynPerUge(int synPerUge) {
        this.synPerUge = synPerUge;
    }
@Override
    public double beregnLøn(){
        return (getTimeløn()*37) + (synPerUge * 29);
    }
}
