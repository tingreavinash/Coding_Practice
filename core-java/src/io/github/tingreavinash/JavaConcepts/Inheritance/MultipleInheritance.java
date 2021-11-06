package io.github.tingreavinash.JavaConcepts.Inheritance;

interface A {
    default void display() {
        System.out.println("Display method from Interface A");
    }
}

interface B {
    default void display() {
        System.out.println("Display method from Interface B");
    }
}

public class MultipleInheritance implements A, B {
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        obj.display();
    }


    @Override
    public void display() {
        A.super.display();
    }
}
