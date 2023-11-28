package com.leedcode.code;

public class math34 {

    public static void main(String[] args) {
        System.out.println(deal());
    }

    private static int deal() {
        int dp[] = new int[15];
        dp[0] = 0;
        for (int i = 1; i < 15; i++) {
            int cost = Integer.MAX_VALUE;
            if (i >= 1) {
                cost = Math.min(cost, dp[i - 1] + 1);
            }
            if (i >= 5) {
                cost = Math.min(cost, dp[i - 5] + 1);

            }
            if (i >= 11) {
                cost = Math.min(cost, dp[i - 11] + 1);

            }
            dp[i] = cost;
        }


        return dp[14];
    }
}
