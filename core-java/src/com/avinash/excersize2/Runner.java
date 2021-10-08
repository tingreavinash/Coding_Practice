package com.avinash.excersize2;

import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        byte test = 'c';
        System.out.println((char) test);

        String password = "secret@123";
        JPasswordField pass = new JPasswordField(password);
        char[] charArr = pass.getPassword();

        System.out.println(charArr);

        test();

    }

    static final private void test() {
        System.out.println("000000>>>");
    }
}
