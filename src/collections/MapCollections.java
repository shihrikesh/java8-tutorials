package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

public class MapCollections {

    public static void main(String[] args) {

        Map<String , Double> hashMap = new HashMap<>();
        hashMap.put("3", 345.0);
        hashMap.put("2", 145.0);
        hashMap.put("7", 35.0);
        hashMap.put("1", 54.0);
        hashMap.put("32", 3405.0);
        hashMap.put("12", 1045.0);
        hashMap.put("73", 5.0);
        hashMap.put("19", 4.0);

        hashMap.entrySet().forEach(System.out::println);

        Map<String , Double> treeMap = new TreeMap<>();
        treeMap.put("3", 345.0);
        treeMap.put("2", 145.0);
        treeMap.put("7", 35.0);
        treeMap.put("1", 54.0);
        treeMap.put("32", 3405.0);
        treeMap.put("12", 1045.0);
        treeMap.put("73", 5.0);
        treeMap.put("19", 4.0);

        System.out.println(" ******************** ");
        System.out.println(" Tree map, in natural order ");
        treeMap.entrySet().forEach(System.out::println);

        System.out.println(" ******************** ");

        System.out.println(" using java 8 sort ");
        treeMap.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);


        System.out.println(" ************************** ");

        for (String str: treeMap.keySet()) {
            System.out.println(treeMap.get(str));
        }

        // Get all keys and sort them and store into list
        // compate each value in list with map iteration and find valyue mathcing
        // matching entry into new liknedHashMap to store order

        System.out.println(" ************************** ");

        System.out.println(" sort map based on values ");
        List<Double> list = new LinkedList<>();
        Map<String, Double> sortedMap = new LinkedHashMap<>();

        for (Map.Entry<String, Double> entry: treeMap.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);

        list.stream().map(val-> {
            for (String value: hashMap.keySet() ) {
                if(Objects.equals(hashMap.get(value), val)){
                    sortedMap.put(value, hashMap.get(value));
                }
            }
            return null;
        }).forEach(System.out::println);


        System.out.println("  *******************");
        System.out.println(" Sorted Map ");
        list.forEach(System.out::println);
        sortedMap.forEach((key, value) -> System.out.println(key + " value " + value));
    }
}
