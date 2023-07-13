package psrp.javaProblemSolving.gcAndClassLoader;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2 {

    // Given a string, find the words with the maximum number of vowels.
    //
    // Input: "The quick brown fox jumps right over the little lazy dog."
    //
    //		Maximum Number of Vowels: 2
    //
    //	output:	quick, over, little

    public static void main(String[] args) {
        String input = "the quick brown fox jumps right over the little lazy dog";
        String vowels = "aeiou";
        System.out.println(" Find word with max vowels");
        List<String> stringList = Arrays.asList(input.split(" "));
        Map<String, Long> countVowels = stringList.stream()
                .distinct()
                .collect(Collectors.toMap(Function.identity(), (Task2::countVowels)))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        countVowels.forEach((k, v) -> System.out.println(" key " + k + " length " + v));

        // check if word contains vowels or not
        Arrays.stream(input.split(" "))
                .filter(str-> str.replaceAll("[^aeiouAEIOU]", "").length() >=2)
                .forEach(System.out::println);

        System.out.println("hello".replaceAll("[aeiouAEIOU]", ""));
    }

    public static long countVowels(String s) {
        return s.chars().filter(ch -> 'a' == ch | 'e' == ch | 'i' == ch | 'o' == ch | 'u' == ch).count();
    }
}
