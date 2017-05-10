package com.ve88.ceshi;

import java.util.Scanner;

public class Test3_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deno1();
		//demo2();
	}

	public static void demo2() {
		Scanner sc =new Scanner(System.in);   //计算值
		System.out.println("请输入x的值");
		double x =sc.nextDouble();
		int y;
		if (x>=3) {
			System.out.println("y = "+2 * x + 1);
		} else if (x>-1&&3<x) {
			System.out.println("y = " + 2*x);
		} else if(x<=-1){
			System.out.println("y = " + (2*x-1));
		} else{
			System.out.println("您输入的有误请重新输入");
		}
	}

	public static void deno1() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入成绩 0~100之间"); //键盘录入成绩 并输出对应的等级
		double i =sc.nextDouble();
		if (i>=90&&i<=100) {
			System.out.println("优");
		} else if(i>=80&&i<=89){
			System.out.println("良");
		} else if (i>=70&&i<=79) {
			System.out.println("中");
		} else if (i>=60&&i<=69) {
			System.out.println("及");	
		} else if (i>=0&&i<=59) {
			System.out.println("差");	
		} else {
			System.out.println("您输入的有误，请重新输入");
		}
	}

}
