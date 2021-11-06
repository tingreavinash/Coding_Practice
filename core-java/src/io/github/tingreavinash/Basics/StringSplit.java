package io.github.tingreavinash.Basics;

public class StringSplit {
    public static void main(String[] args) {
        String str = "India,Australia,New Zealand, Pakistan, Germany";
        String[] arr = str.split(",");
        for (String s : arr) {
            System.out.println(s.trim());
        }

    }
}
