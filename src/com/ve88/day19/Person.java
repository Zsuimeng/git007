package com.ve88.day19;

public class Person {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Student p =new Student();
		p.setAge(-17);
		System.out.println(p.getAge());
	}

}

class Student{
	
	private String name;
	private int age;
	
	public Student(){
		
	}
	
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name=name;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age) throws Exception{
		if (age >0&&age<100) {
			this.age=age;
		} else {
			//throw new Exception("年龄非法");
			throw new AgeOfBoundsException("年龄非法");
		}
	}
	
	
}
