package com.ve88.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.ve88.ceshi.Student;

public class Demo5_Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		Collection c = new ArrayList();
		c.add(new Student("张三",23));
		c.add(new Student("李四",24));
		c.add(new Student("王五",25));
		c.add(new Student("赵六",26));
		
		Iterator it =c.iterator();
		while(it.hasNext()){
			Student s = (Student)it.next();
			System.out.println(s.getName()+"---"+s.getAge());
		}
		
	}

	public static void demo1() {
		Collection c = new ArrayList();
		c.add("a");
		c.add("b");
		c.add("c");
		c.add("d");
		
		//对集合中的元素迭代
		Iterator it =c.iterator();
		while (it.hasNext()) {
			System.out.print(it.next()+" ");
			
		}
	}

}
