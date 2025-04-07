package neetCode;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Problem1 {

    public static void main(String[] args) {
        // Find if contains duplicate
        int[] nums = {1,2,3,3};
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.hasDuplicate(nums));
        System.out.println(problem1.hasDuplicate2(nums));
    }

    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<Integer> list = IntStream.of(nums).boxed().toList();
        Set<Integer> dup = arr.stream()
                .filter(a -> !set.add(a))
                .collect(Collectors.toSet());
        dup.forEach(System.out::println);
        return !dup.isEmpty();
    }

    /**
     * use COllections.duplciate function accept list and string
     * @param nums
     * @return
     */
    public boolean hasDuplicate1(int[] nums) {
        Set<Integer> set = new HashSet<>();
        List<Integer> arr = new ArrayList<>(Arrays.stream(nums).boxed().toList());
        List<Integer> list = IntStream.of(nums).boxed().toList();
        Set<Integer> dup = arr.stream()
                .filter(a -> Collections.frequency(list, a)>1)
                .collect(Collectors.toSet());
        dup.forEach(System.out::println);
        return !dup.isEmpty();
    }

    /**
     * tradition approach
     * @param nums
     * @return
     */
    public boolean hasDuplicate2(int[] nums) {
        for(int i=0;i< nums.length;i++){
            for(int k=i+1;k<nums.length;k++){
                if(nums[i]==nums[k]){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean hasDuplicate3(int[] nums){
        List<Integer> list = IntStream.of(nums).boxed().toList();
        Set<Integer> set = new HashSet<>(list);
        if(list.size()!=set.size()){
            return true;
        }

        return false;
    }

    /**
     * final solution
     * @param nums
     * @return
     */
    public boolean hasDuplicate4(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
