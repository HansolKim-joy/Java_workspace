package com.kh.variable;

public class C_Overflow {
	public void overflow() {
		byte bNum = 127;
		bNum = (byte)(bNum + 1); // ����Ʈ + int ���̱� ������ ������ ������ - ���� byte�� �����鼭 �ذ�
		System.out.println("bNum : " + bNum);
	}
	
	public void calc() {
		int num1 = 1000000;
		int num2 = 700000;
		
//		int result = num1 * num2;
		long result =(long)num1 * num2;
		
		System.out.println("��� ��� : " + result);
		// int�� ���� �� : ��� ��� 7õ�� ���� - ������ ����� ��� ���� �ٸ��� ����
		// long���� ���� �� : int ���� ũ�Ⱑ ū �����͸� ���� �� �ִ� �ڷ������� 7õ������ �°� ����
		
	}
}
