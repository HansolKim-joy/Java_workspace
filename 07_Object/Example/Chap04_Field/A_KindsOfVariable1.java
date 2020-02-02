package com.kh.example.chap04_field.controller;

public class A_KindsOfVariable1 { // <= Ŭ���� ������ ���� 
	
	// Ŭ���� ������ �ۼ��ϴ� ���� : �ʵ� = ��� ���� = ��� �ʵ� = ��������
	
	private int globalNum;
	
	public void method1(int num) { // <= �޼ҵ� ������ ����
		//				------- : �Ű����� : �޼ҵ��� ����� �� ��ȣ �ȿ� �����ϴ� ����
		
		// �޼ҵ� �������� �ۼ��ϴ� ���� : ��������
		int localNum;
		// �Ű����� ���� ���������� �������� ������
		// �ٸ� �޼ҵ� �ȿ��� ���ٸ� ���� ������� ���������� �Ű������� ����� �� ����
		
		localNum = 10;
		System.out.println(localNum);
		//The local variable localNum may not have been initialized
		// : ���������� �ݵ�� �ʱ�ȭ�� �Ǿ� �־�� ��
		
		System.out.println(num);
		// �Ű������� �ʱ�ȭ���� �ʰ� ��� ���� 
		// �ֳ��ϸ� �Ű������� ���� �޾ƿ��� �����̰� ���� �޾ƿ��� �Ǳ⶧���� �ʱ�ȭ�� �ʿ䰡 ����.
		
		System.out.println(globalNum);
		// globalNum�� ���������� �����߱� ������ �������� ��°����ϴ�.
		
	} // <= �޼ҵ� ������ ��
	
	public void method2() {
//		System.out.println(localNum);
		//localNum cannot be resolved to a variable
		// ���������� localNum�� method1���� ������ ������ ������ method1�� ���� �ʱ�ȭ �ĺ��� ��밡���ѵ�
		// method2���� ����Ϸ��� �ϴ� ���� �߻�
		
		System.out.println(globalNum);
		
	}
} // <= Ŭ���� ������ ��
