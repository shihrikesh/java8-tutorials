package streams;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class HandsOnQuestions {

    public static void main(String[] args) {

        // print 10 random number
        Random random = new Random();
        random.ints().limit(5).forEach(System.out::println);

        // find highest number among list

        List<Integer> integerList = Arrays.asList(2,3,4,2,5,6,8, 12);
        System.out.println(integerList.stream().max(Integer::compareTo).orElse(null));
        integerList.stream().distinct().sorted(Comparator.reverseOrder()).limit(1).forEach(System.out::println);

        // IntSummaryStatistics
        IntSummaryStatistics intSummaryStatistics = integerList.stream().mapToInt(i->i).summaryStatistics();
        System.out.println(" sum of integers from array ");
        System.out.println(integerList.stream().mapToInt(i -> i).sum());


        System.out.println(" max value " + intSummaryStatistics.getMax());
        System.out.println(" min value " + intSummaryStatistics.getMin());
        System.out.println(" intSummaryStatistics " + intSummaryStatistics);

        intSummaryStatistics = integerList.stream().collect(Collectors.summarizingInt(r->r));

        System.out.println(" intSummaryStatistics with Collectors.summarizingInt method " + intSummaryStatistics);

        LocalDate localDate = LocalDate.of(2023,6,1);
        LocalDate nextFriday = localDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))
                .with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(nextFriday);

        // Write a Java 8 program to square the list of numbers and then
        // filter out the numbers greater than 100 and then find the average of the remaining numbers?

        System.out.println(integerList
                .stream()
                .map(i -> i * i).filter(sqr -> sqr > 100)
                .collect(Collectors.averagingDouble(Integer::intValue)));

        // max and min value from list

        Integer max = integerList.stream().max(Comparator.comparingInt(Integer::intValue)).orElse(0);
        Integer min = integerList.stream().min(Comparator.comparingInt(Integer::intValue)).orElse(0);

        System.out.println(" Max value from list " + max);
        System.out.println(" Min value from list " + min);

        int[] arr = { 99, 55, 203, 99, 4, 91 };
        Arrays.parallelSort(arr);

        Arrays.stream(arr).forEach(System.out::println);

        System.out.println(" Find count of string with more than 5 string length ");
        List<String> stringList = new ArrayList<>();
        stringList.add("Saket");
        stringList.add("Saurav");
        stringList.add("Softwaretestinghelp");
        stringList.add("Steve");


        System.out.println(stringList.stream().filter(str -> str.length() > 5).count());

        // reverse array

        int [] intArray = { 1,5,3,7,11,9,15 };

        for(int i=intArray.length-1;i>=0;i--){
            System.out.println(intArray[i]);
        }

        int counter =1;
        for(int i=0;i<intArray.length/2;i++){
            int swapfirst = intArray[i];
            int swapLast = intArray.length-counter;
            intArray[i] = intArray[swapLast];
            intArray[swapLast] = swapfirst;
            counter = counter+1;
            System.out.println(intArray[swapfirst]+ " " +intArray[swapLast]);
        }
    }
}
