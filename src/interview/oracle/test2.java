package interview.oracle;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test2 {

    public static void main(String[] args) {

        int n=7;

        int sum = Stream.iterate(new int[]{0,1} ,x-> new int[]{x[1],x[0]+x[1]})
                .limit(n)
                .map(x->x[0])
                .toList()
                .stream().distinct().filter(i->i%2==0).mapToInt(i->i).sum();

        System.out.println(sum);
    }
}
