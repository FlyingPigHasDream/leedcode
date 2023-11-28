package com.leedcode.code;

public class math37 {

    public static void main(String[] args) {
        int money = 14;
        int coins[] = new int[] {1, 5, 11};
        System.out.println(deal(money, coins));
    }

    private static int deal(int money, int[] coins) {
        if (money == 0 || coins == null) {
            return 0;
        }
        int dp[] = new int[money + 1];
        dp[0] = 0;
        for (int i = 1; i <= money; i++) {
            int cost = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i >= coins[j]) {
                    cost = Math.min(cost, dp[i - coins[j]] + 1);
                }
            }

            dp[i] = cost;
        }

        return dp[money];
    }


}
