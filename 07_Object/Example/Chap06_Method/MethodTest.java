package com.kh.example.chop06_method.controller;

import com.kh.example.chop05_construnctor.model.vo.User;

public class MethodTest {
	// �Ű������� ������ ��ȯ���� ������ ���� ����
	
	
	// 1. �Ű����� ���� ��ȯ�� ���� �޼ҵ�
	public void method1() {
		// ��ȯ�� x      �Ű����� x
		System.out.println("�Ű������� ��ȯ�� �Ѵ� ���� �޼ҵ��Դϴ�.");
	}
	
	
	// 2. �Ű����� ���� ��ȯ�� �ִ� �޼ҵ�
	public int method2() {
		// ��ȯ�� o    �Ű����� x
		// This method must return a result of type int
		// �� �޼ҵ�� (intŸ�� : ���� Ÿ���� int�̱� ������)�� ����� �ݵ�� �����ؾ��Ѵ�
		// ��ȯ���� �����ϴ� �޼ҵ忡�� return���� ��������� �ʾ����� ������ ����
		
//		return 0;
		// �� ��ü�� ���� ���� �ְ�
		
		int i = 10;
		return i;
		// �����ȿ� ���� ���� ����
	}
	
	
	// 3. �Ű����� �ְ� ��ȯ�� ���� �޼ҵ�
	public void method3(int num1, int num2) {
		// ��ȯ�� x        �Ű����� o (2��)
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		int sum = num1 + num2;
		
		System.out.println("sum : " + sum);
	}
	
	
	// 4. �Ű����� �ְ� ��ȯ�� �ִ� �޼ҵ�
	public int method4(int num1, int num2) {
		// ��ȯ�� o        �Ű����� o
		return num1 + num2;
		// �� int sum�� ���� ��ȯ�� �ʿ� ���� �׳� ������ �ؼ� ��ȯ�� ����
		
	}
	
	
	// ��ȭ 1. ��ȯ���� �迭�� ���
	public int[] method5() {
		int[] iArr = {1, 2, 3, 4, 5};
		
		for(int i = 0; i < iArr.length; i++) {
			iArr[i] *= 10;
		}
		System.out.println("MethodTest iArr : " + iArr);
		return iArr;
	}
	
	
	// ��ȭ 2. ��ȯ���� Ŭ������ ���
	public User method6() { // import ��
		User user = new User("user01", "pass01","�ڽſ�");
		System.out.println("MethodTest user : " + user);
		
		return user;
	}
}
