package streams;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamA {

    /**
     * Find first non repeating word
     * @param args
     */

    public static void main(String[] args) {
        String input = "Java Articles are are Awesome";

       String nonRepeatingStr=  Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream()
               .filter(entry-> entry.getValue() == 1)
               .map(Map.Entry::getKey).findFirst().orElse("");
        System.out.println(nonRepeatingStr);

        // find first repeating

        String repeatingStr = Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().filter(entry->entry.getValue()>1)
                .map(Map.Entry::getKey).findFirst().orElse("");

        System.out.println(repeatingStr);


    }
}
