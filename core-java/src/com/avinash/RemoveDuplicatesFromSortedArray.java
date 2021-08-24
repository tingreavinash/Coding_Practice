package com.avinash;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = {0, 0, 2};
        int k = removeDuplicates(nums);
        System.out.println(k);

    }

    private static int removeDuplicates(int[] nums) {
        int start = 1;
        if (nums.length < 2) {
            return nums.length;
        }
        for (int end = 1; end < nums.length; end++) {
            if (nums[end] != nums[end - 1]) {
                nums[start] = nums[end];
                start++;
            }
        }
        return start;
    }
}
