package classroom;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReturnFrequencyOfWords {

    // Given a string "Ann while Bob had had had had had had had had had had had a better effect on on the teacher".
    // Find the frequency of each word.

    public static void main(String[] args) {
        String str = "Ann while Bob had had had had had had had had had had had a better effect on on the teacher";
        Map<String, Long> stringFrequency = Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // count each character in total
        System.out.println(Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(String::length))));

        System.out.println(Arrays.stream(str.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.groupingBy(String::length))));

        stringFrequency.forEach((k,v)-> System.out.println("Word: "+ k + " Frequency " + v));
    }
}
