package com.leedcode.code;

public class math36 {

    public static void main(String[] args) {
        int w[] = new int[]{0, 2, 3, 4, 5};
        int v[] = new int[]{0, 3, 4, 5, 8};
        int bear = 9;
        System.out.println(deal(w, v, bear));
    }

    private static int deal(int[] w, int[] v, int bear) {
        if (w == null || v == null || bear == 0) {
            return 0;
        }

        int r[][] = new int[w.length][bear];
        r[0][0] = 0;
        for (int i = 1; i < w.length; i ++) {

            for (int j = 1; j < bear; j++) {
                if (w[i] >= j) {
                    r[i][j] = r[i - 1][j];
                } else {
                    r[i][j] = Math.max(r[i - 1][j], r[i - 1][j - w[i]] + v[i]);
                }
            }
        }

        return r[w.length - 1][bear - 1];
    }
}
