package com.avinash.InterviewProblems;

public class StringProblems {

	static public void main(String... a) {

		String str = "Hello";
		StringBuffer buffer = new StringBuffer("Hello");
		StringBuilder builder = new StringBuilder("Hello");

		str.concat(" Avinash"); // IMMUTABLE
		buffer.append(" Avinash"); // MUTABLE
		builder.append(" Avinash"); // MUTABLE
		
		String str2 = str.concat(" Avinash");
		
		System.out.println("String1: "+str);
		System.out.println("String2: "+str2);
		System.out.println("StringBuffer: "+buffer);
		System.out.println("StringBuilder: "+builder);
		System.out.println("-----");
		
		
		System.out.println("== vs equals()");
		String s1 = "avinash";
		String s2 = "avinash";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String s3 = new String ("avinash");
		String s4 = new String("avinash");

		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));
		
		
		// Hashcode example
		
		String test1 = "Avinash";
		int test1_hash = test1.hashCode();
		
		String test2 = new String("avinash");
		int test2_hash = test2.hashCode();
		
		int index = test2.indexOf("n");
		System.out.println("index of n: "+index);
		
		if(test1_hash == test2_hash)
			System.out.println("Hashcode matched");
		else
			System.out.println("Hashcode different");
		
		System.out.println("-----");
		
		// Create string from char array
		char[] char_arr = {'a', 't', 'u', 'l'};
		String name = new String(char_arr);
		
		System.out.println(name);
		
		//--------------
		System.out.println("=============");
		
		String value = "Avinash";
		StringBuffer value2 = new StringBuffer ("Atul");
		processData(value2);
		System.out.println("Value = "+value2);
		
		
		// Performance of StringBuffer vs StringBuilder
		int N = 999999;
		long t;
		
		{
			StringBuffer sb = new StringBuffer();
			t = System.currentTimeMillis();
			
			for(int i = N; i-->0;) {
				sb.append("");
			}
			System.out.println("Time taken: "+ (System.currentTimeMillis() - t) + "ms");
		}
		
		{
			StringBuilder sb = new StringBuilder();
			t = System.currentTimeMillis();
			
			for(int i = N; i-->0;) {
				sb.append("");
			}

			System.out.println("Time taken: "+ (System.currentTimeMillis() - t) + "ms");
		}
		
		
		
	}
	
	public static void processData(StringBuffer value) {
		//value = value.concat(" Tingre");
		value.append(" Tingre");
	}

}
