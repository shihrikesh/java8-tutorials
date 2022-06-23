package streams;

import com.sun.webkit.dom.HTMLOptionsCollectionImpl;

import java.util.*;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "i am java developer", "stram Java 8");
        List<Integer> wordCount = words.stream()
                .map(String::length)
                .collect(Collectors.toList());
        wordCount.forEach(a -> System.out.println("args = " + a));
        wordCount.forEach(System.out::println);

        Map<String, List<String>> people = new HashMap<>();
        people.put("John", Arrays.asList("555-1123", "555-3389"));
        people.put("Mary", Arrays.asList("555-2243", "555-5264"));
        people.put("Steve", Arrays.asList("555-6654", "555-3242"));

        List<String> phones = people.values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
        phones.forEach(System.out::println);
    }
}
