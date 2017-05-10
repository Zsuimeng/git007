package com.ve88.day19;

public class Demo1_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d =new Demo();
		try{
			int x =d.div(20, 0);
			System.out.println(x);
		} catch(Exception a){
			System.out.println(a.getMessage());
		}
	}

}

	class Demo{
		public int div(int a ,int b){
			return a/b;
		}
	}