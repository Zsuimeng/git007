package com.ve88.ceshi;

public class Demo10 {

	public static void main(String[] args) {
		Student s1 =new Student("张三",23);
		Student s2 =new Student("张三",23);
		boolean b1 =s1.equals(s2);
		System.out.println(b1);

	}

}
