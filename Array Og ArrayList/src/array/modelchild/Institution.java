package array.modelchild;

public class Institution {
    private String navn;
    private String adresse;
    private Child [] børn;
    private int MængdeAfBørn = 0;

    public Institution(String navn, String adresse) {
        this.navn = navn;
        this.adresse = adresse;
        this.børn = new Child[10];
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void addChild (Child child){
        børn[MængdeAfBørn] = child;
        MængdeAfBørn++;
    }

    public double averageAge(){
        int alder = 0;
        for (int i = 0; i < børn.length; i++) {
            alder += børn[i].getAge();
        }
        return alder/MængdeAfBørn;
    }

    public int numberOfGirls(){
        int count = 0;
        for (int i = 0; i < MængdeAfBørn; i++) {
            if (!børn[i].isBoy()){
                count++;
            }
        }
        return count;
    }
    public int numberOfBoys(){
        int count = 0;
        for (int i = 0; i < MængdeAfBørn; i++) {
            if (børn[i].isBoy()){
                count++;
            }
        }
        return count;
    }
}
