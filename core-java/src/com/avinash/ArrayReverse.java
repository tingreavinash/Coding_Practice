package com.avinash;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_testcases = sc.nextInt();

        for (int j = 0; j < total_testcases; j++) {
            int size = sc.nextInt();
            int[] input = new int[size];

            for (int i = 0; i < size; i++) {
                input[i] = sc.nextInt();
            }
            int[] result = reverseArray(input, 0, size - 1);

            StringBuilder sb = new StringBuilder();
            for (int val : result) {
                sb.append(val + " ");
            }
            System.out.println(sb);
        }
    }

    // More efficient because it only traverse half the elements. No need to create separate array for storing result.
    private static int[] reverseArray(int[] input, int start, int end) {
        int temp;

        while (start < end) {
            temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            end--;
            start++;
        }

        return input;

    }

    private static Object[] reverseArrayType1(int[] input) {
        Object[] result = new Object[input.length];

        for (int i = input.length - 1; i >= 0; i--) {
            result[input.length - i - 1] = input[i];
        }

        return result;
    }
}
