package com.leedcode.code;


/**
 * continue sub array max sum
 * level: easy
 */
public class math29 {

    public static void main(String[] args) {

        int array[] = new int[]{23, 11, 5, -7, 12};

        System.out.println(sum(array));
    }

    private static int[] sum(int[] array) {
        if (array == null || array.length < 1) {
            return array;
        }

        int res = 0;
        int start = 0;
        int end = 0;

        for (int i = 0; i < array.length; i++) {
            int curMax = array[i];
            for (int j = i + 1; j < array.length; j++) {

                if (curMax > res) {
                    start = i;
                    end = j;

                    res = curMax;
                }

                if (j < array.length - 1) {
                    curMax += array[j];
                }
            }
        }

        int r[] = new int[end - start + 1];
        for (int i = 0; i < r.length; i++) {
            r[i] = array[start++];
        }

        return r;
    }


}
