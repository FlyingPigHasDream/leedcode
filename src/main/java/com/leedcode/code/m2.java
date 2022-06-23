package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/04/18 15:48
 */
public class m2 {

    public boolean hasPath(char[][] matrix, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; i++) {
                if (dfs(matrix, chars, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] matrix, char[] chars, int i, int j, int wordIndex) {
        if (i >= matrix.length || i < 0 || j >= matrix[0].length || j < 0 || matrix[i][j] != chars[wordIndex])
            return false;
        //如果word的每个字符都查找完了，直接返回true
        if (wordIndex == chars.length - 1)
            return true;

        boolean res = dfs(matrix, chars, i + 1, j, wordIndex + 1)
            || dfs(matrix, chars, i - 1, j, wordIndex + 1)
            || dfs(matrix, chars, i, j + 1, wordIndex + 1)
            || dfs(matrix, chars, i, j - 1, wordIndex + 1);

        return res;
    }


}
