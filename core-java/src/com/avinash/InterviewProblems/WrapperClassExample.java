package com.avinash.InterviewProblems;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		String a = "Avinash";

		int i = 10;
		
		Integer iRef =new Integer(i); // Boxing
		int j = iRef.intValue(); // Unboxing

		Integer jRef = i; //AutoBoxing 
		int k = iRef; //AutoUnboxing
		
		System.out.println("i: "+i);
		System.out.println("iRef: "+iRef);

		System.out.println("j: "+j);
		System.out.println("jRef: "+jRef);
		System.out.println("k: "+k);

	}

}
