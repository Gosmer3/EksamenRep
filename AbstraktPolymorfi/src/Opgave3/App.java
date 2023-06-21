package Opgave3;

import java.util.ArrayList;
public class App {
    public static double samletLoen(ArrayList<Mekaniker> mekanikerList){
       double sum = 0;
        for(Mekaniker mekaniker : mekanikerList){
            sum += mekaniker.beregnLøn();
        }
        return sum;

    }


    public static void main(String[] args) {
        ArrayList<Mekaniker> mekanikerList = new ArrayList<>();
//        Mekaniker m1 = new Værkfører("Jens", "Byvej 5", 2015, 250, 2020, 1500);
//        Mekaniker m2 = new Mekaniker("Johnni", "Byvej 1", 2000, 200);
//        Mekaniker m3 = new Mekaniker("Ole", "Byvej 2", 2000, 200);
//        Mekaniker m4 = new Mekaniker("Bo", "Byvej 3", 2005, 200);
//        Mekaniker m5 = new Værkfører("Ib", "byvej 4", 1990, 250, 2020, 1500);
//        Mekaniker m6 = new Synsmand("Keld", "Byvej 5", 2000, 210, 30);

//        mekanikerList.add(m1);
//        mekanikerList.add(m2);
//        mekanikerList.add(m3);
//        mekanikerList.add(m4);
//        mekanikerList.add(m5);
//        mekanikerList.add(m6);
////
        System.out.println(samletLoen(mekanikerList));
    }

}
