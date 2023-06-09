package psrp.javaProblemSolving.oops;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task3 {

    /*
        Find the longest word in a sentence?.
        Input: I am interested to grow in my organization
        output: organization
    * */

    public static void main(String[] args) throws NoSuchFieldException {
        String input = "I am interested to grow in my organization";
        String longestString = Arrays
                .stream(input.split(" "))
                .collect(Collectors.toMap(Function.identity(), String::length))  // convert to map and find lenght of string
                .entrySet()  // get entry object for map created
                .stream()
                .max(Map.Entry.comparingByValue()) // finding max based on comparing value of Entry object
                .map(Map.Entry::getKey)
                .orElseThrow(NoSuchFieldException::new);
        System.out.println(longestString);
    }
}
