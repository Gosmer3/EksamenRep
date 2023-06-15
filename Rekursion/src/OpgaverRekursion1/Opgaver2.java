package OpgaverRekursion1;

import java.util.ArrayList;

public class Opgaver2 {

    //Uden hjælpemetode
    public static int ligeTal(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        } else {
            int firstNumber = list.get(0);
            int count = (firstNumber % 2 == 0) ? 1 : 0;
            list.remove(0);
            return count + ligeTal(list);
        }
    }

    //Med hjælpemetoder
    public static int countEvenNumbers(ArrayList<Integer> list2) {
        return countEvenNumbersRecursive(list2, 0);
    }

    private static int countEvenNumbersRecursive(ArrayList<Integer> list2, int index) {
        if (index >= list2.size()) {
            return 0;
        } else {
            if (list2.get(index) % 2 == 0) {
                return 1 + countEvenNumbersRecursive(list2, index + 1);
            } else {
                return countEvenNumbersRecursive(list2, index + 1);
            }
        }
    }

    public static boolean palindrom(String tekst) {
        int n = tekst.length();
        return palindrom(tekst, 0, n - 1);
    }

    private static boolean palindrom(String tekst, int start, int end) {
        if(start >= end){
            return  true;
        }
        if (tekst.isEmpty()) {
            return false;
        }
        if (tekst.charAt(start) != tekst.charAt(end)){
            return false;
        }
        return palindrom(tekst, start + 1, end - 1);
    }
}