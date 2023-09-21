package interview.coforge;

import java.util.Scanner;
import java.util.function.IntFunction;

public class IntegerProduct {
    // this simply reduces the number to the product of its digits.

   /*
       The number 39 will reduce as
        Step 1 :(39 → 3x9 = 27) →
        Step 2 : (27 → 2x7 =  14) →
        Step 3 : (14 → 1x4 = 4)
          39 -> 27 -> 14 -> 4

      */
    static IntFunction<Integer> prod =
            (a) -> {
                if (a < 10) {
                    return a;
                }
                if (a % 10 == 0) {
                    return a / 10;
                } else {
                    return a % 10 * IntegerProduct.prod.apply(a / 10);
                }
            };

    public static void main(String[] args) {

        int num = 60;
        System.out.println(num % 10); // remainder
        System.out.println(num / 10); // divison

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please input the number");
        int n = keyboard.nextInt();

        // Now continue applying the lambda until the result is < 10.
        while (n > 10) {
            n = prod.apply(n);
            System.out.println(" Inside while ");
            System.out.println(n);
        }
        System.out.println(n);
    }
}