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
		//������е�ˮ�ɻ���
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
		int sum = 0;											//��1��100֮���������
		for (int i = 0; i <=100; i++) {
			if (i%2!=0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

	public static void demo3() {
		int sum = 0;											//��1��100֮�� ��ż����
		for (int i = 0; i <=100; i++) {
			if (i%2==0) {
				sum +=i;
			}
		}
		System.out.println(sum);
	}

	public static void demo2() {
		int sum =0;														//1��10֮��ĺ�
		for (int i = 0; i <=10; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

	public static void demo1() {
		for (int i = 0; i < 10; i++) {								//���10��HelloWorld
			System.out.println("HelloWorld");
		}
	}

}
