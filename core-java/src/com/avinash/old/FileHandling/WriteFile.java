package com.avinash.old.FileHandling;

public class WriteFile {
	
	public static void main(String[] args) {
		
		B b = new B();
		System.out.println(b.x);
		try {
			System.out.println(10/0);
			
		}catch(ArithmeticException ex) {
			System.out.println("Arthmetic exception");
		}catch(RuntimeException ex ) {
			System.out.println("Other exception");
		}
		finally {
			System.out.println("Hello");
		}
		
	}

}
