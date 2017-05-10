package com.ve88.ceshi;

import java.util.Scanner;

public class Test1_Int {
	public static void main(String[] args){
		/*int i,b,f,e,h;   //一条语句可以定义几个变量
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
		Scanner sc = new Scanner(System.in);			//比较两个数是否相等 获取三个数的最大值
		System.out.println("请输入第一个整数");
		int s1 = sc.nextInt();
		System.out.println("请输入第二个整数");
		int s2=sc.nextInt();
		System.out.println("请输入第三个整数");
		int s3=sc.nextInt();
		
		boolean k= s1==s2?true:false;			//比较两个数是否相等
		System.out.println(k);		
		
		int i =s1>s2?s1:s2;
		int j =i>s3?i:s3;
		System.out.println(j);							//获取最大值
	}

	public static void demo7() {
		Scanner sc = new Scanner(System.in);			//键盘录入求两个数的和 和最大值
		System.out.println("请输入第一个整数");
		int s1 = sc.nextInt();
		System.out.println("请输入第二个整数");
		int s2 = sc.nextInt();
		int add =s1+s2;
		System.out.println("s1"+"+"+"s2 =" + add);
		int max =s1>s2?s1:s2;
		System.out.println("最大值 : " + max);
	}

	public static void demo6() {
		int i =2<<2;
		System.out.println(i);
		
		int x=10;					//一个数据对另一个数据异或两次，该数据本身不变
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
