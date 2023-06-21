package StrategyEbbe;

public class SpiritusMoms implements Moms {

    @Override
    public double beregnMoms(double pris) {
        if (pris > 90) {
            return 1.20;
        }
        return 0.8;
    }
}
