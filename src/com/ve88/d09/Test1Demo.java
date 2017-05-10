package com.ve88.d09;

public class Test1Demo {
	public static void main(String[] args) {
		Fu f = new Son();
		f.method();
		f.show();
	}
	
	}

class Fu {
	public void show() {
		System.out.println("fu show");
	}

	public void method() {
		// TODO Auto-generated method stub
		
	}
}

class Son extends Fu {
	public void show() {
		System.out.println("zi show");
	}

	public void method() {
		System.out.println("zi method");
	}
}

