package opg1;

public class Træ implements Measurable{
    private String navn;

    private double højde;

    public Træ(String navn, double højde) {
        this.navn = navn;
        this.højde = højde;
    }

    @Override
    public double getMeasure() {
        return højde;
    }
}
