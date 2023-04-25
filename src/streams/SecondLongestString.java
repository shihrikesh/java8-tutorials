package streams;

import java.util.*;

public class SecondLongestString {

    public static void main(String[] args) {
        String dialogue = "This is the best performance you can experience";
        String s = Arrays.stream(dialogue.split(" "))
                .sorted(Comparator.comparing(String::length)
                        .reversed()).skip(1).findFirst().get();
        System.out.println(s);
    }
}
