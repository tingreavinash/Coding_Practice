package io.github.tingreavinash.java_concepts.Java8_Features;

@FunctionalInterface
interface Interf1 {
	int a=100;
	void show();
}


interface Interf2 {
	void sum(int a, int b);
}

public class MyFunctionalInterface {

	public static void main(String[] args) {

		// Lambda expression
		Interf1 i = () -> {
			System.out.println("Hello.. from lambda expression");
		};
		i.show();
		
		Interf2 iSum = (p, q)-> {System.out.println(p+q);};
		
		iSum.sum(100,200);
		//iSum.sum("abc", "pqr");
		
	}

}
