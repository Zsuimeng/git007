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
		System.out.println("�������·�");							//	if���ʵ�������Ӧ���·������Ӧ����
		int month = sc.nextInt();
		if (month>12||month<1) {
			System.out.println("���������������������");
		}else if (month>=3&&month<=5) {
			System.out.println(month +"���Ǵ���");
		}else if (month>=6&&month<=8) {
			System.out.println(month +"�����ļ�");
		}else if (month>=9&&month<=11) {
			System.out.println(month +"�����＾");
		} else {
			System.out.println(month +"���Ƕ���");
		}
	}

	public static void demo4() {
		Scanner sc =new Scanner(System.in);
		System.out.println("�������·�");						//switch�����·ݶ�Ӧ����
		int month = sc.nextInt();
		switch (month) {
		case  3:
		case  4:
		case  5:
			System.out.println(month +"���Ǵ���");
			break;
		case  6:
		case  7:
		case  8:
			System.out.println(month +"�����ļ�");
			break;
		case  9:
		case  10:
		case  11:
			System.out.println(month +"�����＾");
			break;
		case  12:
		case  1:
		case  2:
			System.out.println(month +"���Ƕ���");
			break;

		default:
			System.out.println("���������������������");
			break;
		}
	}

	public static void demo2() {
		int x= 2;
		int y = 3;
		switch (x) {
		default:
			y++;
//			break;					//�����д����Ż�������break�ͻ�����
		case 3:
			y++;
		case 4:
			y++;
		}
		System.out.println("y = " + y);
	}

	public static void demo1() {
		/**��������
		 * �жϼ�����������ֶ�Ӧ�����ڣ�switch
		 * */
		Scanner sc =new Scanner(System.in);
		System.out.println("������һ��1��7֮�������");
		int week = sc.nextInt();
		switch (week) {
		case 1:
			System.out.println("��������һ");
			break;
		case 2:
			System.out.println("�������ڶ�");
			break;
		case 3:
			System.out.println("����������");
			break;
		case 4:
			System.out.println("����������");
			break;
		case 5:
			System.out.println("����������");
			break;
		case 6:
			System.out.println("����������");
			break;
		case 7:
			System.out.println("����������");
			break;
		default:
			System.out.println("���������������������");
			break;
		}
	}

}
