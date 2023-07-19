package classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        //int arr[] = {14, 12, 70, 15, 99, 65, 21, 90};
        int arr[] = {12, 70, 11};
        //int basePrice = arr[0];
        int minPrice = arr[0];
        int maxPrice = 0;
        int temp = 0;
        int profit = 0;
        int lengh = arr.length;
      /*  for (int i = 1; i < lengh; i++) {
            if (minPrice > arr[i]) {
                minPrice = arr[i];
            }
        }*/

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < lengh; i++) {
            list.add(arr[i]);
        }

        Collections.sort(list);
        Integer max = list.get(lengh - 1);
        minPrice = list.get(0);

        profit = max - minPrice;
        System.out.println("Profit is" + profit);



    }

}

