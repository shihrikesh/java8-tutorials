package psrp.javaProblemSolving.collections;

import java.util.Arrays;

public class Task3 {

    // I have to arrays
    // int arr1[] = {21,6,8,9,10,5};
    // int arr2[] = {10,21,5,8,6,9};
    // write a program to check whether both arrays are equal or not.

    public static void main(String[] args) {
        int[] arr1 = {21, 6, 8, 9, 10, 5};
        int[] arr2 = {10, 21, 5, 8, 6, 9};

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int hashCode1 = Arrays.hashCode(arr1);
        int hashCode2 = Arrays.hashCode(arr2);

        if (hashCode1 == hashCode2) System.out.println("Both Arrays are Equal");
        else System.out.println(" Not Equal ");


    }
}
