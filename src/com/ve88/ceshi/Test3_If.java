package com.ve88.ceshi;

import java.util.Scanner;

public class Test3_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//deno1();
		//demo2();
	}

	public static void demo2() {
		Scanner sc =new Scanner(System.in);   //����ֵ
		System.out.println("������x��ֵ");
		double x =sc.nextDouble();
		int y;
		if (x>=3) {
			System.out.println("y = "+2 * x + 1);
		} else if (x>-1&&3<x) {
			System.out.println("y = " + 2*x);
		} else if(x<=-1){
			System.out.println("y = " + (2*x-1));
		} else{
			System.out.println("���������������������");
		}
	}

	public static void deno1() {
		Scanner sc =new Scanner(System.in);
		System.out.println("������ɼ� 0~100֮��"); //����¼��ɼ� �������Ӧ�ĵȼ�
		double i =sc.nextDouble();
		if (i>=90&&i<=100) {
			System.out.println("��");
		} else if(i>=80&&i<=89){
			System.out.println("��");
		} else if (i>=70&&i<=79) {
			System.out.println("��");
		} else if (i>=60&&i<=69) {
			System.out.println("��");	
		} else if (i>=0&&i<=59) {
			System.out.println("��");	
		} else {
			System.out.println("���������������������");
		}
	}

}
