package com.avinash.old.InterviewProblems;

class myClass {

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Objects destroyed...");
	}

}

public class FinalizeExample {

	public static void main(String[] args) {
		
		myClass obj = new myClass();
		
		obj = null;
		System.gc();
	}
}
