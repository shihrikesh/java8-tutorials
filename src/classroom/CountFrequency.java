package classroom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class CountFrequency {

    public static void main(String[] args) {
        int [] arr = {3,2,3,2,5,5,6,7};
        IntStream.of(arr).boxed()
                .collect(toMap(Function.identity(), x->1L, Long::sum))
                .forEach((k,v)-> System.out.println("key " + k + " has Frequency "+ v));

    }
}
