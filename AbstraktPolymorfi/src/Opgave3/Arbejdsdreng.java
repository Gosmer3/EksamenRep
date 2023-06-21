package Opgave3;

public class Arbejdsdreng extends Ansat{

    public Arbejdsdreng(String navn, String adresse, double timeløn) {
        super(navn, adresse, timeløn);
    }
    public double beregnLøn(){
        return getTimeløn()*25;

    }
}
