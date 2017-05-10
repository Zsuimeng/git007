package com.ve88.ceshi;

public class Test5_For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		//demo3();
		//demo4();
		demo5();
		
	}

	public static void demo5() {
		//输出所有的水仙花数
		int j=0;
		for (int i = 100; i <1000; i++) {
			int bai = i/100;
			int shi =i/10%10;
			int ge = i%10;
			if(i==bai*bai*bai+shi*shi*shi+ge*ge*ge){
				System.out.println(i);
				j++;
			}
		}
		System.out.println(j);
	}

	public static void demo4() {
		int sum = 0;											//求1到100之间的奇数和
		for (int i = 0; i <=100; i++) {
			if (i%2!=0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

	public static void demo3() {
		int sum = 0;											//求1到100之间 的偶数和
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

	public static void demo2() {
		int sum =0;														//1到10之间的和
		for (int i = 0; i <=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

	public static void demo1() {
		for (int i = 0; i < 10; i++) {								//输出10次HelloWorld
			System.out.println("HelloWorld");
		}
	}

}
