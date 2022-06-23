package com.leedcode.code;

import java.util.HashSet;
import java.util.Set;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/23 06:35
 */
public class m20 {
    // time O(n);
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int l = nums.length;
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                l--;
            } else {
                set.add(nums[i]);
            }
        }

        return l;
    }
}
