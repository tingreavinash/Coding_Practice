package com.avinash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/3sum
 */

public class ThreeSum {

    public static void main(String[] args) {
        //int[] nums = {-1, 0, 1, 2, -1, -4};
        //Expected: [[-1,-1,2],[-1,0,1]]

        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        //Expected: [[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]

        List<List<Integer>> res = threesum(nums);
        System.out.println(res);
    }

    private static List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int firstNum = nums[i];
            int diff = -nums[i];
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[2];

            for (int j = i + 1; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                int currValue = nums[j];
                Integer k = map.get(diff - currValue);

                if (k != null) {

                    arr[0] = nums[k];
                    arr[1] = nums[j];

                    List<Integer> l = new ArrayList<>();
                    l.add(arr[0]);
                    l.add(firstNum);
                    l.add(arr[1]);
                    Collections.sort(l);

                    if (!results.contains(l)) {
                        results.add(l);
                    }


                } else {
                    map.put(nums[j], j);
                }
            }

        }
        return results;
    }
}
