package psrp.javaProblemSolving.oops;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.function.Predicate;

public class MCQ_1 {

    public static void main(String[] args) {
        System.out.println(test((i)-> i==5));
        System.out.println(test(i-> i==5));
        System.out.println(test((i) -> {return i == 5;}));


        int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        System.out.println(total);
        total += letters.substring(6, 6).length();
        System.out.println(total);
        //total += letters.substring(6, 5).length();
        System.out.println(total);

        int value = 9;
        long result = square(value);
       // System.out.println(result);

    }

    public static boolean test(Predicate<Integer> p){
        return p.test(5);
    }

    public static long square(int x) {
         long y = x * (long) x;
        x = -1;
        return y;

    }
}
