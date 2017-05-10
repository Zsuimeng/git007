package com.ve88.ceshi;

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
		 public abstract void eat();
		public abstract void sleep();
}

	class Cat extends Animal{

		public Cat() {
			super();
			
		}

		public Cat(String name, int age) {
			super(name, age);
			
		}
		 public void eat(){
			 System.out.println("è�Է�");
		 }
		public  void sleep(){
				System.out.println("è˯��");
			}
	}
	
	class Dog extends Animal{

		public Dog() {
			super();
			
		}

		public Dog(String name, int age) {
			super(name, age);
			
		}
		 public void eat(){
			 System.out.println("���Է�");
		 }
		public  void sleep(){
				System.out.println("��˯��");
			}
		public void LookHome(){
			System.out.println("����");
		}
	}
	
	interface Jump{
		public abstract void jump();
	}
	
	class JumpCat extends Cat implements Jump{
		public void jump(){
			System.out.println("����è");
		}
	}
	
	class JumpDog extends Dog implements Jump {
		public void jump(){
			System.out.println("���߹�");
		}
	}
