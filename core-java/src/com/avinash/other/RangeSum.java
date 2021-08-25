package com.avinash.other;

/**
 * Problem: Add all numbers from 0 to n.
 */

public class RangeSum {

    public static void main(String[] args) {

        long t1 = System.currentTimeMillis();
        System.out.println("Sum is: " + addUptoOptimized(555555555));
        long t2 = System.currentTimeMillis();
        System.out.println("Time taken for Optimized: " + (t2 - t1));

        System.out.println("Sum is: " + addUpto(555555555));
        long t3 = System.currentTimeMillis();
        System.out.println("Time taken for Normal: " + (t3 - t2));
    }

    public static long addUpto(int num) {
        long total = 0;
        for (int i = 0; i <= num; i++) {
            total = total + i;
        }
        return total;
    }

    public static long addUptoOptimized(int num) {
        return ((long) num * (num + 1)) / 2;
    }
}
