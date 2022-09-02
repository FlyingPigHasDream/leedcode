package com.leedcode.code;

import java.util.HashSet;
import java.util.Set;

public class math23 {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcabcbb");
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null) {
            return 0;
        }

        if (s.length() < 2) {
            return 1;
        }

        Set<Character> set = new HashSet<>();
        int max = 1;
        for (int i = 0; i < s.length(); i++) {
            set = new HashSet();
            int cur = 1;
            int idx = i + 1;
            while (idx < s.length()) {
                if (set.contains(s.charAt(idx))) {
                    break;
                }

                set.add(s.charAt(idx));
                cur++;
            }

            max = Math.max(max, cur);
        }

        return max;
    }
}
