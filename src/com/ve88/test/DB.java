package com.ve88.test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {
	
	   
	
	public void init(){
	
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE",
					"hr","123456");
			
			System.out.println("连接成功");	
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	
	
	}
	
	public static void main(String[] args){
		DB db =new DB();
		db.init();
	}
}

