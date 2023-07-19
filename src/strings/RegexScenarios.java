package strings;

import java.util.Arrays;

public class RegexScenarios {

    public static void main(String[] args) {
        String str = "independent";
        StringBuilder sb  = new StringBuilder("Swa$pn&il".replaceAll("[^aeiouAEIOU]", "")).reverse();
        System.out.println(str.replaceAll("[^aeiouAEIOU]", ""));
        System.out.println(sb);

        System.out.println(str.matches("[aeiou]]"));

        // find word containing 2 or more vowels

        String input = "the quick brown fox jumps right over the little lazy dog";
        String vowels = "aeiou";
        Arrays.stream(input.split(" "))
                .filter(st-> st.replaceAll("[^aeiouAEIOU]","").length() >=2)
                .forEach(System.out::println);


    }

}
