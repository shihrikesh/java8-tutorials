package interview.oracle;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int minUmbrellas(int M, List<Integer> UMBRELLA) {
        if (M == 0) {
            return 0;
        }
        if (UMBRELLA == null || UMBRELLA.isEmpty() || M < 0) {
            return -1;
        }

        Collections.sort(UMBRELLA, Collections.reverseOrder());
        int count = 0;
        int remainingPeople = M;

        for (Integer umbrellaSize : UMBRELLA) {
            if (umbrellaSize <= 0) continue;
            count += remainingPeople / umbrellaSize;
            remainingPeople %= umbrellaSize;

            if (remainingPeople == 0) {
                return count;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        System.out.println(solution.minUmbrellas(5, Arrays.asList(2, 3, 4))); // Output: 2
        System.out.println(solution.minUmbrellas(7, Arrays.asList(1, 3, 5, 6))); // Output: 2
        System.out.println(solution.minUmbrellas(3, Arrays.asList(2))); // Output: -1
        System.out.println(solution.minUmbrellas(10, Arrays.asList(3, 1))); // Output: 4
        System.out.println(solution.minUmbrellas(8, Arrays.asList(3, 5))); // Output: 2
    }
}