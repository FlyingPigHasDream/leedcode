package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/19 15:36
 */
public class m5 {
    public static void main(String[] args) {
        cutRope(16);
    }

    /**
     * 绳子每次3 想成最大
     * @param n
     * @return
     */
    public static int cutRope (int n) {
        if (n < 2) {
            return 0;
        }

        if (n < 4) {
            return n - 1;
        }

        int res = 1;
        while (n > 4) {
            res = res *3;
            n = n- 3;
        }

        return res * n;
    }

    public int cutRope1(int target) {
        int[] dp = new int[target + 1];
        dp[1] = 1;
        for (int i = 2; i <= target; i++) {
            for (int j = 1; j < i; j++) {
                dp[i] = Math.max(dp[i], (Math.max(j, dp[j])) * (Math.max(i - j, dp[i - j])));
            }
        }
        return dp[target];
    }














    public int cut1(int n) {
        int[] target = new int[n + 1];
        target[1] = 1;
        for (int i = 2 ; i <= n; i ++) {
            for (int j = 1; j < i ; j++) {
                target[i] = Math.max(target[i], Math.max(i, target[i]) * Math.max((i-j), target[i-j]));
            }
        }

        return target[n];
    }

}
