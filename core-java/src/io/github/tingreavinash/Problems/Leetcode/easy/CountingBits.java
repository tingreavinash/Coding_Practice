package io.github.tingreavinash.Problems.Leetcode.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {
    public static void main(String[] args) {
        int a = 5;
        int[] result = countBits1(a);

        System.out.println(Arrays.toString(result));
    }

    private static int[] countBits1(int n) {
        int[] result = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            result[i] = result[i >> 1] + i % 2;
        }

        return result;
    }

    private static int[] countBits(int n) {
        int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int ones = 0;

            int num = i;
            while (num != 0) {
                ones = ones + (num & 1);
                num = num >>> 1;
            }
            result[i] = ones;
        }

        return result;
    }
}
