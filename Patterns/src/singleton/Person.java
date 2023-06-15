package singleton;

public class Person {
    private String navn, efterNavn;
    private int alder;

    public Person(String navn, String efterNavn, int alder) {
        this.navn = navn;
        this.efterNavn = efterNavn;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return navn + " " + efterNavn + " " + alder;
    }
}
