package io.github.tingreavinash.Problems.InterviewProblems;

/***
 * Sieve of Eratosthenes
 *
 * Problem: Print all prime numbers less than or equal to given number.
 */

public class PrimeNumber2 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        printPrimeNumbers(100);
        long endtime = System.currentTimeMillis();

        System.out.println("\nTime taken: " + (endtime - starttime));
    }

    public static void printPrimeNumbers(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            primes[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {

            if (primes[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    primes[j] = false;
                }
            }
        }


        for (int k = 2; k <= n; k++) {
            if (primes[k]) {
                System.out.print(k + " ");
            }
        }
    }
}
