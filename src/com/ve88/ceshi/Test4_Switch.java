package com.ve88.ceshi;

import java.util.Scanner;

public class Test4_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		//demo4();
		//demo5();
	}

	public static void demo5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入月份");							//	if语句实现输入对应的月份输出对应季节
		int month = sc.nextInt();
		if (month>12||month<1) {
			System.out.println("您输入的有误请重新输入");
		}else if (month>=3&&month<=5) {
			System.out.println(month +"月是春季");
		}else if (month>=6&&month<=8) {
			System.out.println(month +"月是夏季");
		}else if (month>=9&&month<=11) {
			System.out.println(month +"月是秋季");
		} else {
			System.out.println(month +"月是冬季");
		}
	}

	public static void demo4() {
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入月份");						//switch输入月份对应季节
		int month = sc.nextInt();
		switch (month) {
		case  3:
		case  4:
		case  5:
			System.out.println(month +"月是春季");
			break;
		case  6:
		case  7:
		case  8:
			System.out.println(month +"月是夏季");
			break;
		case  9:
		case  10:
		case  11:
			System.out.println(month +"月是秋季");
			break;
		case  12:
		case  1:
		case  2:
			System.out.println(month +"月是冬季");
			break;

		default:
			System.out.println("您输入的有误请重新输入");
			break;
		}
	}

	public static void demo2() {
		int x= 2;
		int y = 3;
		switch (x) {
		default:
			y++;
//			break;					//遇到有大括号或者遇到break就会跳出
		case 3:
			y++;
		case 4:
			y++;
		}
		System.out.println("y = " + y);
	}

	public static void demo1() {
		/**键盘输入
		 * 判断键盘输入的数字对应的星期，switch
		 * */
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入一个1到7之间的整数");
		int week = sc.nextInt();
		switch (week) {
		case 1:
			System.out.println("今天星期一");
			break;
		case 2:
			System.out.println("今天星期二");
			break;
		case 3:
			System.out.println("今天星期三");
			break;
		case 4:
			System.out.println("今天星期四");
			break;
		case 5:
			System.out.println("今天星期五");
			break;
		case 6:
			System.out.println("今天星期六");
			break;
		case 7:
			System.out.println("今天星期日");
			break;
		default:
			System.out.println("您输入的有误请重新输入");
			break;
		}
	}

}
