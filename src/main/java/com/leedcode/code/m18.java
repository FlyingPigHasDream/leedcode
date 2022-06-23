package com.leedcode.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/22 06:54
 */
public class m18 {

    public static void main(String[] args) {
        List<List<Integer>> res = fourSum(new int[]{0,0,0,1000000000,1000000000,1000000000,1000000000}, 1000000000);
        System.out.println(res);
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int l = nums.length;

        Arrays.sort(nums);

        for (int i = 0; i < l - 3; i ++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            if ((long)nums[i] + nums[i+1] + nums[i+2] + nums[i+3] > target) {
                continue;
            }

            if ((long)nums[i] + nums[l - 1] + nums[l - 2] + nums[l - 3] < target) {
                continue;
            }

            for (int j = i + 1; j < l - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                if (nums[i] + nums[j] + nums[j+1] + nums[j+2] > target) {
                    continue;
                }

                if (nums[i] + nums[j] + nums[l - 1] + nums[l - 2] < target) {
                    continue;
                }

                int left = j + 1;
                int right = l - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum < target) {
                        left++;
                        continue;
                    }

                    if (sum > target) {
                        right--;
                        continue;
                    }

                    if (sum == target) {
                        List<Integer> temp = new ArrayList<>();
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[left]);
                        temp.add(nums[right]);
                        res.add(temp);

                        while (left < right && nums[left + 1] == nums[left]) {
                            left++;
                        }

                        while (left < right && nums[right - 1] == nums[right]) {
                            right--;
                        }

                        left++;
                        right--;
                    }
                }

            }

        }

        return res;
    }
}
