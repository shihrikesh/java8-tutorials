package mockTest4;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringManipulation {

    public static void main(String[] args) {
        String s = "dabfcadef";// -> dabfce

        // remove duplicate and print in order of string
        Arrays.stream(s.split(""))
                .distinct().forEach(System.out::println);

        // Add into map with key and value

        Map<String, Long> countWord = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        countWord.forEach((a,b)-> System.out.println("Word " + a+ " Value "+b));

    }
}
