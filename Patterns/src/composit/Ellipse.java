package composit;

public class Ellipse extends Figur {

    private int radius1, radius2;
    private String navn;

    public Ellipse(int radius1, int radius2) {
        this.navn = "Ellipse";
        this.radius1 = radius1;
        this.radius2 = radius2;
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
        return 3.14 * radius1 * radius2;
    }
}
