package interview.jpmc;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProblemJP1 {

    public static void main(String[] args) {
        /**
         * containing interger [] positive or -ve
         * find out all number , result
         * Arra
         * [1,2,3,4,5,-1,7], int input=6;
         * pair of 2,
         * ]output: arrya of Array [[2,4][1,5],[-1,7]]
         *
         *
         * int remain = target-arr[i];
         * int arr[i]
         *
         *
         * []
         */

        int[] arr = new int[]{1,2,3,4,5,-1,7};
        int target=6;

        List<Integer> found = new ArrayList<>();

        Set<List<Integer>> output = new HashSet<>();
        for(int i=0;i<arr.length;i++){

            int pair = target-arr[i];
            if(!found.contains(pair)){
                if(arr[i]!=pair) {
                    var list = new ArrayList<Integer>();
                    list.add(arr[i]);
                    list.add(pair);
                    output.add(list);
                    found.add(arr[i]);
                }
            }

        }

        output.forEach(System.out::println);
    }
}
