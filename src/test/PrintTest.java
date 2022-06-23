package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintTest {

    public static void main(String[] args) {
        /*Random // for each
        System.out.println(Math.random());*/

        /*Write a program to print 5 random numbers using forEach in Java 8?
                Write program to remove duplicate charachter from string*/

        double d1 = 1.0;
        double d2 = 0.0;
        System.out.println("args = " + d1 / d2);

        // print abacbb as a2b3c1
        String str = "abacbb";
        char[] cahrArray = str.toCharArray();
        Map<Character, Integer> countCharMap = new HashMap<>();
        int count = 1;
        for (Character c : cahrArray) {
            if (countCharMap.containsKey(c)) {
                countCharMap.put(c, countCharMap.get(c) + count);
            } else {
                countCharMap.put(c, count);
            }
        }


        countCharMap.forEach((c, i) -> System.out.println("args = " + c + i));
// print from array List >5
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //int[] array2 = new int[10];
        Arrays.stream(array).filter((i) -> i > 5).forEach(System.out::println);


    }
}
