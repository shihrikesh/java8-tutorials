package streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PracticeQuestions1 {

    public static void main(String[] args) throws NoSuchFieldException {
        // find duplicate number from list
        int[] array = {23, 43, 54, 32, 23, 45};
        Set<Integer> set = new HashSet<>();
        Arrays.stream(array).filter(i -> !set.add(i)).forEach(System.out::println);

        // Given a String, find the first non-repeated character

        System.out.println(" Given a String, find the first non-repeated character ");
        String input = "Java Hungry Java Blog Alive is Awesome";
        Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() == 1)
                .findFirst()
                .ifPresent(System.out::println);

        // print missing elements from sorted array 
        List<Integer> integers = Arrays.asList(3, 4, 5, 6, 7, 9); //(1,2,3,4,6);
        IntStream.rangeClosed(integers.get(0), integers.get(integers.size() - 1))
                .filter(i -> !integers.contains(i)).forEach(System.out::println);

        /*write java 8 program for below problem
        List<Employee> empList
        1) filter name start with "A"
        2) filter age<30
        3) filter nulls
        4) d istinct
        5) sort by empName
        6) return empList*/


        // java 8 program to find  highest length of string

        String[] arr = new String[]{"army", "man", "mumbai", "hrishi"};

        System.out.println(" max length of string ");
        int maxLength = Arrays.stream(arr)
                .max(Comparator.comparingInt(String::length))
                .map(String::length)
                .orElseThrow(NoSuchFieldException::new);

        System.out.println("Max String length " + maxLength);

        input = "army man mumbai hrishi";
        List<String> l = Arrays.asList(input);
        Stream.of(input.split(" "))
                .filter(s -> s.length() == l.stream()
                        .max(Comparator.comparing(String::length)).get().length()).forEach(System.out::println);

        System.out.println(" Print string with max length");
        Arrays.stream(arr)
                .filter(str ->
                        str.length() == Collections.max(Arrays.asList(arr), Comparator.comparingInt(String::length))
                                .length())
                .forEach(System.out::println);

        Arrays.stream(arr)
                .sorted(Comparator.comparingInt(String::length).reversed()).skip(0).limit(1)
                .map(String::length).forEach(System.out::println);


        /*int arr[] = new int[]{"army" ,"man","mumbai"};

        java 8 program to print the output as single string     "army,man,mumbai"*/
        System.out.println(" join elements from array");
        System.out.println(String.join(",", arr));


        //find duplicate elements in a given integers


        System.out.println(" Find duplicate elements ");
        List<Integer> dupli = Arrays.asList(1, 1, 3, 4, 5, 5, 5, 8, 9, 9);
        Set<Integer> dupElements = new HashSet<>();
        dupli.stream().filter(s -> !dupElements.add(s)).collect(Collectors.toSet()).forEach(System.out::println);


        //find out all the numbers starting with 1

        System.out.println(" find out all the numbers starting with 1 ");
        List<Integer> oneStart = Arrays.asList(11, 12, 67, 271, 89, 22, 17, 19);
        oneStart.stream()
                .map(String::valueOf)
                .filter(i -> i.startsWith("1"))
                .map(Integer::parseInt)
                .collect(Collectors.toList()).forEach(System.out::println);


        // Max value
        System.out.println(" Max value");
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Integer max = myList.stream().max(Integer::compare).orElse(null);
        System.out.println(max);

        //Sort all thevalues

        System.out.println(" Sort list ");
        myList.stream().sorted().collect(Collectors.toList()).forEach(System.out::println);


        //find only duplicate elements with its count from      the  String

        System.out.println(" find duplicate element with its count ");
        List<String> stringList = Arrays.asList("AA", "BB", "CC", "AA");

        stringList
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(map -> map.getValue() > 1)
                .forEach(map -> System.out.println("String " + map.getKey() + " count is " + map.getValue()));

        List<String> collect4 = stringList
                .stream()
                .distinct()
                .filter(ss -> Collections.frequency(stringList, ss) > 1)
                .collect(Collectors.toList());
        System.out.println(collect4);

//        Find the longest word in the given string

        System.out.println(" Find word with maximum length ");
        String w = "I am interested to grow in my organization anotherBigwo";
        List<String> strList = Arrays.asList(w.split(" "));
        System.out.println(strList.stream()
                .filter(str -> str.length() ==
                        Collections.max(strList, Comparator.comparingInt(String::length)).length())
                .collect(Collectors.toList()));

        System.out.println(Stream.of(w.split(" "))
                .collect(Collectors.groupingBy(String::length))
                .entrySet().stream().max(Comparator.comparingInt(Map.Entry::getKey)));


//          decendingorder
//        Java 8 program to Count Strings whose length is greater than 3 in List?

        System.out.println(" Print string whose length greater than 3 ");
        strList.stream().filter(str -> str.length() > 3).forEach(System.out::println);
//        Java 8 program to perform concatenation on two Streams?

        System.out.println(" Concatenate two streams");
        Stream.concat(Stream.of("hello", "word"), Stream.of("this", "IS Stream ", "Concatenation"))
                .forEach(System.out::println);



        /*Apply the below rules and write the login using streams

        1.Filter out the strings that start with a vowel (a, e, i, o, u).
        2.Convert the remaining strings to uppercase.
        3.Sort the strings in descending order based on their length.
        4.Join the sorted strings into a single comma-separated string.

                Input- apple, banana, orange, elephant, iguana, octopus, unicorn
        Output - ELEPHANT, UNICORN, ORANGE, IGUANA, , APPLE*/

        System.out.println(" Find words starting from vowels ");
        String[] s = {"apple", "banana", "orange", "elephant", "iguana", "octopus", "unicorn"};
        System.out.println(Arrays.stream(s)
                .filter(str -> str.matches("[aeiouAEIOU]\\w*"))
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining("-")));

    }
}
