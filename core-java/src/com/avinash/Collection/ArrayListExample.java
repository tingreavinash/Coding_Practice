package com.avinash.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String args[]) {
		
		List<String> arr = new ArrayList<String>(Arrays.asList(new String[] {"Avinash","Kapil", "Atul"}));
		System.out.println(arr);
		
		Collections.sort(arr);
		System.out.println(arr);
		
		String a = new String("avinash");
		StringBuffer sb = new StringBuffer("avinash");
		StringBuilder sb1 = new StringBuilder("avinash");
	}
}
