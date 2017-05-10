package com.ve88.day18;

import java.util.HashMap;

import com.ve88.ceshi.Student;

public class Demo1_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> m1 =new HashMap<>();
		m1.put(new Student("悟空",1000), "花果山");
		m1.put(new Student("唐僧",200), "大唐");
		m1.put(new Student("猪八戒",700), "高老庄");
		m1.put(new Student("沙僧",500), "流沙河");
		
		HashMap<Student,String> m2 = new HashMap<>();
		m2.put(new Student("张三",23), "上海");
		m2.put(new Student("李四",24), "上海 浦东");
		m2.put(new Student("张三",23), "上海");
		m2.put(new Student("张三",23), "上海");
	}

}
