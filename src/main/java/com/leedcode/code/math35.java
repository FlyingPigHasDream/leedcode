package com.leedcode.code;

public class math35 {

    public static void main(String[] args) {

        int coins[] = new int[]{1, 3, 5};
        System.out.println(deal(10, coins));
    }

    private static int deal(int money, int[] coins) {
        if (money == 0 || coins == null || coins.length < 1) {
            return 0;
        }

        int dp[] = new int[coins.length];
        dp[0] = 0;
        for (int i = 1; i < money; i++) {
            if (money > coins[i]) {
                dp[i] = dp[i - coins[i]] + 1;
            } else {
                dp[i] = dp[i - 1];
            }

        }


        return dp[coins.length];
    }
}
