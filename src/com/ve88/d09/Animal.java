package com.ve88.d09;

public abstract class Animal {
			private String name;
			private int age;
			public Animal() {
				super();
				
			}
			public Animal(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			
			abstract void eat();
}

		class Cat extends Animal{
			
			public Cat() {
				super();
				
			}
			
			public Cat(String name, int age) {
				super(name, age);	
			}
			
			

			@Override
			void eat() {
				System.out.println("√®≥‘”„");
				
			}
			
			  void catchMouse(){
				System.out.println("◊•¿œ Û");
			}
			
			
		}
		
		class Dog extends Animal{

			public Dog() {
				super();
				
			}

			public Dog(String name, int age) {
				super(name, age);
				
			}

			@Override
			void eat() {
				System.out.println("π∑≥‘»‚");
				
			}
			
			void lookHome(){
				System.out.println("ø¥º“");
			}
			
		}
