package com.kh.example.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	/*
	 * if else��
	 * if(���ǽ�) {
	 *  ������ ����1;
	 *  } else { //else ������ ���ǽ��� �ʿ����
	 *   ������ ����2;
	 *  }
	 *  �� �� �Ѱ��� �����ϴ� ���ǹ�
	 *  ���ǽ� ��� ���� ��(true)�̸� if�� �ȿ� �ִ� ������ ����1 ����
	 *  ���ǽ� ��� ���� ����(false)�̸� if���� �������� else�� �ȿ� �ִ� ������ ����2 ����
	 */
	
	public void method1() {
		// Ű����� �Է��� ���ڰ� ¦������ Ȧ������ ���
		
		// "���� �� ���� �Է��ϼ��� : " �ȳ����� ��� �� num������ ������ ����
		// ¦���̸� "�Է��Ͻ� ���ڴ� ¦���Դϴ�.", Ȧ���̸� "�Է��Ͻ� ���ڴ� Ȧ���Դϴ�." ���
		// ���α׷� ���� �� "���α׷� ����"���� ��� �� ���α׷� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		System.out.println("���α׷� ����");
	}
	
	public void method2() {
		// ����ڿ��� ����, ����, ���� ������ �Է¹޾Ƽ� ���� kor, eng, math ������ ����
		// �� ���� ������ 40�� �̻��̰� �� ���� ��� ������ 60�� �̻��� �� "���� ���"
		// �ϳ��� ���� �̴��� �� "���� �����" ���
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("���� ���� : ");
//		int kor = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("���� ���� : ");
//		int eng = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("���� ���� : ");
//		int math = sc.nextInt();
//		
//		if (kor >= 40 && eng >= 40 && math >= 40 && (kor + eng + math)/3 >=60) {
//			System.out.println("���� ���");
//		} else {
//			System.out.println("���� �����");
		
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int math = sc.nextInt();
		
		double avg = (kor + eng + math) / 3.0;
		
		if(kor >= 40 && eng >= 40 && math >= 40 && avg >= 60) {
			System.out.println("���� ���");
		} else {
			System.out.println("���� �����");
		}
	}
	
	public void method3() {
		// ���ڿ��� ���ϱ� : String Ŭ���� �ȿ� �ִ� equals()
		// ����ڿ��� �̸��� �޴µ� ���� ������ �̸��� ������ "�����Դϴ�."
		// ���� ������ "������ �ƴմϴ�." ���
		// sting���� ������ �񱳴� "=="�� ������� �ʰ� equals �޼ҵ带 ����Ѵ�. 
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		if(name.equals("�ڽſ�")) {
			System.out.println("�����Դϴ�.");
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
	}
}
