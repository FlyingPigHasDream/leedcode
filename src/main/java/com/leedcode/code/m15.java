package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/21 10:29
 */
public class m15 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("aacabdkacaa"));
    }

    public static String longestPalindrome(String s) {
        int l = s.length();

        int maxL = 0;
        int b = 0;
        int e = 0;

        boolean[][] dp = new boolean[l][l];
        for (int i = 1; i < l; i++) {
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == s.charAt(i) && (i - j  <= 2 || dp[j+1][i-1])) {
                    dp[j][i] = true;

                    if (maxL < i - j + 1) {
                        maxL = i - j + 1;
                        b = j;
                        e = i;
                    }
                }
            }
        }

        return s.substring(b, e + 1);
    }
}
