package Opg1;

import java.time.LocalDate;
import java.util.Date;

public class Værkfører extends Mekaniker{
    private LocalDate udnævelsesÅr;
    private int ugeTillæg;

    public Værkfører(String navn, String adresse, LocalDate årForSvendeprøve, double timeløn, LocalDate udnævelsesÅr, int ugeTillæg) {
        super(navn, adresse, årForSvendeprøve, timeløn);
        this.udnævelsesÅr = udnævelsesÅr;
        this.ugeTillæg = ugeTillæg;
    }

    public LocalDate getUdnævelsesÅr() {
        return udnævelsesÅr;
    }

    public void setUdnævelsesÅr(LocalDate udnævelsesÅr) {
        this.udnævelsesÅr = udnævelsesÅr;
    }

    public int getUgeTillæg() {
        return ugeTillæg;
    }

    public void setUgeTillæg(int ugeTillæg) {
        this.ugeTillæg = ugeTillæg;
    }

    @Override
    public double beregnLøn(){
        return super.beregnLøn() + ugeTillæg;
    }
}
