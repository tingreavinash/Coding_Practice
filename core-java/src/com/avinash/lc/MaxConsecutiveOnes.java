package com.avinash.lc;

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
        int start = 0;
        int zerocounter = 0;
        int max = Integer.MIN_VALUE;
        for (int end = 0; end < nums.length; end++) {
            if (nums[end] == 0) {
                zerocounter++;
            }
            while (zerocounter > k) {
                if (nums[start] == 0) {
                    zerocounter--;
                }
                start++;
            }
            max = calcMax(max, end - start + 1);
        }

        return max;
    }

    private static int calcMax(int val1, int val2) {
        if (val1 > val2) {
            return val1;
        } else {
            return val2;
        }
    }
}
