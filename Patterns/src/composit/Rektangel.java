package composit;

public class Rektangel extends Figur {

    private int længde, brede;
    private String navn;

    public Rektangel(int længde, int brede) {
        this.navn = "Rektangel";
        this.længde = længde;
        this.brede = brede;
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
        return længde * brede;
    }
}
