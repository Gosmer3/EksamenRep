package adapter.opgave;

public class ElVare extends Vare{

    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    @Override
    public double beregnMoms() {
        double moms = super.getPris() *0.3;
        if (moms < 3){
            moms = 3;
        }
        return moms;
    }
}
