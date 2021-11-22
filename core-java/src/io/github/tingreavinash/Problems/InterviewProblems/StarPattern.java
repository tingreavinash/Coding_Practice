package io.github.tingreavinash.Problems.InterviewProblems;

public class StarPattern {
    public static void main(String[] args) {
        print(4);
    }

    public static void print(int size) {
        for (int i = 1; i <= size; i++) {

            for (int j = size - i; j > 0; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
