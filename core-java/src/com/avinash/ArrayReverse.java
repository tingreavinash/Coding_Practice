package com.avinash;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        //int input[] = {1, 2, 3, 4};
        String str = "avinash";
        char[] input = str.toCharArray();

        Object[] result1 = reverseArrayType1(input);
        char[] result2 = reverseArrayType2(input, 0, input.length - 1);

        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
    }

    // More efficient because it only traverse half the elements. No need to create separate array for storing result.
    private static char[] reverseArrayType2(char[] input, int start, int end) {
        char temp;

        while (start < end) {
            temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            end--;
            start++;
        }

        return input;

    }

    private static Object[] reverseArrayType1(char[] input) {
        Object[] result = new Object[input.length];

        for (int i = input.length - 1; i >= 0; i--) {
            result[input.length - i - 1] = input[i];
        }

        return result;
    }
}
