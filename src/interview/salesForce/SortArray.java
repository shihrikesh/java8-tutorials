package interview.salesForce;

public class SortArray {
    public static void main(String[] args) {
        int[] array = {3, 1, 5, 4, 7};
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int swap = array[i];
                    array[i] = array[j];
                    array[j] = swap;
                }
            }
        }

        for (int j : array) {
            System.out.println(j);
        }
    }
}
