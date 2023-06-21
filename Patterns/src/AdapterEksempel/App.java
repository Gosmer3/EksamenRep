package AdapterEksempel;

public class App {
    public static void main(String[] args) {
        Spiritus spiritus = new Spiritus(100,"Vodka");
        SpiritusAdapter Vodka = new SpiritusAdapter(spiritus);
        ElVare elpære = new ElVare(20,"Elpære");


        System.out.println(Vodka.beregnMoms());

    }
}
