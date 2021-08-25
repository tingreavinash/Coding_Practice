package com.avinash.other;

class pair {
    long first, second;

    public pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class MinMaxPair {
    public static void main(String[] args) {
        long[] arr = {1, 2, 3, 4};

        pair result = getMinMax(arr, arr.length);
        System.out.println("MIN : " + result.first + ", MAX : " + result.second);
    }

    static pair getMinMax(long[] a, long n) {
        long MIN = a[0];
        long MAX = a[0];

        for (int i = 0; i < n; i++) {
            if (MIN > a[i]) {
                MIN = a[i];
            }
            if (MAX < a[i]) {
                MAX = a[i];
            }
        }

        return new pair(MIN, MAX);
    }
}
