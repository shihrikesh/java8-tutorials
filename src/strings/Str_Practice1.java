package strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Str_Practice1 {

    public static void main(String[] args) {
        //String strSentence = " Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";
        // Output should be exactly like --> {BYE-3,HI-2,EPAM-6}

        System.out.println(" Find Word Occurrence ");

        String sentence = " Hi EPAM bye EPAM goodbye EPAM welcome ePAM Hi There epAM bye bye EPaM";
        Arrays.stream(sentence.split(" ")).map(String::toUpperCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .forEach(map -> System.out.println(map.getKey() + "-" + map.getValue()));

        // find output of below lines
        System.out.println(" String manipulation, Immutability ");

        String s1 = new String("EPAM");

        String s2 = s1;

        //s1.append("Systems");

        System.out.println(s1 == s2);
        System.out.println("EPAM " + "Systems " + s1 == s2);
        main("hello");

        System.out.println(" Traditional approach ");
        String text = ".Hi bye hi bye";
        String cleanText = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        System.out.println(cleanText);
        String[] words = cleanText.split("\\s+");
        Map<String, Integer> wordOccurrences = new HashMap<>();


        for (String word : words) {
            if (wordOccurrences.containsKey(word)) {
                int count = wordOccurrences.get(word);
                wordOccurrences.put(word, count + 1);
            } else {
                wordOccurrences.put(word, 1);
            }
        }

        //occurrences
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // what happens if we overload main method, will it throw any exception ?
    public static void main(String args) {
        System.out.println(" overloading main method " + args);

    }
}
