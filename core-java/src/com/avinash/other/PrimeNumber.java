package com.avinash.other;

/***
 * Problem: Print all prime numbers less than or equal to given number.
 * Note: this is slower than sieve of Eratosthenes algorithm.
 */

public class PrimeNumber {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();

        printPrimeNumbers(100);
        long endtime = System.currentTimeMillis();
        System.out.println("\nTime taken: " + (endtime - starttime));

    }

    public static void printPrimeNumbers(int number) {
        int start = 2;
        while (start <= number) {
            if (isPrime(start)) {
                System.out.print(start + " ");
            }
            start++;
        }
    }

    public static boolean isPrime(int n) {

        int divisor = 2;
        while (divisor * divisor <= n) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }

        return true;
    }
}
