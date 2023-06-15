package observer.Opgave;

public class Indkøber implements Observer{
    private String navn;

    public Indkøber(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subjekt o) {
        if (o instanceof Bogtitel bogtitel){
            if (((Bogtitel) o).getAntal() < 6){
                bogtitel.indkødTilLager(10);
                System.out.println("Der er nu bestilt 10 bøger mere af bogen " + bogtitel.getTitel());
            }
        }
    }
}
