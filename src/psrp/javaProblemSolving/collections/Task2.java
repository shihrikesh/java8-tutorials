package psrp.javaProblemSolving.collections;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task2 {
    // Check for the balanced Brackets in an expression
    //
    //Input: exp = “[()]{}{[()()]()}”
    //Output: Balanced

    //Input: exp = “[(])”
    // Output: Not Balanced
    public static void main(String[] args) {

        String exp = "[()]{}{[()()]()}";
        //Set<Long> bracketCount =
        Arrays.stream(exp.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .forEach(System.out::println);
                /*.stream()
                .map(Map.Entry::getValue)
                .collect(Collectors.toSet());*/
        /*if (bracketCount.size() == 1)
            System.out.println(" Balanced ");
        else System.out.println(" Balanced ");*/


    }
}
