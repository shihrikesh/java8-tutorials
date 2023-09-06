package interview.hitachiVantara;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,4,2,3,3,8,9,7,6);

        System.out.println(list.parallelStream().filter(i-> i%2==0).collect(Collectors.toList()));



    }
}
