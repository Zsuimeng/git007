package com.ve88.ceshi;

public class Test9_Number {
	private int a ;
	private int b;
		public Test9_Number(){
			//�ղι���
		}
		
		public Test9_Number(int a,int b){
			this.a=a;
			this.b=b;
		}
		
		public void setA(int a){
			this.a=a;
		}
		
		public int getA(){
			return a;
		}
		
		public void setB(int b){
			this.b=b;
		}
		
		public int getB(){
			return b;
		}
		
		public void perimeter (){
			int p = (a +b)*2;
			System.out.println("�ܳ��ǣ� " + p);
		}
		
		public  void measure(){
			int m = a*b;
			System.out.println("����� ��"+m);
		}
}
