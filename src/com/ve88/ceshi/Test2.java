package com.ve88.ceshi;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("�����볤");
		int a =sc.nextInt();
		System.out.println("�������");
		int b =sc.nextInt();
		
		Test9_Number  t =new Test9_Number();
		t.setA(a);
		t.setB(b);
		t.measure();
		t.perimeter();
	}

}
