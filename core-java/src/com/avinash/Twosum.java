package com.avinash;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Twosum {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] res = twoSum1(nums, target);
        System.out.println(Arrays.toString(res));
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];

        Map<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            Integer index = map.get(target - currentNum);
            if (index != null) {
                res[0] = index;
                res[1] = i;
                return res;
            } else {
                map.put(currentNum, i);
            }
        }

        return result;
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int num1 = nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;
                int num2 = nums[j];
                if (num1 + num2 == target) {
                    result[0] = j;
                    result[1] = i;
                }
            }

        }
        return result;
    }
}
