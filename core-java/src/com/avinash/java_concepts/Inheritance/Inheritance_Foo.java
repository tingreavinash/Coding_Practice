package com.avinash.java_concepts.Inheritance;

/*
 Parent : default
 Child : default | protected | public
  
  Parent : protected
 Child : protected | public
  
  Parent : public
 Child : public
  
  Parent : private
  Child : Cannot be overridden
  
  --> Access modifier cannot be reduced in child class. 
  Only same or higher visibility modifier can be used.
  
 --> Exception: Child can throw the child object of exception.
  Ex. Parent -> Exception() 
  Child -> IOException() | Exception()
  */

class Foo1 {
	String bar = "bar1";

	public static void testMethod() {
		System.out.println("Static Hello from foo1");
	}

	String getBar() {
		return this.bar;
	}

	void setBar(final String bar) {
		this.bar = bar;
	}

	protected void show() {
		System.out.println("Hello from foo1");
	}

	public void method_foo1() {
		System.out.println("m - foo1");
	}

}

class Foo2 extends Foo1 {
	String bar = "bar2";

	public static void testMethod() {
		System.out.println("Static Hello from foo2");
	}

	@Override
	void setBar(final String bar) {
		this.bar = bar;
	}

	@Override
	public void show() {
		System.out.println("Hello from foo2");
	}

	public void method_foo2() {
		System.out.println("m - foo2");
	}

}

class Foo3 extends Foo2 {

}

public class Inheritance_Foo {
	final synchronized strictfp public static void main(final String[] args) {
		
		final Foo2 foo2 = new Foo2();
		foo2.setBar("foo");
		System.out.println(foo2.getBar());

		final Foo1 foo1 = foo2;
		System.out.println(foo1.getBar());

		Foo1 f1 = new Foo1();
		Foo1 f2 = new Foo2();
		Foo2 f22 = new Foo2();
		Foo1 f3 = new Foo3();

		f1.method_foo1();
		f2.method_foo1();

		f1.show();
		f2.show();
		f3.show();

		// Method hiding
		Foo1.testMethod();
		Foo1.testMethod();

		Foo1 obj1 = new Foo2();
		Foo2 obj2 = new Foo2();

		Foo2 obj3 = (Foo2) obj1;

		obj1.method_foo1();
		obj2.method_foo1();
		obj2.method_foo2();
		obj3.method_foo2();
		System.out.println(obj3 instanceof Foo1);
		System.out.println(obj3 instanceof Foo2);
		System.out.println(f3 instanceof Foo3);

	}

}
