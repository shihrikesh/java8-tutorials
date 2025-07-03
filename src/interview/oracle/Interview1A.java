package interview.oracle;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Interview1A {

    /**
     * Given list of chocolate and days
     * each day we can eat half of chocoloate and
     * half should be floor value, 25/2, is 13
     *
     * what is minimum chocoloate remaining ater n days
     * @param args
     */
    public static void main(String[] args) {

        var list= Arrays.asList(20,30,25,10);
        int day=4;
        list.sort(Collections.reverseOrder());
        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(30);
        priorityQueue.add(50);
        priorityQueue.add(80);
        priorityQueue.add(10);
        priorityQueue.forEach(System.out::println);
        while(day!=0) {
            System.out.println(list.getFirst());
            /*for (Integer weight : list) {
                int remainChocolate = BigDecimal.valueOf(weight).divide(BigDecimal.valueOf(2), RoundingMode.HALF_UP).intValue();
                priorityQueue.remove(weight);
                priorityQueue.add(remainChocolate);

            }*/
            day--;
        }

    }
}
