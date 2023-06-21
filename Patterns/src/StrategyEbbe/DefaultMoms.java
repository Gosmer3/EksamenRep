package StrategyEbbe;

import opg3.Moms;

public class DefaultMoms implements Moms {
    @Override
    public double beregnMoms(double pris) {
        return 0.25;
    }
}
