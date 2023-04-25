package collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListPractice {

    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Walter");
        nameList.add("Skyler");
        nameList.add("Jessie");
        nameList.add("Gus");
        nameList.add("Saul");

        nameList.forEach(System.out::println);

        // insertion order is maintained , As fast as hash set
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(4);
        integerList.add(6);
        integerList.add(3);

        for (Integer integer : integerList) {
            System.out.println(integer);
        }


        // Thread Safety
        List<String> fruitsList = new CopyOnWriteArrayList<>();
        fruitsList.add("Apple");
        fruitsList.add("Guava");
        fruitsList.add("Banana");
        fruitsList.add("Kiwi");
        fruitsList.add("PineApple");

        fruitsList.forEach(System.out::println);
    }
}
