package com.kh.example.chap00_file.controller;

import java.io.File;
import java.io.IOException;

public class FileController {
	public void method1() {
		
		try {
			File f1 = new File("test.txt");
			f1.createNewFile(); // �길 �־ �Ǵµ� �� �ٱ��� �ظ��ϸ� ���� �־��ִ� �ɷ�
			
			File f2 = new File("c:/test/test.txt");
			f2.createNewFile(); 
			// C����̺꿡 test.txt ������ ����� �� �� ������ test ������ ������� �� ���� ���� �������� �ʱ⶧����
			// ������ ��θ� ã�� �� ���ٴ� ������ ����
			// C����̺꿡 test������ ������ָ� �ذ�
			
			File f3 = new File("c:\\temp3\\temp2");
			File f4 = new File("c:\\temp3\\temp2\\test.txt");
//			f4.createNewFile(); // C����̺꿡 temp3, �� �ȿ� temp2�� ���� ������ �̷��� �ٷ� �ϸ� ���� ���� ������ ��θ� ã�� �� ���ٴ� ������ �߻�
			f3.mkdirs(); //make directories? ������ ������ִ� ��
			f4.createNewFile();
			f4.delete();
			
			System.out.println(f2.exists()); // true : ������ �����Ѵ�
			System.out.println(f3.exists()); // true : ������ �����Ѵ�
			System.out.println(f3.isFile()); // false : f3�� ������ �ƴϴ�.
			
			// �� ���� �޼ҵ��
			System.out.println("���� �� : " + f1.getName());
			System.out.println("���� ���� ��� : " + f1.getAbsolutePath());
			System.out.println("���� ��� ��� : " + f1.getPath());
			// ���� ���� ��� : �������� ��� - ���� ���� �������� ��� �ֵ������� �ٲ��� �ʴ� ��ġ
			// ���� ��� ��� : ������� ��� - ���� ���� �������� ��Ÿ������ ��ġ
			System.out.println("���� �뷮 : " + f1.length());
			System.out.println("���� �뷮 : " + f2.length());
			System.out.println("f1 ���� ���� : " + f1.getParent());
			System.out.println("f4 ���� ���� : " + f4.getParent());
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
