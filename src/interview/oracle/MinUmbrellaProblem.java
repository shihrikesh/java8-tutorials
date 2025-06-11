package interview.oracle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinUmbrellaProblem {

    /**
     * Given a number of people N and an array of integers,
     * each one representing the amount of people a type of umbrella can handle,
     * output the minimum number of umbrellas needed to handle N people.
     *
     * No umbrella could have left spaces. Which means if a umbrella can handle 2 people,
     * there should be 2 people under it.
     *
     * If there's no solution, return -1.
     * @param args
     */

    public static void main(String[] args) {

        System.out.println(minUmbrella(3, Arrays.asList(2,1)));
        System.out.println(minUmbrella(10, Arrays.asList(3,1)));
        System.out.println(minUmbrella(3, Arrays.asList(2)));

    }

    /**
     * solve(3, [1, 2]) means that we have 3 people and two kinds of umbrellas,
     * one that hanled one person and one that handles 2.
     * We can give one two-sized umbrella to 2 of them and the other to the last person.
     * Therefore the solution is 2 (umbrellas). You could give 3 one-sized umbrellas,
     * but we want the minimum number.
     *
     * solve(10, [3, 1]). You can give 3 three-sized umbrellas and 1 one-sized.
     * This means the solution is 4.
     *
     * solve(3, [2]). There's no solution since one umbrella would have empty space. Return -1.
     * @param count
     * @param umbrellas
     * @return
     */

    public static int minUmbrella(int count, List<Integer> umbrellas) {

        if(umbrellas.isEmpty() || count==0 || count<0) return -1;

        Collections.sort(umbrellas);
        List<Integer> reverseUmb = umbrellas.reversed();
        int total=0;
        int peopleRemain=count;
        for(Integer umbrella: reverseUmb){
            if(peopleRemain!=0 ){
                total = total+ peopleRemain/umbrella;
                peopleRemain = peopleRemain%umbrella;
            }

            if(peopleRemain==0){
                return total;
            }
        }

        return -1;
    }
}
