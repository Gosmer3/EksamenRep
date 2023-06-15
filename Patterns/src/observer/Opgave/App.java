package observer.Opgave;

public class App {
    public static void main(String[] args) {

        Sælger s1 = new Sælger("Hansen");

        Indkøber i1 = new Indkøber("Jensen");

        Bogtitel b1 = new Bogtitel("Anders And", 6);
        Bogtitel b2 = new Bogtitel("Java", 8);

        Kunde k1 = new Kunde("Læsehest1");
        Kunde k2 = new Kunde("Læsehest2");
        Kunde k3 = new Kunde("Læsehest3");

        b1.addObserver(s1);
        b1.addObserver(i1);
        b2.addObserver(i1);

        b2.etKøb(k1);
        b2.etKøb(k2);
        b2.etKøb(k3);
        b1.etKøb(k1);
        b1.etKøb(k2);
        b1.etKøb(k3);
        System.out.println(k1.getBogtitels());
        System.out.println(k2.getBogtitels());
    }
}
