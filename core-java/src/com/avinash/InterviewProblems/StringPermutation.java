package com.avinash.InterviewProblems;

import java.util.ArrayList;
import java.util.List;
/**
 * Program to divide the string to words and get the list of all possible
 * permutation of words in string.
 * @author avinasht
 *
 */
public class StringPermutation {
	public List<String> perm_list = new ArrayList<String>();

	public static void main(String[] args) {
		StringPermutation obj = new StringPermutation();
		
		List<String> result = obj.input_permutation("This is sample string.");
		for (String str: result) {
			System.out.println(str);
		}
	}
	public List<String> input_permutation(String input){

		String[] str_arr = input.split("\\s");

		List<String> result= permute(str_arr, 0, str_arr.length-1);
		
		return result;
	}

	/** 
     * permutation function 
     * @param str string to calculate permutation for 
     * @param l starting index 
     * @param r end index 
     */
    private List<String> permute(String[] str_arr, int l, int r) 
    { 
        if (l == r) {
        	StringBuffer sb = new StringBuffer();
            for (String str: str_arr) {
            	sb.append(str+" ");
            }
            perm_list.add(sb.toString());
            
            return perm_list;
        }
        else
        { 
            for (int i = l; i <= r; i++) 
            { 
            	str_arr = swap(str_arr,l,i);
                permute(str_arr, l+1, r); 
                str_arr = swap(str_arr,l,i); 
            } 
        }
		return perm_list;
        
    }

	/**
	 * Swap Characters at position
	 * 
	 * @param a string value
	 * @param i position 1
	 * @param j position 2
	 * @return swapped string
	 */
	public String[] swap(String[] arr, int i, int j) {
		
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

		return arr;
	}

}
