package StrategyEbbe;

public class Spiritus extends Vare {
    double alkoholProcent;

    public Spiritus(double pris, String navn, String beskrivelse, double alkoholProcent) {
        super(pris, navn, beskrivelse, new SpiritusMoms());
        this.alkoholProcent = alkoholProcent;
    }


}
