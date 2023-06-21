package StrategyEbbe;

public class App {
    public static void main(String[] args) {
        Vare hammer = new Vare(20, "Hammer", "Hammer");
        Vare stikkontakt = new Elartikel(10, "Stikkontakt", "Stikkontakt", 1000);
        Vare agurk = new Fødevare(15, "Agurk", "Grøn", 10);
        Vare øl = new Spiritus(15, "øl", "øl", 4.5);

        Indkøbsvogn indkøbsvogn = new Indkøbsvogn();
        indkøbsvogn.addVare(hammer);
        indkøbsvogn.addVare(stikkontakt);
        indkøbsvogn.addVare(agurk);
        indkøbsvogn.addVare(øl);

        System.out.println(indkøbsvogn.totalPris());



    }
}
