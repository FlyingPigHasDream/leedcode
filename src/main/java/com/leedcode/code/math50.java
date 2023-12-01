package com.leedcode.code;

public class math50 {

    public static void main(String[] args) {
        int nums[] = new int[]{0, 2, 3, 5, 8, 3, 9, 10, 7, 12, 11};
        System.out.println(deal(nums));
    }

    private static int deal(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int dp[] = new int[nums.length];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            int max = 1;
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    max = Math.max(max, dp[j] + 1);
                }
            }

            dp[i] = Math.max(dp[i - 1], max);
        }

        return dp[nums.length - 1];
    }
}
