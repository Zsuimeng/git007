package com.ve88.day19;

import java.io.File;
import java.io.IOException;

public class Demo3_File {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			File f =new File("G:\\�̳�\\2016������Java�̳̣�27�������棩video\\day19\\video\\19.10_�쳣(finally�ؼ��ֵ�������).avi");
				System.out.println(f.exists());
				
				File f1 =new File("I:\\�½��ļ���\\xxx.txt");
				System.out.println(f1.createNewFile());
				
				File f2 =new File("I:\\�½��ļ���\\sjd");
				System.out.println(f2.mkdir());
				
				File f3 =new File("I:\\�½��ļ���\\dsi\\ijdf\\llo\\dkkod\\dko");
				System.out.println(f3.mkdirs());
	}

}
