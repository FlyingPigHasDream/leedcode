package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/18 17:01
 */
public class m3 {

    public int movingCount(int threshold, int rows, int cols) {
        boolean[][] bo = new boolean[rows][cols];
        return dfs(threshold, rows, cols, bo, 0, 0);
    }

    public int dfs(int threshold, int rows, int cols, boolean[][] bo, int i, int j) {
        if (i >= rows || j >= cols || bo[i][j] || sum(i,j) > threshold) {
            return 0;
        }

        bo[i][j] = true;
        return 1 + dfs(threshold, rows, cols, bo, i + 1, j) + dfs(threshold, rows, cols, bo, i, j + 1);
    }


    public int sum(int i, int j) {
        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }

        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }

        return sum;
    }

}
