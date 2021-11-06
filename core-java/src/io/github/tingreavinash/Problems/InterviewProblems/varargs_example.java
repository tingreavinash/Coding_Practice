package io.github.tingreavinash.Problems.InterviewProblems;

public class varargs_example {

	public static final void main(String[] args) {
		
		int[] a = {1,3,4,111,43};
		add_numbers(1,3,45);
		add_numbers(a);
	}
	
	public static void add_numbers(int... num) {
		System.out.println("Total numbers: "+num.length);
		int sum = 0;
		for(int i: num) {
			sum = sum+i;
			System.out.println(i+ " ");
		}
		System.out.println("Sum: "+sum);
	}
}
