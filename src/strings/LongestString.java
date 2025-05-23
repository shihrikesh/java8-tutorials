package strings;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LongestString {

    public static void main(String[] args) {
        List<String> words = List.of("java", "microservices", "stream", "kafka");
        System.out.println(words.stream()
                .max(Comparator.comparing(String::length))
                .orElse(""));

        List<Integer> list = List.of(1,2,3,2,1);
        System.out.println(IntStream.range(0,list.size()/2)
                .allMatch(i-> list.get(i).equals(list.get(list.size()-1-i))));

        List<String> input = List.of("cat", "dog", "elephant", "cat", "lion");

        /**
         * key: 3 val: [cat, dog, cat]
         * key: 4 val: [lion]
         * key: 8 val: [elephant]
         */
        input.stream().collect(Collectors.groupingBy(String::length))
                .forEach((k,v)-> System.out.println("key: "+k+" val: "+v));

        // Convert a List of Strings to a Map (word -> word.length),
        // handle duplicates by keeping longer
        /**
         * key: cat val: 3
         * key: elephant val: 8
         * key: dog val: 3
         * key: lion val: 4
         */
        //Map<String,Integer> map=
        input.stream().collect(Collectors
                        .toMap(Function.identity(),String::length,(pre,current)->Math.max(pre, current)))
                .forEach((k,v)-> System.out.println("key: "+k+" val: "+v));

        // Count frequency of each character
        input.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((k,v)-> System.out.println("key: "+k+" val: "+v));

    }
}
