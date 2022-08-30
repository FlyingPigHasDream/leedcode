package com.leedcode.code;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class m23 {
    public static void main(String[] args) {
        int[] array = new int[]{3, 2, 4};
        System.out.println(JSON.toJSON(twoSum(array, 6)));
    }

    public static int[] twoSum(int[] nums, int target) {
        //Arrays.sort(nums);
        return solve(nums, target, 0, 1);
    }

    private static int[] solve(int[] nums, int target, int idx1, int idx2) {
        if (idx1 > nums.length - 2 ) {
            return null;
        }

        if (idx2 > nums.length - 2) {
            return solve(nums, target, idx1 + 1, idx1 + 2);
        }

        int sum = nums[idx1] + nums[idx2];
        if (sum == target) {
            return new int[]{idx1, idx2};
        }

      /*  if (sum > target) {
            return solve(nums, target, idx1 + 1, idx1 + 2);
        }*/

        return solve(nums, target, idx1, idx2 + 1);
    }


}
