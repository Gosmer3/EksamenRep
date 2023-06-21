package AdapterEksempel;

public class Spiritus {
    private int prisen;

    private String betegnelse;

    public Spiritus(int prisen, String betegnelse) {
        this.prisen = prisen;
        this.betegnelse = betegnelse;
    }

    public int getPrisen() {
        return prisen;
    }

    public void setPrisen(int prisen) {
        this.prisen = prisen;
    }

    public String getBetegnelse() {
        return betegnelse;
    }

    public void setBetegnelse(String betegnelse) {
        this.betegnelse = betegnelse;
    }
    public double beregnMoms(){
        double moms = 0.80 * prisen;
        return moms + prisen;
    }
}
