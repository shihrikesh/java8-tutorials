package strings;

import java.util.stream.IntStream;

public class ReverseStrWithSpecialChar {

    public static void main(String[] args) {
        // reverse string with special character remaining in same place
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
