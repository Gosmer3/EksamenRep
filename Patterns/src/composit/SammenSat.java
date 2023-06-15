package composit;

import java.util.ArrayList;
import java.util.List;

public class SammenSat extends Figur {
    private List<Figur> figurs;

    public SammenSat() {
        figurs = new ArrayList<>();
    }

    @Override
    public String tegn() {
        return null;
    }

    @Override
    public double getAreal() {
        int sum = 0;
        for (Figur f : figurs){
            sum += f.getAreal();
        }
        return sum;
    }

    public void addFigur(Figur f){
        if (!figurs.contains(f)){
            figurs.add(f);
        }
    }
    public void removeFigur(Figur f){
        if (figurs.contains(f)){
            figurs.remove(f);
        }
    }
    public Figur getChild(int i){
        if (i>=0&&i< figurs.size()){
            return figurs.get(i);
        }else{
            return null;
        }
    }

}
