package Opgave5;

import java.security.SignatureException;

public class App {
    public static void main(String[] args) {
        Vare æble = new Fødevare(3,"Æble","Dansk æble",7);
        Vare Cornflakes = new Fødevare(25,"Cornflakes","Dansk cornflakes",200);
        Vare Vodka = new Spiritus(200,"Vodka","Russsisk vodka",70);
        Vare Øl = new Spiritus(18,"Tuborg","Dansk øl",4.5);
        Vare Xbox = new ElArtikel(3000,"Xbox","Konsol",180);


        Indkøbsvogn indkøbsvogn = new Indkøbsvogn();
        indkøbsvogn.addVare(æble);
        indkøbsvogn.addVare(Cornflakes);
        indkøbsvogn.addVare(Vodka);
        indkøbsvogn.addVare(Xbox);
        indkøbsvogn.addVare(Øl);

        System.out.println(indkøbsvogn);
        System.out.println(indkøbsvogn.samletPris());



    }
}
