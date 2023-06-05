package psrp.javaProblemSolving.gcAndClassLoader;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        // A List<String> contains alpha, numeric and alpha numeric values as strings.
        // Write a program to create a List<Integer>s from the original List.
        //
        //
        //		input :  List <String> ls =  ["as", "123", "32", "2as"]
        //
        //	output : List<Integer> iList = [123,32]

        List<String> stringList = Arrays.asList("as", "123", "32", "2as");
        stringList.stream().filter(r-> r.matches("\\d+")).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(" word");
        stringList.stream().filter(r-> r.matches("\\w+")).forEach(System.out::println);

    }
}
