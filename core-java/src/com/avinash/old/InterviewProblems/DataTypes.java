package com.avinash.old.InterviewProblems;

import java.util.Scanner;

public class DataTypes {
	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
        String string_val ="";
        int int_val;
        double double_val;
        
        int_val = scan.nextInt();
        double_val = scan.nextDouble();	
        scan.nextLine();
        string_val = scan.nextLine();
        
        
    	System.out.println(int_val +" "+double_val+" "+string_val);
        
        scan.close();
	}
}
