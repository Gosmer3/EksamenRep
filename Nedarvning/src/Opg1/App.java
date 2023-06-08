package Opg1;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Person p1 = new Person("Jens", "vej1");
        Person p2 = new Person("Hans", "Vej2");

        Mekaniker m1 = new Mekaniker("Flemmeing", "vej3", LocalDate.of(2020, 02, 10), 120);
        Mekaniker m2 = new Mekaniker("Bo", "vej3", LocalDate.of(2020, 03, 10), 130);
        Mekaniker m3 = new Mekaniker("Ib", "vej3", LocalDate.of(2020, 04, 10), 140);

        Værkfører v1 = new Værkfører("Karl", "Byvej1", LocalDate.of(2000, 12, 03), 100,
                LocalDate.of(2019, 10, 19), 200);
        Værkfører v2 = new Værkfører("Karl", "Byvej1", LocalDate.of(2000, 12, 02), 100,
                LocalDate.of(2019, 10, 19), 200);
        Værkfører v3 = new Værkfører("Karl", "Byvej1", LocalDate.of(2000, 12, 01), 100,
                LocalDate.of(2019, 10, 19), 200);

        Synsmand s1 = new Synsmand("Per","byvej2",LocalDate.of(2013,10,23),200, 4);

        ArrayList<Mekaniker> mekanikers = new ArrayList<>();

        mekanikers.add(m1);
        mekanikers.add(m2);
        mekanikers.add(m3);
        mekanikers.add(v1);
        mekanikers.add(v2);

        System.out.println("Den samlede Uge for Listen er: " + samletLoen(mekanikers));

        mekanikers.add(s1);

        System.out.println("Nu med en Synsmand: " + samletLoen(mekanikers));
    }
    /**
     * Beregner summen af ugelønnen for alle i listen
     **/
    public static double samletLoen(ArrayList<Mekaniker> list) {
        double sum = 0;
        for (Mekaniker M : list) {
            sum += M.beregnLøn();
        }
        return sum;
    }
}
