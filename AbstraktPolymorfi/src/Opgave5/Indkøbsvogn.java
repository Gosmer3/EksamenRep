package Opgave5;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Indkøbsvogn {
    private ArrayList<Vare> varer;

    public Indkøbsvogn(){
        this.varer = new ArrayList<>();

    }
    public void addVare(Vare vare){
        varer.add(vare);

    }
    public void removeVare(Vare vare){
        varer.remove(vare);
    }
    public double samletPris(){
        double samletPris = 0;
        for (int i = 0; i < varer.size(); i++) {
            samletPris += varer.get(i).salgspris();

        }
        return samletPris;
    }

    @Override
    public String toString() {
        return "Varer:" + varer;
    }
}
