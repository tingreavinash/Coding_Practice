package io.github.tingreavinash.lc.medium;

import java.util.Arrays;

/**
 * https://leetcode.com/contest/weekly-contest-256/problems/find-the-kth-largest-integer-in-the-array/
 */
public class KthLargestInteger {
    public static void main(String[] args) {
        String[] nums = {"2", "21", "12", "1"};
        int k = 3;
        String result = kthLargestNumber(nums, k);
        System.out.println(result);
    }

    private static String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return Integer.compare(o1.length(), o2.length());
        });

        return nums[nums.length - k];
    }
}
