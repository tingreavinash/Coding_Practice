package com.avinash.old.InterviewProblems;

public class LargeNumber {

	public static void main(String[] args) {
		long[] input_arr= {4,1,6,3,2};
		
		long max_val = solution(input_arr);
		System.out.println(max_val);
		
	}
	
	public static long solution(long[] numbers) {
		long max_no=0;
		
		if (numbers.length ==0) return max_no;
		
		for (int i=0;i<numbers.length;i++) {
			if(max_no < numbers[i]) {
				max_no = numbers[i];
			}
		}
		
		return max_no;
	}

}
