package ArrayList.Opgave2;

import java.util.ArrayList;

public class MethodsArrayList {

    /**
     * @param list
     * @return sums the mumbers in the list using a for loop
     */
    public int sumListe(ArrayList<Integer> list) {
        int resultat = 0;
        for (int i = 0; i < list.size(); i++) {
            int tal = list.get(i);
            resultat = resultat + list.get(i);
        }
        return resultat;
    }

    /**
     * @param list
     * @return sums the mumbers in the list using a forEach loop
     */
    public int sumListe2(ArrayList<Integer> list) {
        int resultat = 0;
        for (int tal : list) {
            resultat = resultat + tal;
        }
        return resultat;
    }

    /**
     * @param list
     * @return index at the first even number
     */
    public int hasEvenAtIndex(ArrayList<Integer> list) {
        int index = -1;
        int i = 0;
        while (index == -1 && i < list.size()) {
            if (list.get(i) % 2 == 0) {
                index = i;
            }
            i++;
        }
        return index;
    }

    public int min(ArrayList<Integer> list) {
        int low = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < low) {
                low = list.get(i);
            }
        }
        return low;
    }

    public double average(ArrayList<Integer> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

    public int countZeros(ArrayList<Integer> list) {
        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 0) {
                counter++;
            }
        }
        return counter;
    }

    public void swapEvenWithZero(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.set(i, 0);
            }
        }
    }

    public ArrayList<Integer> aEvenList(ArrayList<Integer> list) {
        ArrayList<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                newList.add(list.get(i));
            }
        }
        return newList;
    }


}
