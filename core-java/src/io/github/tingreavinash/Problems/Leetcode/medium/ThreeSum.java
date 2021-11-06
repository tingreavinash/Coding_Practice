package io.github.tingreavinash.Problems.Leetcode.medium;

import java.util.*;

/**
 * https://leetcode.com/problems/3sum
 */

public class ThreeSum {

    public static void main(String[] args) {
        //int[] nums = {-1,0,1,2,-1,-4};
        //Expected: [[-1,-1,2],[-1,0,1]]

        int[] nums = {-1, 0, 1, 2, -1, -4, -2, -3, 3, 0, 4};
        //Expected: [[-4,0,4],[-4,1,3],[-3,-1,4],[-3,0,3],[-3,1,2],[-2,-1,3],[-2,0,2],[-1,-1,2],[-1,0,1]]

        //List<List<Integer>> res = threesum(nums);
        List<List<Integer>> res = threesum1(nums);
        System.out.println(res);
    }

    // faster algorithm
    private static List<List<Integer>> threesum1(int[] nums) {
        Arrays.sort(nums);                                      // O(NlogN)
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {               // O(N)
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int start = i + 1, end = nums.length - 1, diff = -nums[i];
            while (start < end) {                                   // O(N)
                if (nums[start] + nums[end] == diff) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    while (start < end && nums[start] == nums[start + 1]) start++;
                    while (start < end && nums[end] == nums[end - 1]) end--;
                    start++;
                    end--;
                } else if (nums[start] + nums[end] < diff) {
                    start++;
                } else {
                    end--;
                }
            }

        }

        return result;
    }

    // it is slower O(N^3)
    private static List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {         // O(N)
            int diff = -nums[i];
            Map<Integer, Integer> map = new HashMap();

            for (int j = i + 1; j < nums.length; j++) {  // O(N)
                int target = diff - nums[j];
                Integer k = map.get(target);
                if (k != null) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[j]);
                    l.add(nums[k]);
                    Collections.sort(l);                   // O(Nlog(N)
                    if (!result.contains(l)) {
                        result.add(l);
                    }
                } else {
                    map.put(nums[j], j);
                }
            }
        }

        return result;
    }
}
