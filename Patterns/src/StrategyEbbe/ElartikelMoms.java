package StrategyEbbe;

public class ElartikelMoms implements Moms{
    @Override
    public double beregnMoms(double pris) {

        return 0.3;
    }
}
