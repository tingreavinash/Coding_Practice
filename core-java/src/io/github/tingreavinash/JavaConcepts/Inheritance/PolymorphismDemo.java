package io.github.tingreavinash.JavaConcepts.Inheritance;

class Parent {
    static void show() {
        System.out.println("Show method from Parent class");
    }

    protected void display() {
        System.out.println("Display method from Parent class");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Show method from Child class");
    }

    @Override
    public void display() {
        System.out.println("Display method from Child class");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Parent obj = new Child();
        Parent.show(); // It will call method from parent class due to static-binding (Method hiding)

        obj.display();
    }
}
