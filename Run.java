package com.kh.example.chap01_throws.run;

import com.kh.example.chap01_throws.controller.ThrowsController;

public class Run {
	public static void main(String[] args) {
		// ���� �޼ҵ忡���� ���� ��Ȳ�� ȣ���� ��(JVM)���� ������ �� ���� ====> ������ ����
		ThrowsController tc = new ThrowsController();
		
		try {// ���ܰ� �߻��� �� �ִ� �ڵ尡 ��
			tc.method1();
		} catch (Exception e) {
//			e.printStackTrace(); // ���� ����� ���� �߻� ��ġ�� �ֿܼ� ������ִ� �޼ҵ�
			// �� ��� ������ �ƴϰ� ������ �� ����� ��ġ�� �˷��ִ� ������ ������� �� : ������ ����̱� ������ ����ó�� ������ �������� ��
			
			System.out.println("���� ��Ȳ�� �߻��Ͽ����ϴ�.");
		}
		
		System.out.println("���������� �����...");
		// catch �������� ������ �ذ� ���� �ʾ����� �갡 �ߴ� ������  catch�� ������ ����־��� ������ �������� ��µ� �� �ִ� ���̰�
		
	}
}
