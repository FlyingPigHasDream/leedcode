package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/21 21:29
 */
public class m17 {

    public static void main(String[] args) {
        threeSumClosest(new int[]{-1, 1, 2, 4}, 1);
    }

    public static int threeSumClosest(int[] nums, int target) {
        if (nums == null) {
            return 0;
        }

        int l = nums.length;
        int sum = 0;
        if (l < 4) {
            for (int i = 0; i < l; i ++) {
                sum = sum + nums[i];
            }
            return sum;
        }

        sum = Integer.MAX_VALUE;
        for (int i = 0; i < l; i++) {
            int left = i + 1;
            int right = l - 1;
            while (left < right) {
                int tempSum = nums[i] + nums[left] + nums[right];
                if (Math.abs(target - tempSum) < Math.abs(target - sum)) {
                    sum = tempSum;
                }

                left ++;
                right --;
            }
        }

        return sum == Integer.MAX_VALUE ? 0 : sum;
    }
}
