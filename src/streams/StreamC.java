package streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamC {

    // sorting and reverse sorting
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

        myList.stream()
                .sorted()
                .forEach(System.out::println);

        myList.stream()
                .sorted(Collections.reverseOrder())
                .forEach(System.out::println);

    }
}
