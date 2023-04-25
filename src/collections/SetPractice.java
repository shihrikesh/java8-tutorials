package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class SetPractice {

    public static void main(String[] args) {

        // not maintaining any order, fast
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Walter");
        nameSet.add("Skyler");
        nameSet.add("Jessie");
        nameSet.add("Gus");
        nameSet.add("Saul");

        nameSet.forEach(System.out::println);

        // insertion order is maintained , As fast as hash set
        Set<Integer> integerSet = new LinkedHashSet<>();
        integerSet.add(1);
        integerSet.add(4);
        integerSet.add(6);
        integerSet.add(3);

        Iterator<Integer> integerIterator = integerSet.iterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }


        // Natural sorting order maintained
        Set<String> fruitsSet = new TreeSet<>();
        fruitsSet.add("Apple");
        fruitsSet.add("Guava");
        fruitsSet.add("Banana");
        fruitsSet.add("Kiwi");
        fruitsSet.add("PineApple");

        fruitsSet.forEach(System.out::println);

        Set<String> threadSafeSet = new CopyOnWriteArraySet<>();
        List<String> threadSafeList = new CopyOnWriteArrayList<>();

        Map<String, Integer> threadSafeMap = new ConcurrentHashMap<>();



    }


}
