
package com.ve88.demo;

import java.util.ArrayList;
import java.util.Collection;

import com.ve88.ceshi.Student;

public class Demo3_ToArray {

	public static void main(String[] args) {
		Collection c= new ArrayList();
		c.add(new Student("张三", 23));
		c.add(new Student("李四", 24));
		c.add(new Student("王五", 25));
		c.add(new Student("赵六", 26));
		
		Object[] arr =c.toArray();
		for (int i = 0; i < arr.length; i++) {
			Student s =(Student)arr[i];
			System.out.println(s.getName()+"----"+s.getAge());
		}
	}

}
