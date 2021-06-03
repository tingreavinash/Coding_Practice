package com.avinash;

/***
 * Problem: Check if given number is prime or not.
 */

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 4;

        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is NOT a prime number.");
        }
    }

    public static boolean isPrime(int n) {

        int divisor = 2;
        while (divisor < n) {
            if (n % divisor == 0) {
                return false;
            }
            divisor++;
        }

        return true;
    }
}
