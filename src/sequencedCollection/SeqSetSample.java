package sequencedCollection;

import psrp.javaProblemSolving.oops.Trial;

import java.util.*;

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

    }
}
