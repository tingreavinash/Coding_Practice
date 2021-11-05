package io.github.tingreavinash.java_concepts.Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		
		Map<Integer, String> records = new HashMap<Integer, String>();
		records.put(1, "Avinash");
		records.put(9, "Rockstar");
		records.put(4, "Ganesh");
		records.put(2, "Atul");
		
		Map<Integer, String> sortedRecords = new TreeMap<>(records);
		System.out.println(sortedRecords);
		
		System.out.println(records);
		
		
	}

}
