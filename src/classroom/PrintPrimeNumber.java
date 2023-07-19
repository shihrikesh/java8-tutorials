package classroom;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class PrintPrimeNumber {

    public static void main(String[] args) {
        // print prime numbers

        // 1, 2, 3, 5, 7, 9

        //IntStream.range(1, 10).forEach(System.out::println);
        IntStream.rangeClosed(1,30).filter(PrintPrimeNumber::checkPrime).forEach(System.out::println);

    }

    static boolean checkPrime(Integer num){

        boolean flag=true;
        for(int i =2; i <= num/2;i++){
            if(num%i==0){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
