package io.github.tingreavinash.Problems.InterviewProblems;

import java.util.*;

public class HashMapvsList {

	public static void main(String[] args) {
		Map<String, String> map_one = new HashMap<String, String>();
		
		List<String> list_one = new ArrayList<String>();
		
		map_one.put("val_1", "avinash");
		map_one.put("val_2", "atul");
		map_one.put("val_4", "kapil");
		map_one.put("val_5", "aaryan");
		map_one.put("val_6", "piyush");
		map_one.put("val_7", "naksh");
		
		list_one.add("avinash");
		list_one.add("naksh");
		list_one.add("piyush");
		
		System.out.println(map_one);
		System.out.println(list_one);
		
		if(map_one.keySet().size() != list_one.size()) {
			
			Iterator itr = map_one.entrySet().iterator();
			
			while(itr.hasNext()) {
				Map.Entry element = (Map.Entry) itr.next();
				String val = (String) element.getValue();
				String key = (String) element.getKey();
				if(!list_one.contains(val)) System.out.println(val+" -- "+key);
			}
			
			for (String s : list_one) {
				if (!map_one.containsValue(s)) {
					System.out.println("List value: "+s);
				}
			}
			
		}
	}
}
