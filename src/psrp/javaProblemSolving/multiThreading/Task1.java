package psrp.javaProblemSolving.multiThreading;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task1 {

    //Given 2 numbers as list, add the numbers and store the result in a new list.
    //Input is:              2->3->5->7->NULL
    //     8->2->7->NULL
    //Output:               3->1->8->4->NULL

    public static void main(String[] args) {
        List list1 = Collections.singletonList("2,3,4,5");
        List list2 = Arrays.asList(8,2,7);

        int sum=0;
        for(int i=0;i<list1.size();i++){
            sum = sum+ list1.indexOf(i)+ 10*i;
        }

        System.out.println(sum);
    }
}
