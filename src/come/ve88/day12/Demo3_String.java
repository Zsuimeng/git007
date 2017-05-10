package come.ve88.day12;

public class Demo3_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo1();
		//demo2();
		
	}

	public static void demo2() {
		String s1="nihaoÄãºÃ";
		char[] c =s1.toCharArray();
		for (int i = 0; i < s1.length(); i++) {
			System.out.print(c[i] + "  ");
		}
	}

	public static void demo1() {
		String s1= "abcdÙ¯ºÃ";
		byte[] b1= s1.getBytes();
		for (int i = 0; i < b1.length; i++) {
			System.out.println(b1[i]);
		}
	}

}
