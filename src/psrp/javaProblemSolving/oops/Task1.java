package psrp.javaProblemSolving.oops;

import java.util.Arrays;

public class Task1 {

    /*Given a sorted array of n elements, write a function to find the index of a given element.
    if not found return -1.

    input: arr[] = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170},
    and search element  = 111
    Output: 6
        search element = 110, Then output should be -1
    */

    public static void main(String[] args) {
        int [] arr = {11, 23, 32, 52, 76, 81, 111, 135, 140, 170};

        int key = 81;

        int val = Arrays.binarySearch(arr, key);
        if(val <0){
            System.out.println("-1");
        } else {
            System.out.println(val);
        }

        /*
        // brute force approach
        int num = 111;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== num ){
                System.out.println("index is " + i);
                return;
            }
        }
        System.out.println("-1");*/
    }
}
