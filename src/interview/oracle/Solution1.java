package interview.oracle;

import java.util.Arrays;

class Solution1 {
    public int minUmbrellas(int numPeople, int[] umbrellaSizes) {
        if (numPeople == 0) {
            return 0;
        }
        
        Arrays.sort(umbrellaSizes);
        int[] dp = new int[numPeople + 1];
        Arrays.fill(dp, numPeople + 1);
        dp[0] = 0;

        for (int i = 1; i <= numPeople; i++) {
            for (int size : umbrellaSizes) {
                if (size <= i) {
                    dp[i] = Math.min(dp[i], dp[i - size] + 1);
                } else {
                    break;
                }
            }
        }

        return dp[numPeople] > numPeople ? -1 : dp[numPeople];
    }
}