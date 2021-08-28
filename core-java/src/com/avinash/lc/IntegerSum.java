package com.avinash.lc;

/**
 * https://leetcode.com/problems/sum-of-two-integers/
 */
public class IntegerSum {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int result = getSum(a, b);

        System.out.println(result);
    }

    private static int getSum(int a, int b) {
        int temp;

        while (b != 0) {
            temp = a & b;
            a = a ^ b;
            b = temp << 1;
        }

        return a;
    }
}
