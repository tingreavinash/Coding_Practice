package io.github.tingreavinash.java_concepts.InterviewProblems;

public class PlusMinus {

	public static void main(String[] args) {
		
		int[] array = {1,1,0,-1,-1};
		plusMinus(array);
	}
	
	public static void plusMinus(int[] arr) {
		
		float fraction_zero=0;
		float fraction_pos=0;
		float fraction_neg=0;
		
		for (int i=0;i<arr.length;i++) {
			if(arr[i] > 0) {
				fraction_pos++;
			}else if(arr[i] < 0) {
				fraction_neg++;
			}else {
				fraction_zero++;
			}
		}
		
		System.out.println(fraction_pos/arr.length);
		System.out.println(fraction_neg/arr.length);
		System.out.println(fraction_zero/arr.length);
	}

}
