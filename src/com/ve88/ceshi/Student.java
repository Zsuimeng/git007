package com.ve88.ceshi;

public class Student {
		private String name;
		private int age;
		void Student(){
			
		}
		
		public Student(String name,int age){
			this.name=name;
			this.age=age;
		}
		
		public	String getName(){
			return name;
		}
		
		public	void setName(String name){
			this.name=name;
		}
		
		public	int getAge(){
			return age;
		}
		
		public void GetAge(int age){
			this.age=age;
		}

		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}

		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			Student s =(Student)obj;
			return this.name.equals(s.name) && this.age ==s.age ;
		}
		
		
}
