package com.avinash.InterviewProblems;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

abstract class Base {
	int a = 10;
	int b;
	final void fun2() {
		System.out.println("fun2() called");
	}

	void printmsg() {
		System.out.println("Hello!");
	}

}

class Derived extends Base implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Derived(int val){
		super.b=val;
	}
}

public class TestClass3 {
	public static void main(String args[]) throws IOException, ClassNotFoundException {
		Base b = new Derived(30);
		
		System.out.println(b.b);

		FileOutputStream fos = new FileOutputStream("xyz.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(b);
		oos.close();

		FileInputStream fis = new FileInputStream("xyz.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Base c = (Base) ois.readObject();

		System.out.println("Serialize: " + c.b);

		ois.close();
	}
}