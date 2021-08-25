package com.avinash.lc;

/**
 * https://leetcode.com/problems/container-with-most-water/
 */
public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int result = maxArea(heights);
        System.out.println(result);
    }

    private static int maxArea(int[] height) {
        int maxArea = 0;

        int start = 0, end = height.length - 1;

        while (start < end) {
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            maxArea = Math.max(maxArea, w * h);

            if (height[start] > height[end]) {
                end--;
            } else {
                start++;
            }
        }


        return maxArea;
    }
}
