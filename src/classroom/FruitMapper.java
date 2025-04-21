package classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FruitMapper {

    public static void main(String[] args) {
        List<String> fruitBasket = List.of("apple","banana","pear","kiwi");

       Map<Integer,List<String>> map=fruitBasket.stream().collect(Collectors.groupingBy(String::length));
       System.out.println(map);
    }
}
