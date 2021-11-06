package io.github.tingreavinash.JavaConcepts.Serialization;

import java.io.*;

class Student implements Serializable {
    transient int rollnum;
    String name;


    Student(String name, int rollnum) {
        this.name = name;
        this.rollnum = rollnum;
    }
}

public class Runner {
    static File file = new File("C:\\Personal\\My Project\\coding-practice\\core-java\\src\\io\\github\\tingreavinash\\java_concepts\\serialization\\object.out");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serializeObject();
        deserializeObject();
    }

    public static void serializeObject() throws IOException {
        Student s1 = new Student("Avinash", 61);
        System.out.println("Before serialization: " + s1.name + " " + s1.rollnum);

        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        fout.close();
        System.out.println("object state persisted in file.");
    }

    public static void deserializeObject() throws IOException, ClassNotFoundException {
        FileInputStream fin = new FileInputStream(file);
        ObjectInputStream in = new ObjectInputStream(fin);
        Student s2 = (Student) in.readObject();
        in.close();
        fin.close();
        System.out.println("Name: " + s2.name + ", Roll num: " + s2.rollnum);
    }
}
