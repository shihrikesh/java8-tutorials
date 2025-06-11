package sorting;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountA {

    public static void main(String[] args) {
        // count second most frequent word form list

        List<String> words = Arrays.asList("apple", "orange",
                "apple", "orange", "mango", "banana",
                "apple", "orange", "banana","apple");

        var map =
        words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);
                //.forEach((k,v)-> System.out.println("key: "+ k + " val:"+ v));

        var sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.<String,Long>comparingByValue().reversed())
                .skip(1)
                .findFirst();
        System.out.println(sortedMap);
    }
}
