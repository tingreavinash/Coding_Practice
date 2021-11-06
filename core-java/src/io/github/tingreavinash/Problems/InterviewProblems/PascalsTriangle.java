package io.github.tingreavinash.Problems.InterviewProblems;

/***
 * Print pascals triangle of given row size
 * Example: This is pascals triangle of size 4.
 *                  1
 *              1       1
 *          1       2       1
 *      1       3       3       1
 */

public class PascalsTriangle {
    public static void main(String[] args) {
        printPascalsTriangle(4);
    }

    public static void printPascalsTriangle(int size) {

        int[][] pt = new int[size][];

        for (int i = 0; i < size; i++) {
            pt[i] = new int[i + 1];
            pt[i][0] = 1;

            for (int j = 1; j < i; j++) {

                pt[i][j] = pt[i - 1][j - 1] + pt[i - 1][j];

            }
            pt[i][i] = 1;

        }

        for (int j = 0; j < size; j++) {
            for (int k = 0; k <= j; k++) {
                System.out.print(pt[j][k]);
            }
            System.out.println();
        }
    }
}
