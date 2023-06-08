package Opg1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Mekaniker extends Person{
    private LocalDate årForSvendeprøve;
    private double timeløn;

    public Mekaniker(String navn, String adresse, LocalDate årForSvendeprøve, double timeløn) {
        super(navn, adresse);
        this.årForSvendeprøve = årForSvendeprøve;
        this.timeløn = timeløn;
    }

    public LocalDate getÅrForSvendeprøve() {
        return årForSvendeprøve;
    }

    public void setÅrForSvendeprøve(LocalDate årForSvendeprøve) {
        this.årForSvendeprøve = årForSvendeprøve;
    }

    public double getTimeløn() {
        return timeløn;
    }

    public void setTimeløn(double timeløn) {
        this.timeløn = timeløn;
    }

    public double beregnLøn (){
        return timeløn * 37;
    }
}
