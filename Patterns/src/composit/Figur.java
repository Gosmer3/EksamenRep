package composit;

public abstract class Figur {


    public abstract String tegn();
    public abstract double getAreal();

    public void addFigur(Figur figur) {
        throw new UnsupportedOperationException();
    }
    public void removeFigur(Figur figur) {
        throw new UnsupportedOperationException();
    }
    public Figur getChild(int i) {
        throw new UnsupportedOperationException();
    }

}
