package com.ve88.d09;

public class Test1_Animal {

	public static void main(String[] args) {
		/*Animal a = new Cat("¼Ó·Æ",23);
		System.out.println(a.getName()+"----"+a.getAge());
		a.eat();
		
		Cat c = (Cat)a;
		c.catchMouse();*/
		Test1_Animal.mecthod(new Cat("¼Ó·Æ",23));
		Test1_Animal.mecthod(new Dog("haba",3));
		Animal a = new Cat();
		Cat c= (Cat)a;
		System.out.print(c.getName()+"");
		c.catchMouse();
		
	}
	public static void mecthod(Animal a){
		System.out.println(a.getName()+"----------"+a.getAge());
		a.eat();
	}

}
