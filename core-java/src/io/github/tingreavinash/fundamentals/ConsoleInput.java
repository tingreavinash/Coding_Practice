package io.github.tingreavinash.fundamentals;

import java.util.Scanner;

public class ConsoleInput {
    public static void main(String[] args) {
        String input_string = readInputFromConsole();
        System.out.println("Input value: " + input_string);
    }

    private static String readInputFromConsole() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some value: ");
        String str = sc.nextLine();
        return str;
    }
}
