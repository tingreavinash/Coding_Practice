package com.avinash.Inheritance;

public class Child extends Parent{
	//If you run this empty child class it will call main method from Parent Class.
	//int var1 = 20;
	public static void main(String args[]) {
		Child obj = new Child();
		obj.testmethod();
		System.out.println(obj.var1);
		
		int a = 22;
		String s = "avinash";
		
		System.out.println(a);
	}
}
