package com.avinash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Given an array of n numbers, and target value. Return the indices of two numbers such that sum is equal to target.
 */
//FIXME:

public class TwoSum {

    public static void main(String[] args) {
        int[] input = {3, 3};
        int target = 6;

        int[] result = twoSumOptimized(input, target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSumOptimized(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (map.containsKey(comp)) {
                return new int[]{map.get(comp), i};
            }
            map.put(nums[i], i);

        }
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];

                if (sum == target && i != j) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }

            }
        }
        return result;
    }
}
