package classroom;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPracticeA {

    // https://blog.stackademic.com/java-stream-api-15-interview-questions-every-developer-should-practice-d754e66e3cce

    public static void main(String[] args) {

        // Problem 1: Write a Program to find the Maximum element in an array?

        int arr[] = {5,1,2,8};
        System.out.println(Arrays.stream(arr)
                .max().getAsInt());

        // Problem 2: Write a program to print the count of each character in a String?

        String str =  "Now is the winter";
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .forEach((k,v)-> System.out.println("Key "+k+" val:"+v));

        // Problem 3: Given two arrays of Person objects, merge them,
        // sort them by age in ascending order,
        // and then by name alphabetically for people with the same age.

        Person[] pList1 = {new Person("Alice", 25), new Person("Bob", 30),
                new Person("Charlie", 25)};
        Person[] pList2 = {new Person("David", 30), new Person("Eve", 25),
                new Person("Alice", 25)};

        System.out.println(" sort first");
        System.out.println(Stream.concat(Arrays.stream(pList1), Arrays.stream(pList2))
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))
                .toList());

        Stream.concat(Arrays.stream(pList1),Arrays.stream(pList2))
                .sorted(Comparator.comparingInt(Person::getAge)
                        .thenComparing(Person::getName))
                .toList()
                .forEach(System.out::println);

        // Problem 4: Write a program to find the length of the longest name in a list of strings.
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eva");
        System.out.println(names.stream().mapToInt(String::length).max().orElse(0));

        // find string with longest name

        System.out.println(" Print string with longest length");
        System.out.println(names.stream().max(Comparator.comparingInt(String::length)).get());

        System.out.println(" Using Reduce function");
        System.out.println(names.stream().reduce((x, y) -> x.length() > y.length() ? x : y).get());

        // Problem 5: Check if a list of integers contains any prime numbers.

        List<Integer> numbers = Arrays.asList(4, 6, 8, 11, 12, 13, 14, 15);
        boolean hasPrime = numbers.stream()
                .anyMatch(num -> isPrime(num));


        // Problem 6: Count the total number of distinct words (case-insensitive) across multiple sentences.

        List<String> sentences = Arrays.asList(
                "Java Stream API provides a fluent interface",
                "It supports functional-style operations on streams",
                "In this exercise, you need to count words"
        );

        System.out.println(sentences.stream()
                .map(x -> x.split(" "))
                .flatMap(y -> Arrays.stream(y))
                .collect(Collectors.toSet()));

        sentences.stream().map(x-> x.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .toList()
                .forEach(System.out::println);

        // Problem 7: Find and concatenate the first two words that have even lengths.

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");
        System.out.println(words.stream().filter(x -> x.length() % 2 == 0)
                .limit(2)
                .collect(Collectors.joining(" ")));

        //Problem 8: Given a list of transactions, find the sum of transaction amounts for each day and sort by date.

        List<Transaction> transactions = Arrays.asList(
                new Transaction("2022-01-01", 100),
                new Transaction("2022-01-01", 200),
                new Transaction("2022-01-02", 300)
        );
        transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingLong(Transaction::getAmount)))
                .forEach((k,v)-> System.out.println("key "+ k +" val: "+v));

        // Problem 9: Given two arrays of integers, merge them, sort them, and then
        //filter out any numbers greater than a specified threshold.

        int[] array1 = {1, 5, 3, 9, 7};
        int[] array2 = {2, 4, 6, 8, 10};
        int threshold = 7;

        IntStream.concat(Arrays.stream(array1), Arrays.stream(array2)).boxed()
                .sorted().filter(n-> n>threshold)
                .toList().forEach(System.out::println);

        System.out.println(IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .boxed()
                .sorted().filter(n -> n > threshold)
                .toList());

        // Problem 11: Partition a list of numbers into two groups: prime and non-prime numbers.

        List<Integer> numbers1 = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10);
        Map<Boolean, List<Integer>> partitioned = numbers1.stream()
                .collect(Collectors.partitioningBy(num -> isPrime(num)));
        partitioned.forEach((k,v)-> System.out.println("key "+ k +" val: "+v));

        // Problem 12: Generate Fibonacci sequence up to n terms using streams.
        System.out.println("FIbonnachi series");

        Stream.iterate(new int[]{0, 1},
                        arr1 -> new int[]{arr1[1], arr1[0] + arr1[1]})
                .limit(10)
                .map(arr1 -> arr1[0])
                .forEach(System.out::println);


        // Problem 13: Group strings by their first character and count occurrences.

        List<String> words1 = Arrays.asList("apple", "banana", "bear", "cat", "apple");
        Map<Character, Long> frequency = words1.stream()
                .collect(Collectors.groupingBy(
                        s -> s.charAt(0),
                        Collectors.counting()
                ));

        frequency.forEach((k,v)-> System.out.println("key "+ k +" val: "+v));
// Output: {a=2, b=2, c=1}

        // Problem 14: Find the intersection of two lists using Java streams:

        List<Integer> list3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list4 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> intersection =
                list3.stream().filter(list4::contains).toList();
        System.out.println(intersection);




    }

    private static boolean isPrime(int num) {
        if (num <= 1) return false;
        return IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(i -> num % i == 0);
    }
    public static class Person{
        String name;
        int age;

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    public static class Transaction {
        String date;
        long amount;
        // constructors and getters

        @Override
        public String toString() {
            return "Transaction{" +
                    "date='" + date + '\'' +
                    ", amount=" + amount +
                    '}';
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public long getAmount() {
            return amount;
        }

        public void setAmount(long amount) {
            this.amount = amount;
        }

        public Transaction(String date, long amount) {
            this.date = date;
            this.amount = amount;
        }
    }
}
