package com.ve88.ceshi;

public class Test11_Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		meodth(new Cat());
		System.out.println("-----------------------");
		meodth(new Dog());
		Animal c = new Dog();
		Dog d = (Dog)c;
		d.LookHome();
		System.out.println("-----------------------");
		neodth(new JumpCat());
		meodth(new JumpCat());
		System.out.println("-----------------------");
		neodth(new JumpDog());
		meodth(new JumpDog());
		Animal b= new JumpDog();
		Dog t = (Dog)b;
		t.LookHome();
		
	}
	public static void neodth(Jump j){
		j.jump();
	}
	public static void meodth(Animal a){
		a.eat();
		a.sleep();
	}
}
