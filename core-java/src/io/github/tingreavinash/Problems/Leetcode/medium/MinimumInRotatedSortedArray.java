package io.github.tingreavinash.Problems.Leetcode.medium;

/**
 * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
 */
public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = findMin1(nums);
        System.out.println(result);
    }

    // Binary search
    private static int findMin1(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = (end + start) / 2;
            if (mid > 0 && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if (nums[start] <= nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }


    //slower
    private static int findMin(int[] nums) {
        int index = 0;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > nums[i + 1]) {
                index = i + 1;
                break;
            }
        }
        min = nums[index];

        return min;
    }
}
