package interview.ltiMindtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FinalList {

    public static void main(String[] args) {


        final List<Integer> list = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        final String str = "hello";
        String newStr= "new";
        System.out.println(newStr);
        final int a=10;
        //Arrays.asList(1,3,4,5);
        list.add(30);
        //list = list3;  // object reference can't be modified as reference is final
        printList(list,str, a);
        System.out.println(" after print List method call ");
        list.forEach(System.out::println);
        System.out.println(str);
        System.out.println(a);
        newStr = "again change";
        System.out.println(newStr);
        // object is pass by reference
        // primitive as pass by value
    }

    static void printList(List<Integer> list, String str, int a){
        list.add(20);
        list.add(60);
        str = "new hello";
        a = 2;
        list.forEach(System.out::println);
        System.out.println(str);
        System.out.println(a);
    }
}
