package com.avinash;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        //int input[] = {1, 2, 3, 4};
        String str = "avinash";
        char[] input = str.toCharArray();

        Object[] result = reverseArray(input);

        System.out.println(Arrays.toString(result));
    }

    private static Object[] reverseArray(char[] input) {
        Object[] result = new Object[input.length];

        for (int i = input.length - 1; i >= 0; i--) {
            result[input.length - i - 1] = input[i];
        }

        return result;
    }
}
