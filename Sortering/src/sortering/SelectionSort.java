package sortering;

import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {
    private static void swap(int[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    
    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[minPos]) {
                    minPos = j;
                }
                
            }
            swap(list, i, minPos);
        }
    }

    private static void swap(ArrayList<Integer> list, int i, int j) {
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    public static void selectionSortArrayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int minPos = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(minPos)) {
                    minPos = j;
                }
            }
            swap(list, i, minPos);
        }
    }


}
