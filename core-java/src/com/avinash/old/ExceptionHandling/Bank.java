package com.avinash.old.ExceptionHandling;
import java.util.Scanner;

class InsufficientFundsException extends Exception {

	InsufficientFundsException(String s) {
		super(s);
	}
	@Override
	public String getLocalizedMessage() {
		String s = super.getMessage();
		if (s.contains("Funds")){
			s = s.replace("Funds", "Amount");
			return s;
		}
		return s;
	}

}

public class Bank {
	static double balance = 20000;

	public static void main(String[] args) {
		double amount;
		
		Scanner sc = new Scanner(System.in);
		
		amount = sc.nextDouble();
		sc.close();
		withdraw(amount);
		testmethod();
	}
	public static void testmethod() {
		System.out.println("Test");
	}
	public static void withdraw(double amount) {
		try {
			System.out.println("Amount to withdraw: "+amount);
			if (amount > balance) {
				throw new InsufficientFundsException("Funds not available");
			}
			System.out.println("Collect your money");
			
		}catch(InsufficientFundsException ex) {
			System.out.println(ex.getLocalizedMessage());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
