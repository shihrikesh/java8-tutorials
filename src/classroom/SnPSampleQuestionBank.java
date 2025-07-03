package classroom;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SnPSampleQuestionBank {

    public static void main(String[] args) {
        //1.)Given a list of integers, divide into two lists one having even numbers and other having odd numbers.
        System.out.println(" Given a list of integers, divide into two lists one having even numbers " +
                "and other having odd numbers. ");
        System.out.println("********* START *********");
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        integerList
                .stream()
                .collect(Collectors.groupingBy(num -> num % 2 == 0 ? "Even" : "Odd"))
                .forEach((k, v) -> System.out.println(k + " elements are " + v));

        System.out.println(" Using Partition by method ");
        integerList
                .stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0))
                .forEach((k, v) -> System.out.println(k + " elements are " + v));

        System.out.println("********* END *********");

        /*2.)Given an array of integers(2, 34, 54, 23, 33, 20, 59, 11, 19, 37) group the numbers by the range they belong
        to.The put put should be {
            0 =[2],50 =[54, 59],20 =[23, 20],10 =[11, 19],30 =[34, 33, 37]}*/
        System.out.println(" Group The numbers in range they belong in 0 to n*10 series ");
        System.out.println("********* START *********");

        integerList = Arrays.asList(2, 34, 54, 23, 33, 20, 59, 11, 19, 37);
        integerList
                .stream()
                .collect(Collectors.groupingBy(i -> i / 10 * 10))
                .entrySet().stream().sorted(Map.Entry.comparingByKey())
                .toList().forEach(System.out::println);
                //.forEach((k, v) -> System.out.println(k + " elements are " + v));

        System.out.println("********* END *********");



        /*3.)Given a List of Strings["as", "123", "32", "2as"],create another Integer list that contains only integers.
        The output shoul be:List<Integer> iList = [123, 32]*/
        System.out.println(" List of string, find list of Integers ");
        System.out.println("********* START *********");

        List<String> stringList = Arrays.asList("as", "123", "32", "2as");
        stringList
                .stream()
                .filter(str -> str.matches("\\d+"))
                .forEach(System.out::println);

        System.out.println(" regex type 2 ");
        stringList
                .stream()
                .filter(str -> str.matches("[0-9]+"))
                .forEach(System.out::println);

        System.out.println("********* END *********");
    }
}
