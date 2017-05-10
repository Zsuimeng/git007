package com.ve88.ceshi;



abstract class Test10_Pesorn {
			String name;
			int age;
			public Test10_Pesorn() {
				super();
				
			}
			public Test10_Pesorn(String name, int age) {
				super();
				this.name = name;
				this.age = age;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public abstract void teach();
}

 class JCTeacher extends Test10_Pesorn{
	 public JCTeacher() {
		super();
		
	}

	public JCTeacher(String name, int age) {
		super(name, age);
		
	}
	@Override
	public void teach() {
		System.out.println("»ù´¡¿Î");
		
	}
 }
 
 class JYTeacher extends Test10_Pesorn{

	public JYTeacher() {
		super();
		
	}

	public JYTeacher(String name, int age) {
		super(name, age);
		
	}
	 
	public void teach() {
		System.out.println("¾ÍÒµ¿Î");
		
	}
 }
