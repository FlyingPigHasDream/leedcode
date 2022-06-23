package com.leedcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/21 18:51
 */
public class m16 {

    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        if (nums == null || nums.length < 1) {
            return list;
        }

        int l = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < l; i++) {
            int cur = nums[i];
            if (nums[i] > 0 || (i > 0 && nums[i] == nums[i - 1])) {
                continue;
            }

            int left = i + 1;
            int right = l - 1;
            int need = cur;
            while (left < right) {
                if (need + nums[right] + nums[left] > 0) {
                    right = right - 1;
                    continue;
                }

                if (need + nums[right] + nums[left] < 0) {
                    left = left + 1;
                    continue;
                }

                if (need + nums[right] + nums[left] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    list.add(temp);
                    while (left < right && nums[left] == nums[left + 1]) {
                        left = left + 1;
                    }

                    while (right > left && nums[right] == nums[right- 1]) {
                        right = right - 1;
                    }
                    left = left + 1;
                    right = right - 1;
                }
            }
        }
        return list;
    }
}
