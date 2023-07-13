package psrp.javaProblemSolving.collections;

import java.util.*;

public class Task1 {

    //Given two arrays of integers, compute the pair of values (one value in each array)
    // with the smallest (non-negative) difference. Return the difference.
    //Input : A[] = {l, 3, 15, 11, 2}
    //
    //        B[] = {23, 127, 235, 19, 8}
    //Output : 3
    //the pair is: 11, 8

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 15, 8, 2};
        int[] arr2 = {23, 127, 235, 19, 1};

        // sorting to start with max to lowest .
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int smallestDiff;
        int a;
        int b;

        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = arr1.length - 1; i >= 0; i--) {

            for (int k = 0; k < arr2.length; k++) {
                a = arr1[i];
                b = arr2[k];

                if (a >= b) {
                    smallestDiff = a - b;
                } else {
                    smallestDiff = b - a;
                }
                System.out.println(" Output: " + smallestDiff + " Pairs " + a + " and " + b);
                List<Integer> list = new ArrayList<>();
                list.add(a);
                list.add(b);
                map.put(smallestDiff, list);
            }
        }


        map.entrySet().forEach(System.out::println);
        System.out.println(" getting smallest difference value ");
        System.out.println(map.entrySet().stream().findFirst().orElseThrow(NoSuchFieldError::new));


    }
}
