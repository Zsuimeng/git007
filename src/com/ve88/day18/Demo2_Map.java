package com.ve88.day18;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo2_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Map<String,Integer> m= new HashMap<>();
			m.put("�Ϻ�",23);
			m.put("����",24);
			m.put("����", 26);
			m.put("�½�", 25);
			/*Set<String> keySet=m.keySet();
			Iterator<String> it =keySet.iterator();
			while (it.hasNext()) {
				String key =it.next();
				System.out.println(key+"="+m.get(key));
				
			}*/
			for (String key:m.keySet()) {
				System.out.println(key+"="+m.get(key));
			}
	}

}
