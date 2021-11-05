package io.github.tingreavinash.other;

public class ArraySum {
    public static void main(String[] args) {
        int[] input = {1, 2, 3, 5, 3, 2, 4};
        System.out.println(sumElement(input, input.length));
    }

    public static int sumElement(int[] arr, int n) {
        int result = 0;

        for (int i = 0; i < n; i++) {
            result = result + arr[i];
        }

        return result;
    }
}
