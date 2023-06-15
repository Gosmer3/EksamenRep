package observer.Opgave;

import java.awt.font.ImageGraphicAttribute;
import java.util.ArrayList;
import java.util.List;

public class Sælger implements Observer {
    private String navn;

    public Sælger(String navn) {
        this.navn = navn;
    }

    @Override
    public void update(Subjekt o) {
        if (o instanceof Bogtitel bogtitel){
            List <Bogtitel> andreBøger = new ArrayList<>();
            for (Kunde k : bogtitel.getKunder()){
                if (k.getBogtitels().contains(bogtitel)){
                    for (Bogtitel b : k.getBogtitels()){
                        if (!b.equals(bogtitel) && !andreBøger.contains(b)){
                            andreBøger.add(b);
                        }
                    }
                }
            }
        }
    }
}
