package mockTest4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OptionalMockTest {

    public static void main(String[] args) {
        // integer 1-10

        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //even in one list and odd in one

        //integerList.stream().findAny(integer -> integer/2)

        String inputStr = "Welcome to Java world";
        // need to print the word having bigger in length - Welcome

        List<String> sortedList = Arrays.stream(inputStr.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        // need to print the word having bigger in length - Welcome

        String str = Arrays.stream(inputStr.split(" "))
                .sorted(Comparator.comparing(String::length).reversed())
                .skip(0)
                .findFirst()
                .orElse("No Data");

        System.out.println("sorted Function " + str);

        String maxStr = Arrays.stream(inputStr.split(" "))
                .max(Comparator.comparing(String::length))
                .orElse("No");

        System.out.println("Max function " + maxStr);

        String reduceStr = Arrays.stream(inputStr.split(" "))
                .reduce("", (a,b)-> a.length()>b.length()?a:b);

        System.out.println("Reduce function " + reduceStr);

    }
}
