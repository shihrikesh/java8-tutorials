package sequencedCollection;

import psrp.javaProblemSolving.oops.Trial;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SeqSetSample {

    public static void main(String[] args) {
        var set = new LinkedHashSet<>(List.of("a","b","c"));

        System.out.println("initial " +set);
        set.addLast("d");
        System.out.println(set);

        set.addFirst("e");
        System.out.println(set);

        set.addFirst("c");
        System.out.println(set);

        set.addLast("b");
        System.out.println(set);

        System.out.println(" Hash Set");
        var set1 =IntStream.range(1,50).boxed().collect(Collectors.toSet());
        var hashSet = new HashSet<>(List.of("a","b","c","3","z","y","1","2"));
        System.out.println(hashSet);

    }
}
