package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferencing1 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "this", "is", "Hrishi");
        List<String> capitalWords = words.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("args = " + capitalWords);
    }
}
