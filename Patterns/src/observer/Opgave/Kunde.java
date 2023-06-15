package observer.Opgave;

import java.util.ArrayList;

public class Kunde {
    private String navn;
    private ArrayList<Bogtitel> bogtitels;

    public Kunde(String navn) {
        this.navn = navn;
        bogtitels = new ArrayList<>();
    }
    public void addBogtital(Bogtitel b){
        bogtitels.add(b);
    }
    public void removeBogtitel(Bogtitel b){
        bogtitels.remove(b);
    }

    public ArrayList<Bogtitel> getBogtitels() {
        return bogtitels;
    }
}
