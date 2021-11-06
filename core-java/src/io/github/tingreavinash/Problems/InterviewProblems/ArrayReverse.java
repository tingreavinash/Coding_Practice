package io.github.tingreavinash.Problems.InterviewProblems;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 4};
        int[] result = reverseArrayType1(input);

        for (int val : result) {
            System.out.print(val + " ");
        }

    }

    /***
     *    More efficient because it only traverse half the elements.
     *    No need to create separate array for storing result.
     */
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

    private static int[] reverseArrayType1(int[] input) {
        int[] result = new int[input.length];
        int size = input.length;

        for (int i = size - 1; i >= 0; i--) {
            result[size - i - 1] = input[i];
        }

        return result;
    }
}
