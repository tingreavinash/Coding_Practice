package io.github.tingreavinash.lc.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 */
public class DisappearedNumbers {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};

        List<Integer> result = findDisappearedNumbers1(nums);
        System.out.println(result);
    }

    //faster
    private static List<Integer> findDisappearedNumbers1(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int[] foundNums = new int[nums.length + 1];

        for (int num : nums) {
            foundNums[num]++;
        }

        for (int i = 1; i < foundNums.length; i++) {
            if (foundNums[i] == 0) {
                result.add(i);
            }
        }


        return result;
    }

    //Slower
    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        int start = 1;
        while (start <= nums.length) {
            if (map.get(start) == null) {
                result.add(start);
            }
            start++;
        }

        return result;
    }
}
