package io.github.tingreavinash.other;

import java.util.Scanner;

/***
 * Reena had been given an array arr[] of positive integers of size N.Help her to find the value A.
 *
 * A = arr[n]*arr[n] - arr[n-1]*arr[n-1] + arr[n-2]*arr[n-2] - ......... upto index 1
 */

public class ReverseSquaredSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total_testcases = sc.nextInt();

        for (int j = 0; j < total_testcases; j++) {
            int size = sc.nextInt();
            int[] input = new int[size];

            for (int i = 0; i < size; i++) {
                input[i] = sc.nextInt();
            }
            int result = reverseSquredSumCalculate(input, 0, size - 1);

            System.out.println(result);
        }
    }

    private static int reverseSquredSumCalculate(int[] input, int start, int end) {
        int sum = input[end] * input[end];
        boolean addition = false;

        for (int i = end - 1; i >= 0; i--) {
            if (addition) {
                sum = sum + (input[i] * input[i]);
                addition = !addition;
            } else {
                sum = sum - (input[i] * input[i]);
                addition = !addition;
            }
        }

        return sum;

    }

}
