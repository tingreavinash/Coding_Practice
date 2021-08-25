package com.avinash.lc;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/product-of-array-except-self/
 */
public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] result = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    private static int[] productExceptSelf(int[] nums) {
        int[] prodArray = new int[nums.length];
        int left = 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > 0) {
                left = left * nums[i - 1];
            }
            prodArray[i] = left;
        }

        int right = 1;

        for (int j = nums.length - 1; j >= 0; j--) {
            if (j < nums.length - 1) {
                right = right * nums[j + 1];
            }
            prodArray[j] = prodArray[j] * right;
        }

        return prodArray;
    }
}
