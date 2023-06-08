package Opg1;

import java.time.LocalDate;

public class Synsmand extends Mekaniker {
    private int antalSyn;

    public Synsmand(String navn, String adresse, LocalDate årForSvendeprøve, double timeløn, int antalSyn) {
        super(navn, adresse, årForSvendeprøve, timeløn);
        this.antalSyn = antalSyn;
    }

    @Override
    public double beregnLøn() {
        return super.beregnLøn() + antalSyn * 29;
    }
}
