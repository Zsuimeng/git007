package com.ve88.stringbuffer;

public class Demo1_StringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//demo1();
		StringBuffer s1=new StringBuffer();
		s1.append("agagagadfsa");
		System.out.println(s1.replace(0, 3,"ninhao"));
		System.out.println(s1.reverse());
	}

	public static void demo1() {
		StringBuffer s = new StringBuffer("5224");
		System.out.println(new StringBuffer("ÅªºÃl"));
		s.append("helloworld");
		s.append(541);
		s.insert(11,"kkbo");
		s.insert(0,"ssss");
		System.out.println(s);
		s.delete(0, 1);
		System.err.println(s);
		s.deleteCharAt(3);
		System.out.println(s);
	}

}
