package minihandel;

public class FixedDiscount extends Discount {
    private int fixedDiscont;
    private int discountLimit;

    public FixedDiscount(int fixedDiscont, int discountLimit) {
        this.fixedDiscont = fixedDiscont;
        this.discountLimit = discountLimit;
    }
    @Override
    public double getDiscount(double pris){
        return pris;
    }
}
