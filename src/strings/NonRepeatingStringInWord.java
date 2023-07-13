package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NonRepeatingStringInWord {

    public static void main(String[] args) {
        // Find max length substring with non-repeated characters?
        String input = "hrishi";

        int start=0;
        int end =0;
        Set<Character> stringSet = new HashSet<>();
        char[] inputChar = input.toCharArray();
        StringBuilder sb = new StringBuilder();
        while(end< input.length()-1){
            if(!stringSet.contains(inputChar[end])){ 
                stringSet.add(inputChar[end]);
                end++;

            }

        }

    }
}
