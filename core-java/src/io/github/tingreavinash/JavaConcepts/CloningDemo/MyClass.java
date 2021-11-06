package io.github.tingreavinash.JavaConcepts.CloningDemo;

public class MyClass implements Cloneable {
    int i;
    int j;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
