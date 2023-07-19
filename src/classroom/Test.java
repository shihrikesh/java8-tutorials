package classroom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    // print pascal triangle
    /*
           1
       1.   1
    1.    2.   1
   1.  3.    3.  1
  1. 4.  6.    4.   1

  // even number ffrom arrayList

     */

    public static void main(String[] args) {
        /*int level = 4;
        int width = 4;
        for(int i=0;i<=level;i++){

            for (int k=1;k< i;k++){
                int x= 1;
                System.out.println(x+i);

            }

        }*/

        int [] array = {1,2,3,4,5,6,7,8,9,10};
        Arrays.stream(array)
                .boxed()
                .filter(r-> r%2 ==0)
                .forEach(System.out::println);
    }




}
