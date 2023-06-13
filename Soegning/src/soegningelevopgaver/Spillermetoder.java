package soegningelevopgaver;

import com.sun.tools.javac.Main;

import java.util.ArrayList;

public class Spillermetoder {
    // Opg 4.1
    public Spiller findScoreLinear(ArrayList<Spiller> spillere, int score) {
        Spiller spiller = null;
        int i = 0;
        while (spiller == null && i < spillere.size()) {
            Spiller s = spillere.get(i);
            if (s.getMaal() == score) {
                spiller = s;
            } else {
                i++;
            }
        }
        return spiller;
    }

    //Opg 4.2
    public Spiller findScoreBinær(ArrayList<Spiller> spillere,
                                  int score) {
        Spiller spiller = null;
        int left = 0;
        int right = spillere.size() - 1;
        while (spiller == null && left <= right) {
            int middel = (left + right) / 2;
            Spiller s = spillere.get(middel);
            if (s.getMaal() == score) {
                spiller = s;
            } else if (s.getMaal() > score) {
                right = middel - 1;
            } else {
                left = middel + 1;
            }
        }
        return spiller;
    }

    // Opg 4.3
    public String godSpiller(ArrayList<Spiller> spillere) {
        String navn = "";
        int i = 0;

        while (navn == "" && i < spillere.size()) {
            Spiller s = spillere.get(i);
            if (s.getHoejde() < 170 && s.getMaal() > 50) {
                navn = s.getNavn();
            }
            i++;
        }
        return navn;
    }
    // Her tilføjes metoder der løser opgve 4.2 og 4

    public static void main(String[] args) {
        Spillermetoder metoder = new Spillermetoder();

        // Her afprøves opgave 4.1
        ArrayList<Spiller> spillerListe = new ArrayList<>();
        spillerListe.add(new Spiller("Hans", 196, 99, 45));
        spillerListe.add(new Spiller("Bo", 169, 89, 60));
        spillerListe.add(new Spiller("Jens", 188, 109, 32));
        spillerListe.add(new Spiller("Finn", 194, 102, 12));
        spillerListe.add(new Spiller("Lars", 192, 86, 35));
        spillerListe.add(new Spiller("Mads", 200, 103, 37));


        //Opg 4.1
        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreLinear(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreLinear(spillerListe, 30));

        //Opg 4.2
        System.out.println("Spiller der har scoret 35 mål: " + metoder.findScoreBinær(spillerListe, 35));
        System.out.println("Spiller der har scoret 30 mål: " + metoder.findScoreBinær(spillerListe, 30));

        //Opg 4.3
        System.out.println("Den bedste spiller er: " + metoder.godSpiller(spillerListe));
    }
}
