package com.avinash.lc;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOf1Bits {
    public static void main(String[] args) {
        int a = 00000000000000000000000010000000;
        int result = hammingWeight(a);

        System.out.println(result);
    }

    private static int hammingWeight(int n) {
        int ones = 0;

        while (n != 0) {
            ones = ones + (n & 1);
            n = n >>> 1;
        }

        return ones;
    }
}
