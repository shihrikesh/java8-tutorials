package interview.ltiMindtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalList {

    public static void main(String[] args) {


        final List<Integer> list = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        //Arrays.asList(1,3,4,5);
        list.add(30);
        final java.util.List<Integer> list2 = Arrays.asList(1,3,4,5);
        //list2.add(10);  // throws UnsupportedOperationException bcos final list can not be changed
        list2.forEach(System.out::println);
       // list = list3;
        printList(list);
    }

    static void printList(List<Integer> list){
        //list.add(20);
        /*List<Integer> listNew = Arrays.asList(1,3,4,5);
        list = listNew;*/
        List<Integer> list5 = new ArrayList<>();
        list.add(20);
        list = list5;
        list.add(60);
        list.forEach(System.out::println);
    }
}
