package com.ve88.ceshi;

import java.util.Scanner;

public class Test2_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入第一个整数");
		int i = sc.nextInt();
		System.out.println("请输入第二个整数");
		int j = sc.nextInt();
		//demo2(i);
		//demo(i, j);
	}

	public static void demo2(int i) {
		if (i%2==0) {											//判断i奇偶性
			System.out.println("i是偶数");
		} else {
			System.out.println("i是奇数");
		}
	}

	public static void demo(int i, int j) {
		if (i>j) {
			System.out.println("i = " + i);			//获取最值
		} else {
			System.out.println("j = " +j);
		}
	}

}
