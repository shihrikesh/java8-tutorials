package psrp.javaProblemSolving.streamAndFP;

import java.util.Arrays;

public class Java8FP3 {

    public static void main(String[] args) {
        int row=4;
        int column=4;
        int [][] arr= {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int x = 29;

        for(int i=0; i< row;i++){
            for(int j=0;j<column;j++){
                if(arr[i][j]== x){
                    System.out.println("found at ( " + i + " , "+ j + " )");
                    return;
                }
            }
            // which below are Functional Interface
            //Iterator  // No FI
            //Callable  is FI
            //Map  // No
            // Comparable  is FI


        }

    }
}
