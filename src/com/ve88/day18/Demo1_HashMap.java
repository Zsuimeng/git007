package com.ve88.day18;

import java.util.HashMap;

import com.ve88.ceshi.Student;

public class Demo1_HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Student,String> m1 =new HashMap<>();
		m1.put(new Student("���",1000), "����ɽ");
		m1.put(new Student("��ɮ",200), "����");
		m1.put(new Student("��˽�",700), "����ׯ");
		m1.put(new Student("ɳɮ",500), "��ɳ��");
		
		HashMap<Student,String> m2 = new HashMap<>();
		m2.put(new Student("����",23), "�Ϻ�");
		m2.put(new Student("����",24), "�Ϻ� �ֶ�");
		m2.put(new Student("����",23), "�Ϻ�");
		m2.put(new Student("����",23), "�Ϻ�");
	}

}
