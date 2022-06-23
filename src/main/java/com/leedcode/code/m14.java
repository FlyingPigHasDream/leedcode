package com.leedcode.code;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/21 03:38
 */
public class m14 {
    public static void main(String[] args) {
        int res = myAtoi(",42,");
        System.out.println(res);
    }
    public static int myAtoi(String s) {
        if (s == null || s.length() < 1) {
            return 0;
        }

        Set<String> set = new HashSet<>();
        set.add("0");
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.add("5");
        set.add("6");
        set.add("7");
        set.add("8");
        set.add("9");

        int length = s.length();
        int sign = 1;
        if (s.charAt(0) == '-') {
            sign = -1;
        }

        int res = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (!set.contains(String.valueOf(c))) {
                if (res > 0) {
                    return res * sign;
                }
                continue;
            }

            res = res * 10 + Integer.valueOf(String.valueOf(c));
        }

        return res * sign;
    }
}
