package streams;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StreamB {


    /**
     * Use case around repeated and non-repeated numbers
     * @param args
     */
    public static void main(String[] args) {

        List<Integer> list = List.of(2,2,3,5,6,6,7);
        Set<Integer> set = new HashSet<>();

        List<Integer> repeatingNumber=  list.stream()
                .filter(num-> !set.add(num))
                .toList();

        System.out.println("Repeating Number");
        repeatingNumber.forEach(System.out::println);


        System.out.println(" Non repeating integers");
        list.stream().filter(num-> !repeatingNumber.contains(num))
                .toList()
                .forEach(System.out::println);

        System.out.println("distinct integers");

        list.stream().distinct().toList().forEach(System.out::println);

    }
}
