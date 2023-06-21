package StrategyEbbe;

public class FødevareMoms  implements Moms {
    @Override
    public double beregnMoms(double pris) {
        return 0.05;
    }
}
