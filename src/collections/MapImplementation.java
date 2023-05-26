package collections;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class MapImplementation {

    public static void main(String[] args) {
        Map<Integer, String > hashMap = new HashMap<>();

        hashMap.put(1, "hrishi");
        hashMap.put(2, "ankesh");
        hashMap.put(5, "jerry");
        hashMap.put(3, "ankit");
        hashMap.put(4, "anoop");
        hashMap.put(null, "manoj");
        hashMap.put(7, null);

        System.out.println(" HashMap implementation");
        hashMap.forEach((k,v)-> System.out.println("key is "+ k + " value is " + v));


        // Hashtable is an obsolete class and you should be using ConcurrentHashMap in place of Hashtable in Java.
        Map<Integer, String > hashtable = new Hashtable<>();

        hashtable.put(1, "hrishi");
        hashtable.put(2, "ankesh");
        hashtable.put(5, "jerry");
        hashtable.put(3, "ankit");
        hashtable.put(4, "anoop");
        //hashtable.put(null, "manoj");
        //hashtable.put(7, null);

        System.out.println(" HashTable implementation");
        hashtable.forEach((k,v)-> System.out.println("key is "+ k + " value is " + v));


        Map<Integer, String > linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(1, "hrishi");
        linkedHashMap.put(2, "ankesh");
        linkedHashMap.put(4, "anoop");
        linkedHashMap.put(3, "ankit");
        linkedHashMap.put(null, "manoj");
        linkedHashMap.put(7, null);

        System.out.println(" LinkedHashMap implementation, Insertion Order is maintained ");
        linkedHashMap.forEach((k,v)-> System.out.println("key is "+ k + " value is " + v));


        Map<Integer, String > treeMap = new TreeMap<>();

        treeMap.put(1, "hrishi");
        treeMap.put(2, "ankesh");
        treeMap.put(4, "anoop");
        treeMap.put(3, "ankit");
        treeMap.put(970, "ankit");
        treeMap.put(700, "ankit");
        // uncomment below and see null pointer, find why tree map dont allow null
        // comparator in TreeMap, comparable does not permit null key, uses natural ordering
        // treeMap.put(null, "manoj");
        treeMap.put(7, null);

        System.out.println(" Treemap implementation, natural order maintained using Comparable implementation ");
        treeMap.forEach((k,v)-> System.out.println("key is "+ k + " value is " + v));


        Map<Integer, String > concurrentHashMap = new ConcurrentHashMap<>();

        // https://www.baeldung.com/java-synchronizedmap-vs-concurrenthashmap

        concurrentHashMap.put(1, "hrishi");
        concurrentHashMap.put(11, "ankit");
        concurrentHashMap.put(2, "ankesh");
        concurrentHashMap.put(4, "anoop");
        concurrentHashMap.put(3, "ankit");
        concurrentHashMap.put(970, "ankit");
        concurrentHashMap.put(700, "ankit");
        // uncomment below and see null pointer, find why tree map dont allow null
        // comparator in TreeMap, comparable does not permit null key, uses natural ordering
        // treeMap.put(null, "manoj");

        System.out.println(" ConcurrentHashMap implementation ");
        concurrentHashMap.forEach((k,v)-> System.out.println("key is "+ k + " value is " + v));
    }
}
