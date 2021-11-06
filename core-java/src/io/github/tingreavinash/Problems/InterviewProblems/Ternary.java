package io.github.tingreavinash.Problems.InterviewProblems;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class Test{
	
	public <T>void method1(T ob) {
		System.out.println("Hello Generic method");
	}
}

public class Ternary {

	public static void main(String[] args) {

		int income = 101_000;
		String personClass = (income > 100_000) ? "First":"Middle";
		System.out.println(personClass);
		
		Integer a = new Integer("10");
		
		System.out.println(a);
		
		
		ArrayList al = new ArrayList();
		
		//al.add("Avinash");
		//al.add("Kapil");
		//al.add("Atul");
		al.add(10.5);
		al.add(10.0);
		System.out.println(al);
		
		Set mySet = new TreeSet(al);
		
		
		System.out.println(mySet);
		
		
	}
	
	

}
