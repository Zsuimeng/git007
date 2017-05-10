package com.ve88.ceshi;

import java.util.Scanner;

public class Ces1_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//demo1();
		//demo2();
		//demo3();
		//demo4();
		
			/*while (true) {
				int  i = sc.nextInt();
				if (sc.hasNext() ) {
					String j =sc.next();
					if (j.equals("=")) {
						System.out.println(i);
						break;
					}
				} else  if(sc.hasNext()){
					String k =sc.next();
					if(k.equals("+"));
				}
				
			}*/
	}

	public static void demo4() {
		char[] arr1 ={'里','1','a','b'};
		String s1 = new String(arr1,0,4);
		System.out.println(s1);
	}

	public static void demo3() {
		char[] arr1 = {'a','c','你','k'};
		String s1 = new String(arr1);
		System.out.println(arr1);
	}

	public static void demo2() {
		byte[] arry1 = {97,98,99,100};
		String s1 = new String(arry1, 0, 4);			//包含头不包含尾
			System.out.println(s1);
	}

	public static void demo1() {
		Scanner sc =new Scanner(System.in);
		byte[] arr1 = {25,2,35,63,52};
		String s1 =new String(arr1);
		System.out.println(s1);
	}

}
