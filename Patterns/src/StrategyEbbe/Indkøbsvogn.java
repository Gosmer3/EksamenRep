package StrategyEbbe;

import java.util.ArrayList;

public class Indkøbsvogn {
    private ArrayList<Vare> varer = new ArrayList<>();

    public void addVare(Vare vare) {
        varer.add(vare);
    }

    public ArrayList<Vare> getVarer() {
        return varer;
    }

    public double totalPris() {
        double pris = 0;
        for (Vare vare : varer) {
            pris += vare.getPrisPlusMoms();
        }
        return pris;
    }
}
