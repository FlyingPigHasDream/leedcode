package com.leedcode.code;


/**
 * continue sub array max sum
 * level: easy
 */
public class math30 {

    public static void main(String[] args) {

        int array[] = new int[]{23, 11, 5, -30, 12};

        System.out.println(sum(array));
    }

    private static int sum(int[] array) {
        if (array == null || array.length < 1) {
            return 0;
        }

        int dp[] = new int[array.length];
        int max = 0;
        dp[0] = array[0];
        for (int i = 1; i< array.length; i++) {

            if (dp[i - 1] > 0) {
                dp[i] = dp[i -1] + array[i];
            } else {
                dp[i] = array[i];
            }

            max = Math.max(max, dp[i]);
        }


        return max;
    }


}
