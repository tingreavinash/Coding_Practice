package io.github.tingreavinash.java_concepts.serialization;

import java.io.*;

class Student implements Serializable {
    String name;
    int rollnum;

    Student(String name, int rollnum) {
        this.name = name;
        this.rollnum = rollnum;
    }
}

public class Runner {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1 = new Student("Avinash", 61);
        File file = new File("C:\\Personal\\My Project\\coding-practice\\core-java\\src\\io\\github\\tingreavinash\\java_concepts\\serialization\\object.out");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        fout.close();
        System.out.println("object state persisted in file.");


        FileInputStream fin = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fin);
        Student s2 = (Student) in.readObject();
        in.close();
        fin.close();
        System.out.println("Name: " + s2.name + ", Roll num: " + s2.rollnum);
    }
}
