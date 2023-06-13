package opgave5;

import com.sun.source.tree.NewArrayTree;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        Vare v1 = new Spiritus(700,"Don Julio", "Tequila", 47);
        Vare v2 = new Fødevare(400, "Pink lady","Sød",4);
        Vare v3 = new Fødevare(600, "Banan" , "Ikke dansk",6);
        Vare v4 = new ELArtikel(5000,"PS5", "God",30);

        Indkødsvong indkødsvong = new Indkødsvong();

        indkødsvong.addVare(v1);
        indkødsvong.addVare(v2);
        indkødsvong.addVare(v4);
        indkødsvong.addVare(v3);

        System.out.println(indkødsvong);

        System.out.println(indkødsvong.samletPris());
    }
}
