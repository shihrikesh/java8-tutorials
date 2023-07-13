package psrp.javaProblemSolving.gcAndClassLoader;

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        //Find the next greatest element for each element in the Array
        //
        //Input Array is: {15, 10, 16, 20, 8, 9, 7, 50}

        //int [] array = {15, 10, 16, 20, 8, 9, 7, 50};
        int [] array = {105, 10, 16, 20, 8, 9, 7, 50};
        Arrays.sort(array);
        int arraySize = array.length;
        int lastIndex = arraySize-1;
        for(int i=0;i<arraySize;i++){
            for(int k=i+1;k<arraySize;k++){
                if(array[i]< array[k]){
                    System.out.println(array[i] + " - " + array[k]);
                    break;
                }

            }
            if(i == lastIndex){
                System.out.println(array[i] + " - 1");
            }
        }
    }
}
