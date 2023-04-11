package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SparseArray {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("ab", "abc", "ab");
        List<String> query = Arrays.asList("ab", "abc", "bc");

        //List<Integer> countArray = query.stream().filter(s -> Collectors.counting()).collect(Collectors.toList());

        // Count List items and store into MAP
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hello");
        list.add("World");

        Map<String, Long> counted = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<String, Long> listCount = list.stream().collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        System.out.println(counted);
        System.out.println(listCount);

        Map<String, Long> strCountMap = strings.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        strCountMap.forEach((s, aLong) -> query.stream().filter(s1 -> s1.equals(s)));

        String s = "aaabc";
        char[] charString = s.toCharArray();

        //List<Character> strList  = Arrays.asList(charString);
        //System.out.println(strList.get(0));
    }

}
