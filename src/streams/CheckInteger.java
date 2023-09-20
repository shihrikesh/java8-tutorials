package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CheckInteger {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "1", "3", "two");

        // Without code format
        list.stream().map(s -> {
            try {
                return Integer.parseInt(s);
            } catch (NumberFormatException ex) {
                return null;
            }
        }).filter(Objects::nonNull).forEach(System.out::println);

        // Using Code Format

        CheckInteger checkInteger = new CheckInteger();
        checkInteger.convertStringToInteger(list);

    }

    public void convertStringToInteger(List<String> stringList) {
        stringList.stream()
                .map(this::getInteger)
                .filter(Objects::nonNull)
                .forEach(System.out::println);
    }

    private Integer getInteger(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return null;
        }
    }
}
