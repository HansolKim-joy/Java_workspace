package com.kh.operator;

import java.util.Scanner;

public class E_Logical {
	// && : �ǿ����ڰ� ��� true�� ��, true ��ȯ (�׸���, ~�鼭)
	// || : �ǿ����� �߿��� �ϳ��� true�� ��, true ��ȯ (�Ǵ�, ~�ų�)
	
	public void method1() {
		// �Է��� ���� ���� 1~100������ �������� Ȯ��
		// ���� �ϳ� �Է� : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : "); // ���� println���� �����
		int num = sc.nextInt();
		
		// 1~100 ������ ���� = ���ڰ� 1���� ũ�ų� ���� 100���� �۰ų� ����. => and / &&
		System.out.println("1���� 100 ������ �������� Ȯ�� : " + (num >=1 && num <=100));
	}
	
	public void method2() {
		// �Է��� ���� ���� �빮�� ���� Ȯ��
		// ���� �ϳ� �Է� : 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		char ch = sc.nextLine().charAt(0);
		
		// �빮�� ���� Ȯ�� - �ϳ��ε� ����ϴ� ������ ������ �� ���Ƽ� ���� ����! = �ѹ������� �ϴ� ��� ����
		boolean isCap = (ch >= 'A' && ch <= 'Z'); // ���ڵ� ���ڷ� ġȯ�Ǳ� ������ �̷��� ǥ�� ������
		System.out.println("���� �빮�ڰ� �½��ϱ�? " + isCap);
		
		// ��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : 
		// ��� �Ͻðڴٰ� �ϼ̽��ϱ�? : __________
		
		System.out.print("��� �Ͻ÷��� y Ȥ�� Y�� �Է��ϼ��� : ");
		char ch1 = sc.nextLine().charAt(0);
		System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? : " + (ch1 == 'y' || ch1 == 'Y'));
		
//		boolean isYes = (ch1 == 'y' || ch1 == 'Y');
//		System.out.println("��� �ϰڴٰ� �ϼ̽��ϱ�? : " + isYes);
		// �̰� �� �ٸ� ������ - ���� ���� �� ���غ���! 

	}
}
