package AdapterEksempel;

public class ElVare extends Vare {
    public ElVare(int pris, String navn) {
        super(pris, navn);
    }

    public double beregnMoms(){
        double moms = getPris() * 0.30;
        if(moms < 3){
            moms = 3;
        }
        return moms + getPris();
    }
}
