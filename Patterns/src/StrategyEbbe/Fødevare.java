package StrategyEbbe;

public class Fødevare extends Vare {
    private int holdbarhed;



    public Fødevare(double pris, String navn, String beskrivelse, int holdbarhed) {
        super(pris, navn, beskrivelse, new FødevareMoms());
        this.holdbarhed = holdbarhed;
    }


}
