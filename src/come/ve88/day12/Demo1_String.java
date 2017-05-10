package come.ve88.day12;

public class Demo1_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//demo1();
		//demo2();
		//demo3();
		//demo4();
		//demo5();
		//demo6();
	}

	public static void demo6() {
		String s1 = "helloworld";
		String s2=s1.substring(3,7);
		System.out.println(s2);
	}

	public static void demo5() {
		String s2 ="helloworld";
		int i =s2.indexOf("l", 4);
		System.out.println(i);
	}

	public static void demo4() {
		String s1 ="helloworlad";
		int i =s1.indexOf(97);
		System.out.println(i);
	}

	public static void demo3() {
		String s1="helloworld";
		int i =s1.indexOf("o");
		System.out.println(i);
		System.out.println(s1.indexOf("l"));
	}

	public static void demo2() {
		String s1 ="helloworld";
		char a =s1.charAt(5);
		System.out.println(a);
		System.out.println(s1.charAt(7));
	}

	public static void demo1() {
		String s1= "helloworld";
		int l=s1.length();
		System.out.println(l);
	}

}
