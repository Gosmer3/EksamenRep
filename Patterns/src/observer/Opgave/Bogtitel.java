package observer.Opgave;

import java.util.ArrayList;

public class Bogtitel implements Subjekt{
    private String titel;
    private int antal;
    private ArrayList<Observer> observers;
    private ArrayList<Kunde> kunder;

    public Bogtitel(String titel, int antal) {
        this.titel = titel;
        this.antal = antal;
        observers = new ArrayList<>();
        kunder = new ArrayList<>();
    }

    public String getTitel() {
        return titel;
    }

    public int getAntal() {
        return antal;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public ArrayList<Kunde> getKunder() {
        return kunder;
    }
    public void indkødTilLager (int antal){
        this.antal += antal;
    }
    public void etKøb(Kunde k){
        if (antal > 0){
            antal--;
            k.addBogtital(this);
            notifyObserver();
        }
    }
    private void notifyObserver (){
        for (Observer o : observers){
            o.update(this);
        }
    }
    public void removeKunde(Kunde k){
        kunder.remove(k);
        k.removeBogtitel(this);
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
    observers.remove(o);
    }

}
