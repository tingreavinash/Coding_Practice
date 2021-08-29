package com.avinash.lc.medium;

/**
 * https://leetcode.com/problems/max-consecutive-ones-iii/
 */
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;

        int result = longestOnes(arr, k);
        System.out.println(result);
    }

    // Sliding window technique
    private static int longestOnes(int[] nums, int k) {
        int counter = 0;
        int start = 0;
        int maxWindow = Integer.MIN_VALUE;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                counter++;
            }
            while (counter > k) {
                if (nums[start] == 0) {
                    counter--;
                }
                start++;
            }
            maxWindow = Math.max(maxWindow, end - start + 1);

        }
        return maxWindow;
    }

}
