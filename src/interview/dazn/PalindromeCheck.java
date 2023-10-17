package interview.dazn;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PalindromeCheck {

    public static void main(String[] args) {
        // single char
        // double
        // n char
        // find num of substring palindrome
        int count = 0;
        String str = "tacocat"; // t, a, c,o, coc,acoca , tacocat
        StringBuilder sb = new StringBuilder(str);
        String[] strArray = str.split("");
        Set<String> set = new HashSet<>();
        if (sb.reverse().toString().equals(str)) {
            set.add(sb.toString());
        }

        // for loop can be replace by COllections.addAll();
       /* for (int i = 0; i < strArray.length; i++) {
            set.add(strArray[i]);
        }*/

        Collections.addAll(set, strArray);

        for (int i = 0; i < strArray.length; i++) {
            for (int k = i + 1; k < strArray.length; k++) {
                String st = sb.substring(i, k);
                if (isPalindrome(st)) {
                    set.add(st);
                }
            }
        }
        set.forEach(System.out::println);
    }

    static boolean isPalindrome(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString().equals(str);
    }
}
