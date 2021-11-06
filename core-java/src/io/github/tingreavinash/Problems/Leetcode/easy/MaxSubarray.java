package io.github.tingreavinash.Problems.Leetcode.easy;

/**
 * https://leetcode.com/problems/maximum-subarray/
 */
public class MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    private static int maxSubArray(int[] nums) {

        int maxSum = Integer.MIN_VALUE;

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum < 0) {
                sum = nums[i];
            } else {
                sum = sum + nums[i];
            }

            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}
