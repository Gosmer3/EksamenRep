package soegningelevopgaver;

public class SoegningApp {


    public static void main(String[] args) {
        Soegning s = new Soegning();

        // Kode til afprøvning af opgave 1
        int[] talArray = {2, 4, 8, 2};
        System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));
        talArray[2] = 15;
        System.out.println("Er der et ulige tal i talArray ? " + s.findUlige(talArray));

        // Her tilføjes kode til at afprøve opgaverne 2,3,5,6 og 7

        int[] resultat = {7, 56, 34, 3, 7, 14, 13, 4};
        System.out.println("Det første tal der er mellem 10 og 15: " + s.Mellem10Og15(resultat));

        int[] sum1 = {7, 9, 13, 7, 9, 13};
        int[] sum2 = {7, 9, 13, 13, 9, 7};

        System.out.println("Der er to ens ved siden af hinanden: " + s.toEns(sum1));
        System.out.println("Der er to ens ved siden af hinanden: " + s.toEns(sum2));

    }

}
