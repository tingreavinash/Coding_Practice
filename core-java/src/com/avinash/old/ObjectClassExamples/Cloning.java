package com.avinash.old.ObjectClassExamples;

class A implements Cloneable {
	int i;
	int j;
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}

public class Cloning {
	public static void main(String... args) throws CloneNotSupportedException {
		
		A obj = new A();
		obj.i = 1;
		obj.j = 2;
		
		
		A obj1 = obj;
		System.out.println("obj1.i="+obj1.i);
		System.out.println("obj1.j="+obj1.j);
		
		obj.i = 10;
		obj.j = 20;
		System.out.println("obj1.i="+obj1.i);
		System.out.println("obj1.j="+obj1.j);
		
		A obj2 = new A();
		obj2.i = obj.i;
		obj2.j = obj.j;
		System.out.println("obj2.i="+obj2.i);
		System.out.println("obj1.j="+obj2.j);
		
		obj.i = 30;
		obj.j = 40;
		System.out.println("obj2.i="+obj2.i);
		System.out.println("obj1.j="+obj2.j);
		
		
		A obj3 = (A) obj.clone();
		System.out.println("obj3.i="+obj3.i);
		System.out.println("obj3.j="+obj3.j);
		
		
	}
}
