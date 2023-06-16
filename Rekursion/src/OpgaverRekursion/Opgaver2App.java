package OpgaverRekursion;


import java.util.ArrayList;

public class Opgaver2App {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


        int evenCount = Opgaver2.ligeTal(list);
        System.out.println("Antal lige tal: " + evenCount);


        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);
        list2.add(12);
        list2.add(20);

        int counter2 = Opgaver2.countEvenNumbers(list2);
        System.out.println("Antal lige tal: " + counter2);

        //Opgave 2
        System.out.println(Opgaver2.palindrom("ABBA"));
        System.out.println(Opgaver2.palindrom("racecar"));


        //Opgave 3
        int[] numbers = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        System.out.println(Opgaver2.findesTal(numbers, 99));

        System.out.println(Opgaver2.findesTal(numbers, 16));

    }
}
