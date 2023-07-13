package psrp.javaProblemSolving.oops;

import java.util.stream.IntStream;

public class Task2 {

    /*
    Reversal program with special characters.

    Input: Swa$pn&il
    Output : lin$pa&wS
    */

    public static void main(String[] args) {

        String input = "Swa$pn&il";
        String[] arr = input.split("");
        String regex = "[^0-9a-zA-Z]";

        StringBuilder reversed = new StringBuilder(input.replaceAll(regex, "")).reverse();
        System.out.println(reversed);

        IntStream.range(0, input.length() - 1)
                .filter(i -> arr[i].matches(regex))
                .peek(System.out::println)
                .forEach(i -> reversed.insert(i, arr[i]));

        System.out.println(reversed);
    }
}
