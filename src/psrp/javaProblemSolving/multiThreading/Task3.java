package psrp.javaProblemSolving.multiThreading;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {

    // Input: organization
    //              output:
    //                             o -2
    //                             r -1
    //                             g -1
    //                             i- 2
    //                             and so on….
    //
    //  See if the same logic can be applied to find the “no of occurrences for each word in a given sentence”.

    public static void main(String[] args) {
        System.out.println(" Counting characters in word ******");
        String str = "organization";
        Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((key, value) -> System.out.println(key + " count is " + value));

        System.out.println(" Counting words in sentence ******");
        String word = "no of occurrences for each word in a given sentence for creating";
        Arrays.stream(word.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)-> System.out.println(k + " count id " + v));
    }
}
