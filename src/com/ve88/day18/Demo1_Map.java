package com.ve88.day18;

import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> m = new HashMap<>();
		m.put("123", 1);
		m.put("234", 2);
		m.put("345", 3);
		m.put("123", 6);
		/*System.out.println(m);
		m.clear();
		System.out.println(m);*/
		/*m.remove("234");
		System.out.println(m);*/
		/*m.remove("123", 1);
		System.out.println(m);*/
//		System.out.println(m.containsKey("123"));
//		System.out.println(m.containsValue(6));
//		m.clear();
		int s =m.size();
		System.out.println(s);
		System.out.println(m);
		System.out.println(m.isEmpty());
	}

}
