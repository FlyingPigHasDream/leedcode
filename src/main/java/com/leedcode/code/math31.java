package com.leedcode.code;


/**
 * continue sub array max sum
 * level: easy
 */
public class math31 {

    public static void main(String[] args) {

        int w[] = new int[]{0, 2, 3, 4, 5};
        int v[] = new int[]{0, 3, 4, 5, 8};
        int n = 9;

        System.out.println(sum(w, v, n));
    }

    private static int sum(int[] w, int[] v, int n) {
        int f[][] = new int[w.length][n];
        for (int i = 1; i < w.length; i++) {
            for (int j = 1; j < n; j++) {
                if (w[i] > j) {
                    f[i][j] = f[i - 1][j];
                } else {
                    f[i][j] = Math.max(f[i - 1][j], f[i - 1][j - w[i]] + v[i]);
                }
            }
        }
        return f[4][8];
    }


}
