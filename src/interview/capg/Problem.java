package interview.capg;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Problem {

    // in a given list, find repeated element

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,1,3,4,5);

        // 3
        // map
        //list.stream().collect(Collectors.groupingBy(a-> Collectors.counting()))

        // set

        Set<Integer> set = new HashSet<>();
        list.stream()
                .filter(a-> !set.add(a)).toList()
                .forEach(System.out::println);
        //set.forEach(System.out::println
        // );
    }
}
