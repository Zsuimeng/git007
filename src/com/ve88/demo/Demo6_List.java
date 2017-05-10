package com.ve88.demo;

import java.util.ArrayList;
import java.util.List;

import com.ve88.ceshi.Student;

public class Demo6_List {

	public static void main(String[] args) {
		List l =new ArrayList();
		l.add(new Student("张三",23));
		l.add(new Student("李四",24));
		l.add(new Student("王五",25));
		l.add(new Student("赵六",26));
		
		for (int i = 0; i < l.size(); i++) {
			Student s = (Student)l.get(i);
			System.out.println(s.getName()+"---"+s.getAge());
//			System.out.println(l.get(i));
		}

	}

}
