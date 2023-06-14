package adapter.opgave;

public class Fødevare extends Vare{

    public Fødevare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        return super.getPris() * 0.05;
    }
}
