package psrp.javaProblemSolving.streamAndFP;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8FP1 {

    public static void main(String[] args) {
        // Given two sorted arrays, the task is to merge them in a sorted manner.
        // Input: arr1[] = {1, 3, 4, 5}, arr2[] = {2, 4, 6, 8}
        // Output: arr3[] = {1, 2, 3, 4, 4, 5, 6, 8}

        int [] arr1 = {1,3,4,5};
        int [] arr2 = {2,4,6,8};



        // convert primitve array into stream using Array.stream and IntStream.of methods
        List<Integer> integerList1 = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        List<Integer> integerList2 = IntStream.of(arr2).boxed().collect(Collectors.toList());

        // Concat two array and store into a list
        List<Integer> integerList = Stream
                .concat(IntStream.of(arr1).boxed(),IntStream.of(arr2).boxed())
                .sorted()
                .collect(Collectors.toList());

        // using sorted method to sort and save into set
        Set<Integer> integerSet = Stream
                .concat(IntStream.of(arr1).boxed(), IntStream.of(arr2).boxed())
                //.sorted()
                .collect(Collectors.toCollection(LinkedHashSet::new));

        // Sort using Tree set and using natural sorted
        Set<Integer> integerTreeSet = Stream
                .concat(Arrays.stream(arr1).boxed(),Arrays.stream(arr2).boxed())
                .collect(Collectors.toCollection(TreeSet::new));

        integerList.forEach(System.out::println);

        System.out.println(" Linked Hash Set ");
        integerSet.forEach(System.out::println);

        System.out.println(" Tree Set ");
        integerTreeSet.forEach(System.out::println);
    }
}
