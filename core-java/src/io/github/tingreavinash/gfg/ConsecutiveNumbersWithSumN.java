package io.github.tingreavinash.gfg;

public class ConsecutiveNumbersWithSumN {
    public static void main(String[] args) {
        int num = 9;
        printNumbers(num);
    }

    private static void printNumbers(int N) {
        int start = 1;
        int end = 1;
        int sum = 1;

        while (start <= N / 2) {

            if (sum < N) {
                end++;
                sum = sum + end;
            } else if (sum > N) {
                sum = sum - start;
                start++;
            } else if (sum == N) {
                for (int i = start; i <= end; i++) {
                    System.out.print(i + " ");
                }
                System.out.println("\n");
                sum = sum - start;
                start++;
            }

        }
    }

}
