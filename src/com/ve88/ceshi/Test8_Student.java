package com.ve88.ceshi;

public class Test8_Student {
		 String brand;
		 double price;
		public Test8_Student() {
			super();
			
		}
		public Test8_Student(String brand, double price) {
			super();
			this.brand = brand;
			this.price = price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand = brand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		 public void call(){
			 System.out.println("��绰");
		 }
		 
		 public void sendMessage(){
			 System.out.println("������");
		 }
		 
		 public void palyGame(){
			 System.out.println("����Ϸ");
		 }
}
