package com.ve88.ceshi;

import java.util.Scanner;

public class Test2_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("�������һ������");
		int i = sc.nextInt();
		System.out.println("������ڶ�������");
		int j = sc.nextInt();
		//demo2(i);
		//demo(i, j);
	}

	public static void demo2(int i) {
		if (i%2==0) {											//�ж�i��ż��
			System.out.println("i��ż��");
		} else {
			System.out.println("i������");
		}
	}

	public static void demo(int i, int j) {
		if (i>j) {
			System.out.println("i = " + i);			//��ȡ��ֵ
		} else {
			System.out.println("j = " +j);
		}
	}

}
