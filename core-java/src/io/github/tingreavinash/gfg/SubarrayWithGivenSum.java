package io.github.tingreavinash.gfg;

import java.util.ArrayList;
import java.util.List;

/**
 * https://practice.geeksforgeeks.org/problems/subarray-with-given-sum-1587115621/1
 */
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {8};

        List<Integer> result = subarraySum(nums, nums.length, 8);
        System.out.println(result);
    }

    private static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        ArrayList<Integer> result = new ArrayList<>();

        int sum = arr[0];
        int start = 0;
        if (arr.length == 1 && arr[0] == s) {
            result.add(1);
            result.add(1);
            return result;
        }

        for (int end = 1; end <= n; end++) {

            if (sum == s) {
                result.add(start + 1);
                result.add(end);
                return result;
            }

            if (end < n) {
                sum = sum + arr[end];
            }

            while (sum > s && end < n) {
                sum = sum - arr[start];
                start++;
            }
        }


        result.add(-1);
        return result;
    }
}
