package psrp.javaProblemSolving.streamAndFP;

public class Java8FP2 {

    public static void main(String[] args) {
        // Find the first repeating element in an array of integers
        //
        //Input:  arr[] = {6, 10, 5, 4, 9, 120, 4, 6, 10}
        //
        //Output: 6 [6 is the first element that repeats]

        int[] arr = {6, 5, 9, 0, 120, 4, 10};

        for (int i = 0; i < arr.length; i++) {
            boolean repeating = false;
            int num = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                if (num == arr[k]) {
                    repeating = true;
                    System.out.println(num);
                }
            }
            if (repeating) {
                break;
            }
        }
    }
}
