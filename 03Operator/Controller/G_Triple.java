package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	// ���� ������ 
	// (���ǽ�)? ��1 : ��2;
	// ���ǽ��� true�� �� ��1 ����, ���ǽ��� false�϶� ��2 ����
	
	public void method1() {
		// �Է��� ������ ������� �ƴ��� �Ǻ�
		// ����� "�����", ����� �ƴϸ� "����� �ƴϴ�"��� ���� ���
		// ���� �ϳ� �Է� : 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
//		String result = num > 0 ? "�����." : "����� �ƴϴ�."; 
		// ��� ���� ���ڿ��̱� ������ string �ڷ����� ����Ѵ�.
		
		// ��ø ���� ������
		String result = num > 0 ? "�����." : (num == 0 ? "0�̴�." : "������.");
		
		System.out.println(num + " ���ڴ� " + result);
		
	}
	
	public void method2() {
		// �Է��� ������ ¦������ Ȧ������ �Ǻ�
		// Ȧ���� "Ȧ���Դϴ�", ¦���� "¦���Դϴ�"
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num2 = sc.nextInt();
		
		String result2 = (num2%2)==0 ? "¦���Դϴ�." : "Ȧ���Դϴ�.";	
		System.out.println(num2 + " ��(��) " + result2);
		
		// Ȥ�� ���ǽĸ� ���� ���� or ���ĸ� ���� ���� �ؼ� ����
	}
}
