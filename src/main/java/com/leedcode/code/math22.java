package com.leedcode.code;

/**
 * @author: LiaoYangJun
 * @description:
 * @Date: 2022/06/26 01:30
 */
public class math22 {

    public static void main(String[] args) {
        String str = "123";
        System.out.println(str.charAt(0));
        System.out.println(search(new int[]{4,5,6,7,8,1,2,3}, 8));
    }

    public static int search(int[] nums, int target) {
        if (nums == null || nums.length < 1) {
            return -1;
        }

        int l = nums.length;
        return search(nums, 0, l - 1, target);
    }

    public static int search(int[] nums, int left, int right, int target) {
        if (right - left  == 0) {
            return target == nums[right] ? right : -1;
        }

        if (right - left == 1) {
            if (target == nums[left]) {
                return left;
            }

            if (target == nums[right]) {
                return right;
            }

            return -1;
        }

        int mid = (right + left) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        if (mid - 1 < left) {
            return -1;
        }

        if (mid + 1 > right) {
            return -1;
        }

        if (nums[0] <= nums[mid]) {

        } else {

        }

        if (nums[mid] > target && nums[left] <= target) {
            return search(nums, left, mid - 1, target);
        } else if (nums[mid] > target && nums[left] > target){
            return search(nums, mid + 1, right, target);
        } else if (nums[mid] < target && target <= nums[right]) {
            return search(nums, mid + 1, right, target);
        } else if (nums[mid] < target && target > nums[right]) {
            return search(nums, left, mid - 1, target);
        }

        return -1;
    }

}
