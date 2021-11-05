package io.github.tingreavinash.gfg;

/**
 * https://www.geeksforgeeks.org/maximum-difference-between-two-elements/
 */
public class MaxDifferenceBetweenNumbers {
    public static void main(String[] args) {
        int[] arr = {1, 2, 90, 10, 110};
        int result = findMaxDifference1(arr);
        System.out.println(result);
    }

    private static int findMaxDifference1(int[] arr) {
        int max = Integer.MIN_VALUE;

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int diff = arr[i] - min;
            max = Math.max(max, diff);

            min = Math.min(arr[i], min);
        }

        return max;
    }

    private static int findMaxDifference(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int diff = arr[j] - arr[i];
                max = Math.max(max, diff);
            }
        }

        return max;
    }
}
