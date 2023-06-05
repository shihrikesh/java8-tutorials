package psrp.javaProblemSolving.streamAndFP;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.OptionalLong;
import java.util.stream.*;

public class FP_MCQ {

    public static void main(String[] args) {


        // Exception thrown
        /*Predicate<? super String> predicate = s -> s.startsWith("g");
        Stream<String> stream1 = Stream.generate(() -> "growl! ");
        Stream<String> stream2 = Stream.generate(() -> "growl! ");
        boolean b1 = stream1.anyMatch(predicate);
        boolean b2 = stream2.allMatch(predicate);
        System.out.println(b1 + " " + b2);*/

        // exception thrown , stream has already operated upon or closed
        /*Predicate<? super String> predicate = s -> s.length() > 3;
        Stream<String> stream = Stream.iterate("-", (s) -> s + s);
        boolean b1 = stream.noneMatch(predicate);
        boolean b2 = stream.anyMatch(predicate);
        System.out.println(b1 + " " + b2);*/


        Stream<String> stream = Stream.iterate("", (s) -> s + "1");
        System.out.println(stream.limit(2).map(x -> x + "2"));

        Stream<String> s = Stream.generate(() -> "meow").limit(5);
        s.forEach(System.out::println);
        Stream<String> s1 = Stream.generate(() -> "meow");
        boolean match = s1.allMatch(String::isEmpty);  // returns false
        //boolean match = s1.anyMatch(String::isEmpty);  // returns nothing
        //boolean match = s1.noneMatch(String::isEmpty);  // returns nothing
        System.out.println(match);
        /*System.out.println(s.allMatch(String::isEmpty));
        System.out.println(s.noneMatch(String::isEmpty));*/


        System.out.println("check output for intStream");
        // waht below return type
        IntStream is = IntStream.empty();
        System.out.println(is.sum());  // int
        //System.out.println(is.average());  // optionalDouble
        //System.out.println(is.findAny()); // optionalInt


        System.out.println("check output for LongStream ");
        LongStream ls = LongStream.of(1, 2, 3);
        OptionalLong opt = ls.map(n -> n * 10).filter(n -> n < 5).findFirst();
        //opt.ifPresent(System.out::println);
        //if (opt.isPresent()) System.out.println(opt.getAsLong());

        System.out.println(" limit testing filter ");
        Stream.generate(() -> "1")
                .limit(10)
                .filter(x->x.length()>1)
                .peek(System.out::println)
                .forEach(System.out::println);
       /* L: .filter(x -> x.length() > 1)
        M: .forEach(System.out::println)
        N: .limit(10)
        O: .peek(System.out::println)
        ;*/

        System.out.println(" print 12345");
        System.out.println(Stream.iterate(1, x -> ++x).limit(5).map(x -> String.valueOf(x))
                .collect(Collectors.joining()));

        System.out.println(" Stream of with three list");
        List<Integer> l1 = Arrays.asList(1, 2, 3);
        List<Integer> l2 = Arrays.asList(4, 5, 6);
        List<Integer> l3 = Arrays.asList();
        Stream.of(l1,l2,l3).forEach(System.out::println);
        /*Stream.of(l1, l2, l3).map(x -> x + 1)
                .flatMap(x -> x.stream()).forEach(System.out::print);*/

        System.out.println(" which line to compile ");

        Stream<Integer> sm = Stream.of(1);
        IntStream intS = sm.mapToInt(x -> x);
        //DoubleStream ds = sm.mapToDouble(x -> x); // this run time as stream already consumed
        //Stream<Integer> s2 = ds.mapToInt(x -> x); // this line does not compile
        //s2.forEach(System.out::print);

        System.out.println(" partition by testing");
        Stream	<String> sm1 = Stream.empty();
        Stream	<String> s2 = Stream.empty();
        Map<Boolean, List	<String>> p = sm1.collect(
                Collectors.partitioningBy(b -> b.startsWith("c")));
        Map	<Boolean, List	<String>> g = s2.collect(
                Collectors.groupingBy(b -> b.startsWith("c")));
        System.out.println(p + " " + g);
        // {false=[], true=[]} {}

        System.out.println(" double stream  testing ");

        DoubleStream ds = DoubleStream.of(1.2, 2.4);
        ds.peek(System.out::println).filter(x -> x > 2).count();

        System.out.println(" testing");

        List<Integer> l = IntStream.range(1, 6)
                .mapToObj(i -> i).collect(Collectors.toList());
        l.forEach(System.out::println);
    }
}
