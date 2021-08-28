package com.avinash.lc;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {
    public static void main(String[] args) {
        String input = "MCMXCIV";
        int result = romanToInt2(input);

        System.out.println(result);
    }

    private static int romanToInt2(String s) {
        int sum = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        s = s.replace("IV", "IIII");
        s = s.replace("IX", "VIIII");
        s = s.replace("XL", "XXXX");
        s = s.replace("XC", "LXXXX");
        s = s.replace("CD", "CCCC");
        s = s.replace("CM", "DCCCC");

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            sum = sum + map.get(charArray[i]);
        }

        return sum;
    }

    private static int romanToInt1(String s) {
        char[] charArray = s.toCharArray();
        int[] nums = new int[charArray.length];
        int sum = 0;

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];

            switch (c) {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
            }
        }

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                sum = sum - nums[i];
            } else {
                sum = sum + nums[i];
            }
        }


        return sum + nums[nums.length - 1];
    }

    private static int romanToInt(String s) {
        int result = 0;

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] charArray = s.toCharArray();

        for (int i = charArray.length - 1; i >= 0; i--) {
            char letter = charArray[i];

            if (i != charArray.length - 1 && map.get(charArray[i]) < map.get(charArray[i + 1])) {
                result = result - map.get(letter);
            } else {
                result = result + map.get(letter);
            }


        }

        return result;
    }
}
