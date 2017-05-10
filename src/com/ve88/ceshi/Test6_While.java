package com.ve88.ceshi;

public class Test6_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		// demo2();
		 //demo3();
		//demo4();
		//demo5();
		//demo6();
		//demo7();
		//deno7();
		//demo8();
		
	}

	public static void demo8() {
		for (int i =1; i <=10; i++) {
			if (i%3==0) {
				System.out.println("123");
				//continue;
				//break;
			}
			System.out.println("123");
		}
	}

	public static void deno7() {
		for (int i = 1; i <=9; i++) {											//九九乘法表
			for (int j = 1; j <=i; j++) {
				System.out.print(i+ "*" + j + "=" + i*j+" ");
			}
			System.out.println();
		}
	}

	public static void demo7() {
		for (int i = 1; i < 7; i++) {									//输出倒三角形
			for (int j = 1; j <= 7-i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void demo6() {
		for (int i = 1; i < 6; i++) {										//输出正三角形的星星
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void demo5() {
		for (int i = 1; i < 5; i++) {									//输出4行5列的星星
			for (int j = 1; j < 6; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static void demo4() {
		int i = 1;												//输出1到10
		do {
			System.out.println(i);
			i++;
		} while (i<=10);
	}

	public static void demo3() {
		int sum = 0;											//1到100的和
		int i= 0;
		while (i<=100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

	public static void demo2() {
		int j=0;														//水仙花数
		int i= 100;
		while (i<1000) {
			int ge = i%10;
			int shi =i/10%10;
			int bai =i/100;
			if (i==bai*bai*bai+shi*shi*shi+ge*ge*ge) {
				System.out.println(i);
				j++;
			}
			i++;
		}
		System.out.println("1000以内的水仙花数是："+j+ "个");
	}

	public static void demo1() {
		int i = 0;																	//while 输出十次helloworld
		while (i<10) {			
			System.out.println("HelloWorld");
			i++;
		}
	}

}
