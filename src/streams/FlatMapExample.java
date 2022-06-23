package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java devjournal","java");
        List<String> uniqueWord = words.stream()
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        uniqueWord.forEach(System.out::print);
    }
}
