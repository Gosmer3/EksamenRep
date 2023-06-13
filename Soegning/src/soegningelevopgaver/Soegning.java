package soegningelevopgaver;

public class Soegning {

    public boolean findUlige(int[] tabel) {
        // Opg1
        boolean found = false;

        for (int i = 0; i < tabel.length; i++) {
            if (tabel[i] % 2 != 0) {
                found = true;
            }
        }
        return found;
    }

    //Opg2
    public int Mellem10Og15(int[] tabel) {
        int target = -1;
        int i = 0;
        boolean found = false;

        while (!found && i < tabel.length) {
            int k = tabel[i];
            if (k >= 10 && k <= 15) {
                found = true;
                target = k;
            } else {
                i++;
            }
        }
        return target;
    }

    //Opg3
    public boolean toEns(int[] tabel) {
        boolean ens = false;
        int i = 0;
        while (!ens && i < tabel.length - 1) {
            int taget = tabel[i];
            if (taget == tabel[i + 1]) {
                ens = true;
            } else {
                i++;
            }
        }
        return ens;
    }


    // her skriver du metoder til opgaverne 2,3,5,6 og 7
}
