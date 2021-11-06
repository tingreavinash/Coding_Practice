package io.github.tingreavinash.Problems.Leetcode.medium;

/**
 * https://leetcode.com/problems/maximum-product-subarray/
 */
public class MaxProductSubarray {
    public static void main(String[] args) {
        int[] nums = {3, -1, 4, -2};
        int res = maxProduct(nums);
        System.out.println(res);
    }

    private static int maxProduct(int[] nums) {
        int result = Integer.MIN_VALUE;
        int product = 1;

        for (int i = 0; i < nums.length; i++) {
            product = product * nums[i];

            result = Math.max(result, product);
            if (product == 0) {
                product = 1;
            }
        }
        product = 1;

        for (int i = nums.length - 1; i >= 0; i--) {
            product = product * nums[i];

            result = Math.max(result, product);
            if (product == 0) {
                product = 1;
            }
        }

        return result;
    }
}
