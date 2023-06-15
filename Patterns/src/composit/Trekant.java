package composit;

public class Trekant extends Figur{
    private int grundlinje, højde;
    private String navn;

    public Trekant(int grundlinje, int højde) {
        this.navn = "Trekant";
        this.grundlinje = grundlinje;
        this.højde = højde;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    @Override
    public String tegn() {
        return getNavn();
    }

    @Override
    public double getAreal() {
        return (højde * grundlinje)/2;
    }
}
