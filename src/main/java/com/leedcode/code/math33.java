package com.leedcode.code;

public class math33 {

    public static void main(String[] args) {
        deal();

    }

    public static void deal() {
        int dp[] = new int[15];
        dp[0] = 0;
        int cost;
        for (int i = 1; i < 15; i++) {
            cost = Integer.MAX_VALUE;
            if (i - 1 >=0) {
                cost = Math.min(cost, dp[i - 1] + 1);
            }
            if (i - 5 >= 0) {
                cost = Math.min(cost, dp[i - 5] + 1);
            } if (i - 11 >= 0) {
                cost = Math.min(cost, dp[i - 11] + 1);
            }

            dp[i] = cost;
        }

        System.out.println(1);
    }
}
