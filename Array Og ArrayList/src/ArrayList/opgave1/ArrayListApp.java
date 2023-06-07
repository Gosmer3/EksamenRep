package ArrayList.opgave1;

import java.util.ArrayList;

public record ArrayListApp() {
    //1.1 Opret arrayList main metode og arraylist med Strings
    public static void main(String[] args) {

        ArrayList<String> navneList = new ArrayList<>();

        //1.2 Tilføj tekststrenge til arraylisten
        navneList.add("Hans");
        navneList.add("Viggo");
        navneList.add("Jens");
        navneList.add("Børge");
        navneList.add("Bent");

        //1.3 Udskriv antal elementer i listen
        System.out.println(navneList.size());

        //1.4 Tilføj tekstreng "Jane" på indeksplads 2 i arraylisten
        navneList.add(2, "Jane");

        //1.5 Udskriv arraylisten
        System.out.println(navneList);

        //1.6 Slet elementet på indeksplads 1 i arraylisten
        navneList.remove(1);

        //1.7 Tilføj tekstreng "Pia" forrest i arraylisten
        navneList.add(0, "Pia");

        //1.8 Tilføj tekstreng "Ib" bagerst i arraylisten
        navneList.add("Ib");

        //1.9 Udskriv antal elementer i arraylisten
        System.out.println(navneList.size());

        //1.10 På indeks plads 2 skal elementet ændres til at være ”Hansi”
        navneList.set(2, "Hansi");

        //1.11 Udskriv antal elementer i listen
        System.out.println(navneList.size());

        //1.12 Udskriv indholdet af arraylisten
        System.out.println(navneList);

        //1.13 Gennemløb listen med en for – løkke og udskiver længden på hver af tekststrengene i listen

        for (String s : navneList) {
            System.out.println(s.length());
        }

        //1.14 Gennemløber listen med en forEach – løkke og udskiver længden på
        // hver af tekststrengene i listen

        for (int i = 0; i < navneList.size(); i++) {
            System.out.println(navneList.get(i).length());
        }
    }

}
