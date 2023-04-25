package classroom;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ReturnDupNumber {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,2,3,4,5);

        //List<Integer> distinctList = integerList.stream().collect(Collectors.groupingBy());

        System.out.println("Distinct List");
        //distinctList.forEach(System.out::println);
        //List<Integer> dubList = integerList.stream().distinct().collect(Collectors.toMap());
        System.out.println("duplicate List");
        //dubList.forEach(System.out::println);
    }
}
