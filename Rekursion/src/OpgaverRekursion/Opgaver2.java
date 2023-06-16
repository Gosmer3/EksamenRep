package OpgaverRekursion;

import java.sql.Array;
import java.util.ArrayList;

public class Opgaver2 {


    //Opgave 1 Lav en rekursiv metode der kan finde antallet af lige tal i en liste
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

    //   Opgave 2 Skriv en statisk rekursiv metode public static boolean palindrom(String tekst) der
//   returnerer true hvis teksten er et palindrom og ellers false. Anvend hjælpe metoder, så der ikke skal
//   laves substrings
    public static boolean palindrom(String tekst) {
        int n = tekst.length();
        return palindrom(tekst, 0, n - 1);
    }

    private static boolean palindrom(String tekst, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (tekst.isEmpty()) {
            return false;
        }
        if (tekst.charAt(start) != tekst.charAt(end)) {
            return false;
        }
        return palindrom(tekst, start + 1, end - 1);
    }

    //Opgave 3 lav en rekursiv søgning der skal afgøre om et tal findes i et heltalsarray
    public static boolean findesTal(int[] numbers, int target) {
        return findesTal(numbers, target, 0, numbers.length - 1);
    }

    private static boolean findesTal(int[] numbers, int target, int left, int right) {
        if (numbers.length == 0) {
            return false;
        }
        if (left > right) {
            return false;
        }
        int middle = (left + right) / 2;
        if (numbers[middle] == target) {
            return true;
        } else if (numbers[middle] < target) {
            return findesTal(numbers, target, middle + 1, right);
        } else {
            return findesTal(numbers, target, left, middle - 1);
        }
    }
}
