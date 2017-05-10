package com.ve88.factory;

public class Test {

	public static void main(String[] args){
		CatFactory df = new CatFactory();
		Cat c =(Cat) df.cearteFactory();
		c.eat();
	}
}
