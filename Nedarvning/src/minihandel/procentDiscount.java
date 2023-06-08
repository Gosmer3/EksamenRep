package minihandel;

public class procentDiscount extends Discount{
    private int procentDiscount;

    public procentDiscount(int procentDiscount) {
        this.procentDiscount = procentDiscount;
    }

    @Override
    public double getDiscount(double pris) {
        return pris/0.15;
    }
}
