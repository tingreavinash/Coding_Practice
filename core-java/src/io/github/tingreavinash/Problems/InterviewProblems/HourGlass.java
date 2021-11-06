package io.github.tingreavinash.Problems.InterviewProblems;

public class HourGlass {
	
	public static void main(String[] args) {
		
		int[][] input_arr = {
				{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}
		};
		
		int result = hourglassSum(input_arr);
		System.out.println("Max sum of hourglass is : "+result);
		
	}
	public static int hourglassSum(int[][] arr) {
	
		int max_sum=0;
		
		if (arr.length !=6) {
			return -1;
		}
		
		for (int k =1;k<=4;k++) {
			for (int l =1;l<=4;l++) {
				int center_hg = arr[k][l];
				int sum_upper = arr[k-1][l-1]+arr[k-1][l]+arr[k-1][l+1];
				int sum_lower = arr[k+1][l-1]+arr[k+1][l]+arr[k+1][l+1];
				int total_sum = center_hg + sum_upper+sum_lower;
				
				if (max_sum < total_sum) {
					max_sum = total_sum;
				}
				
			}
		}
		
		return max_sum;
	}
	
}
