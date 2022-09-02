package com.leedcode.code;

public class math24 {
    public static void main(String[] args) {
        reverse(1534236469);
    }

    public static int reverse(int x) {
        if (x == 0) {
            return x;
        }

        boolean flag = false;
        int res = 0;
        if (x < 0) {
            flag = true;
            x = -1 * x;
        }

        while (x > 0) {
            if (res != 0) {
                res = res * 10;
            }
            int a = x % 10;
            res = res + a;
            x = x / 10;
        }

        return flag ? -1 * res : res;
    }
}
