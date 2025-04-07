package neetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem3 {

    // two sum

    public static void main(String[] args) {

        Problem3 problem3 = new Problem3();
        int[] nums = {3,4,5,6};
        int target = 11;
        System.out.println(Arrays.toString(problem3.findTwoSum(nums, target)));

    }

    int[] findTwoSum(int[] arr, int target){
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int diff = target-arr[i];

            if(map.containsKey(diff)){
                return new int[]{ map.get(diff),i};
            }

            map.put(num,i);

        }
        return new int[]{};

    }

}
