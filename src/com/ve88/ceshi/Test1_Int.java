package com.ve88.ceshi;

import java.util.Scanner;

public class Test1_Int {
	public static void main(String[] args){
		/*int i,b,f,e,h;   //һ�������Զ��弸������
*/		
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
		//demo7();
		//demo8();
		
	}

	public static void demo8() {
		Scanner sc = new Scanner(System.in);			//�Ƚ��������Ƿ���� ��ȡ�����������ֵ
		System.out.println("�������һ������");
		int s1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int s2=sc.nextInt();
		System.out.println("���������������");
		int s3=sc.nextInt();
		
		boolean k= s1==s2?true:false;			//�Ƚ��������Ƿ����
		System.out.println(k);		
		
		int i =s1>s2?s1:s2;
		int j =i>s3?i:s3;
		System.out.println(j);							//��ȡ���ֵ
	}

	public static void demo7() {
		Scanner sc = new Scanner(System.in);			//����¼�����������ĺ� �����ֵ
		System.out.println("�������һ������");
		int s1 = sc.nextInt();
		System.out.println("������ڶ�������");
		int s2 = sc.nextInt();
		int add =s1+s2;
		System.out.println("s1"+"+"+"s2 =" + add);
		int max =s1>s2?s1:s2;
		System.out.println("���ֵ : " + max);
	}

	public static void demo6() {
		int i =2<<2;
		System.out.println(i);
		
		int x=10;					//һ�����ݶ���һ������������Σ������ݱ�����
		int y =20;
		
		x = x^y;					//x=10^20
		y = x^y;					//y=10^20^20
		x = x^y;					//x=10^20^10
		
		System.out.println("x="+x);
		System.out.println("y=" +y);
	}

	public static void demo5() {
		int a=20;
		int b=30;
		boolean z = a==b?true:false;
		System.out.println(z);
		
		int x = 40;
		int y = 70;
		int i =90;
		int k =x>y?x:y;
		int m=k>i?k:i;
		System.out.println(m);
	}

	public static void demo4() {
		byte b=10;
		b++;
		b=(byte) (b+1);
	}

	public static void demo3() {
		int x= 4;
		int y =(x++);
		System.out.println(y);
		int z =y+(++x);
		System.out.println(z);
	}

	public static void demo2() {
		int a =10;
		int b=10;
		int c= 10;
		
		a=b++;
		c=--a;
		b=++a;
		a=c--;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

	public static void demo1() {
		int b;
		int j=20;
		byte z = 50;
		b =(byte)(20+50);
		
		System.out.println(b);
	}
}
