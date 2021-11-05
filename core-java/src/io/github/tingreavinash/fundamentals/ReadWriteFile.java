package io.github.tingreavinash.fundamentals;

import java.io.*;
import java.util.Scanner;

public class ReadWriteFile {
    public static File FILE = new File("C:\\Personal\\My Project\\coding-practice\\core-java\\abc.txt");


    public static void main(String[] args) throws IOException {
        writeFileUsingFileWriter(FILE);
        writeFileUsingBufferedWriter(FILE);
        //readFileUsingBufferedReader(FILE);
        //readFileUsingFileReader(FILE);
        //readFileUsingScanner(FILE);
    }

    private static void writeFileUsingBufferedWriter(File file) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
        bw.write("Hello Atul");
        bw.close();
    }

    private static void writeFileUsingFileWriter(File file) throws IOException {
        FileWriter fr = new FileWriter(file);

        fr.write("Hello Avinash");
        fr.close();
    }

    private static void readFileUsingScanner(File file) throws FileNotFoundException {
        System.out.println("==== Scanner ====");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }

    private static void readFileUsingFileReader(File file) throws IOException {
        System.out.println("==== FileReader ====");

        FileReader fr = new FileReader(file);
        int i;
        while ((i = fr.read()) != -1) {
            System.out.println((char) i);
        }
        fr.close();
    }

    private static void readFileUsingBufferedReader(File file) throws IOException {
        System.out.println("==== BufferedReader ====");

        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        while ((st = br.readLine()) != null) {
            System.out.println(st);
        }
        br.close();
    }
}
