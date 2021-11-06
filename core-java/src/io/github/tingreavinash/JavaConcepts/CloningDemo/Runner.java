package io.github.tingreavinash.JavaConcepts.CloningDemo;


public class Runner {
	public static void main(String... args) throws CloneNotSupportedException {

		MyClass obj = new MyClass();
		obj.i = 1;
		obj.j = 2;


		MyClass obj1 = obj;
		System.out.println("obj1.i=" + obj1.i);
		System.out.println("obj1.j=" + obj1.j);

		obj.i = 10;
		obj.j = 20;
		System.out.println("obj1.i=" + obj1.i);
		System.out.println("obj1.j=" + obj1.j);

		MyClass obj2 = new MyClass();
		obj2.i = obj.i;
		obj2.j = obj.j;
		System.out.println("obj2.i=" + obj2.i);
		System.out.println("obj1.j=" + obj2.j);

		obj.i = 30;
		obj.j = 40;
		System.out.println("obj2.i=" + obj2.i);
		System.out.println("obj1.j=" + obj2.j);


		MyClass obj3 = (MyClass) obj.clone();
		System.out.println("obj3.i=" + obj3.i);
		System.out.println("obj3.j=" + obj3.j);


	}
}
