package com.leedcode.code;

public class m21 {

    public static void main(String[] args) {
        System.out.println(1);
    }

    public int divide(int dividend, int divisor) {


        return 0;
    }

    public int div(int a, int b) {
        if (a < b) {
            return 0;
        }

        int count = 1;
        int tempB = b;
        while (a > tempB + tempB) {
            count = count + count;
            tempB = tempB + tempB;
        }

        return count + div(a - tempB , b);
    }


}
