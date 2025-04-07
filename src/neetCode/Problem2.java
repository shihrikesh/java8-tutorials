package neetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem2 {

    //Input: s = "racecar", t = "carrace"

    //Output: true

    public static void main(String[] args) {

        String str = "racecar";
        String str2 = "carrace";

        Problem2 problem2 = new Problem2();

        char ch='a';
        int ascia=ch;
        char chA='A';
        int asciA=chA;
        System.out.println(ascia);
        System.out.println(asciA);
        System.out.println('a');
        System.out.println('a'-'a');
        System.out.println('b'-'a');
        System.out.println('c'-'a');
        System.out.println('d'-'a');
        System.out.println(problem2.isAnagram3("carbus", "buscar"));

    }
    public boolean isAnagram1(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] char1 = s.toCharArray();
        char[] char2 = t.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);

    }

    public boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        /*Map<String, Long> map1 = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        Map<String, Long> map2 = Arrays.stream(t.split(""))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));*/

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(s.charAt(i), 0) + 1);
        }


        return map1.equals(map2);

    }

    public boolean isAnagram3(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }
        // A 65
        // a 96

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }


}

