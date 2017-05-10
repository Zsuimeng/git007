package com.ve88.day19;

import java.io.File;
import java.io.IOException;

public class Demo3_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f =new File("G:\\教程\\2016年最新Java教程（27天完整版）video\\day19\\video\\19.10_异常(finally关键字的面试题).avi");
				System.out.println(f.exists());
				
				File f1 =new File("I:\\新建文件夹\\xxx.txt");
				System.out.println(f1.createNewFile());
				
				File f2 =new File("I:\\新建文件夹\\sjd");
				System.out.println(f2.mkdir());
				
				File f3 =new File("I:\\新建文件夹\\dsi\\ijdf\\llo\\dkkod\\dko");
				System.out.println(f3.mkdirs());
	}

}
