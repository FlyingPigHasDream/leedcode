package com.leedcode.code;

import java.util.ArrayList;
import java.util.List;

public class math25 {
    public static void main(String[] args) {
        isPalindrome(100);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String s = String.valueOf(x);
        int l = s.length();
        int mid = l / 2;
        boolean flag = l % 2 == 0;
        int left = 0;
        int right = 0;
        if (flag) {
            left = mid -1;
            right = mid;
        } else {
            left = mid - 1;
            right = mid + 1;
        }

        while (left > -1 && right < l) {
            if (Integer.valueOf(s.charAt(left)) != Integer.valueOf(s.charAt(right))) {
                return false;
            }

            left--;
            right++;
        }
        List<Integer> r = new ArrayList<>();
        r.remove(-1);
        return true;
    }
}
