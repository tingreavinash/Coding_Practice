package com.avinash;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("abcbaa"));
    }

    private static int isPalindrome(String S) {
        int flag = 1;

        char[] char_arr = S.toCharArray();

        int start = 0;
        int end = char_arr.length - 1;

        while (start < end) {
            if (char_arr[start] == char_arr[end]) {
                end--;
                start++;
            } else {
                return 0;
            }
        }

        return flag;
    }
}
