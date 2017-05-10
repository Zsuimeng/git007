package com.ve88.ceshi;

public class Test7_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		int a = 10;
		int b =20;
		System.out.println("a: " + a +", b= " + b);
		change(a,b);
		System.out.println("a " + a +", b= " + b);
		
		int[] arr={1,2,3,4,5};
		change(arr);
		System.out.println(arr[1]);
	}

	private static void change(int[] arr) {
		// TODO Auto-generated method stub
		for (int x = 0; x < arr.length; x++) {
			if (arr[x]%2==0) {
				arr[x]*=2;
			}
		}
	}

	private static void change(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("a:"+a+",b:"+b);
		a=b;
		b=a+b;
		System.out.println("a:"+a+",b"+b);
	}

	public static void demo1() {
		//数组获取最大值
		int[] arr ={52,30,45,80,2,6};
		//int[] arr1 = new int[]{52,30,45,80,2,6};
		for (int i = 0; i < arr.length; i++) {
			int max =arr[0];
			if (max<arr[i]) {
				max=arr[i];
				System.out.println(max);
			}
		}
	}

}
