package io.github.tingreavinash.java_concepts.abstractClass;

interface A{
	void method1();
}

abstract class B{
	abstract void method1();
}

public class Abstract_Interface_Ambiguity extends B implements A{
	/* 
	 Here you are implementing the method from Abstract class, NOT from interface.
	 It is because JVM finding the declared methods sequentially, so it is finding method from class.
	 You cannot use "implements" before "extends" !!
	 */
	@Override
	public void method1() {
		
	} 

	public static void main(String...args) {
		System.out.println("Heelo");
		
	}

}
