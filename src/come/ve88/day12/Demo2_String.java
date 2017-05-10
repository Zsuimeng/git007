package come.ve88.day12;

public class Demo2_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			//demo1();
		String s1 = "ABCDEabcde123456!@#$%^";
		int i1=0;
		int i2=0;
		int i3=0;
		int i4=0;
		for (int i = 0; i <s1.length(); i++) {
			char c1 =s1.charAt(i);
			if (c1>='A' && c1<='Z') {
				i1++;
			} else if (c1>='a' && c1<='z') {
				i2++;
			} else if (c1>='0' && c1<='9') {
				i3++;
			} else{
				i4++;
			}
		}
		System.out.println("大写的字符有"+i1+"小写的字符有"+i2 +"数字有"+i3+"其他字符有"+i4);
	}

	public static void demo1() {
		String s1 ="Helloworld";
		for (int i = 0; i <s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
	}

}
