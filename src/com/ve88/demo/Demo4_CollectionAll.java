package com.ve88.demo;

import java.util.ArrayList;
import java.util.Collection;

public class Demo4_CollectionAll {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//demo1();
		  //demo2();
		//demo3();
		demo4();
		
	}

	public static void demo4() {
		Collection c1 = new ArrayList();
		c1.add(" a");
		c1.add(" b");
		c1.add(" c");
		c1.add(" d");
		Collection c2 =new ArrayList();
		c2.add(" a");
//		c2.add(" b");
		c2.add(" c");
		c2.add(" d");
		boolean b =c1.retainAll(c2);
		System.out.println(b);
		System.out.println(c1);
	}

	public static void demo3() {
		Collection c1= new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 =new ArrayList();
		c2.add("b");
		c2.add("c");
		c2.add("c");
		boolean b =c1.containsAll(c2);
		System.out.println(b);
	}

	public static void demo2() {
		Collection c1= new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		c1.add("e");
		
		Collection c2 = new ArrayList();
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("e");
		c2.add("r");
		
		c1.removeAll(c2);									//ɾ������ û�еĻ�����false
		//c1.clear();
		System.out.println(c1);
	}

	public static void demo1() {
		Collection c1 =new ArrayList();
		c1.add("a");
		c1.add("b");
		c1.add("c");
		c1.add("d");
		
		Collection c2 =new ArrayList();			//alt+shift+r����
		c2.add("a");
		c2.add("b");
		c2.add("c");
		c2.add("d");
		//c1.addAll(c2);
		c1.add(c2);				//��c2����һ��������ӵ�c1��
		System.out.println(c1);
	}

}
