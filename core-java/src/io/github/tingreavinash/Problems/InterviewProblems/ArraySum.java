package io.github.tingreavinash.Problems.InterviewProblems;

public class ArraySum {

	public static void main(String[] args) {
		
		int[] array_val = {1,2,3};
		
		int result  = simpleArraySum(array_val);
		System.out.println("Sum: "+result);
	}
	
	public static int simpleArraySum(int[] ar) {
		int sum = 0;
		
		for (int i=0; i<ar.length;i++) {
			sum = sum+ar[i];
		}
		return sum;
	}
}
