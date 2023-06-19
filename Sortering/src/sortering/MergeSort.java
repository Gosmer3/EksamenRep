package sortering;

public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array == null || array.length <= 1) {
            // Base case: Array er allerede sorteret eller tomt
            return;
        }
        // Opdel arrayet i to halvdele
        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right = new int[array.length - mid];
        System.arraycopy(array, 0, left, 0, mid);
        System.arraycopy(array, mid, right, 0, array.length - mid);

        // Kald rekursivt mergeSort på begge halvdele
        mergeSort(left);
        mergeSort(right);

        // Saml de to sorteret halvdele
        merge(left, right, array);
    }

    private static void merge(int[] left, int[] right, int[] array) {
        int i = 0; // Indeks til left-arrayet
        int j = 0; // Indeks til right-arrayet
        int k = 0; // Indeks til arrayet

        // Sammenlign og indsæt elementer i arrayet i den rigtige rækkefølge
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        // Indsæt eventuelle tilbageværende elementer fra left-arrayet
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        // Indsæt eventuelle tilbageværende elementer fra right-arrayet
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }
}
