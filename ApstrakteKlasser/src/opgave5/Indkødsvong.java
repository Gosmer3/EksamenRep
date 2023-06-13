package opgave5;

import java.util.ArrayList;

public class Indkødsvong {
    private ArrayList <Vare> vares;

    public Indkødsvong() {
        vares =  new ArrayList<>();
    }
    public void addVare(Vare vare){
        vares.add(vare);
    }
    public void removeVare(Vare vare){
        if (vares.contains(vare)){
            vares.remove(vare);
        }
    }
    public double samletPris(){
        double sum = 0.0;

        for (Vare v : vares){
            sum += v.salgsPris();
        }
        return sum;
    }

    @Override
    public String toString() {
        return vares.toString();
    }
}
