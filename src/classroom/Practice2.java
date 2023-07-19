package classroom;

import java.util.ArrayList;
import java.util.List;

public class Practice2 {

   /* A=[10,20,30,12,18,12,20]
    I need all unique sets where sum = 30
            10,20
            12,18
    public List<List<Integer> findUniquePairs(int[] pairs)
    public List<List<Integer>> findUniquePairs(int[] pairs) {// code goes here}

key and pair, use sum-a to get B

        n numbers in string
                sum = x
                        pair (a,b)*/


    public static void main(String[] args) {
        // =30

    }

    public List<List<Integer>> findUniquePairs(int[] pairs) {
        // code goes here}
        List<Integer> pairList = new ArrayList<>();
        for (int i = 0; i <= pairs.length; i++) {
            int sum = pairs[i] + pairs[i + 1];
            if (sum == 30) {
                pairList.add(pairs[i]);

            }
        }

        return null;
    }

}