package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	// break���� ���� �����ϴ� ���� ����� �ݺ����� ����
	
	public void method1() {
		// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� �ݺ� ���α׷�
		// ��, end�� �ԷµǸ� �ݺ� ����
		// do~while ���
		
//		Scanner sc = new Scanner(System.in);
//		String str = null;
//		do {
//			System.out.print("���ڿ��� �Է��ϼ��� : ");
//			str = sc.nextLine();
//			int num = str.length();
//			
//			System.out.println(num);
//		} while(!str.equals("end"));
		// �̰� ���� �� �� - break �Ⱦ��°�
		
		// �������ʹ� break���� �� 
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("���ڿ� �Է� : ");
			String str = sc.nextLine();
			
			if(str.contentEquals("end")) {
				break;
			}
			
			System.out.println(str + "�� ���� ���� : " + str.length());
		}while(true); 
		// break�� �Ⱦ��� while(true)�϶��� ��Ȳ : : ���� �ݺ��� / ���� ����
	}
	
	public void method2() {
		// 1���� ����ڿ��� �Է� ���� ���ڱ����� �� ���
		// for�� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� : ");
		int sum = 0;
		int num = sc.nextInt();
		
		for(int i = 1; /* i <= num */; i++) { 
			// break�� ����ϱ� ���� ���ǹ��� �ּ�ó�� ������
			// �׳� break�� ���Ե� if���� ���� ���ǽ��� �ּ�ó������ ���鵵 ���డ����
			sum += i;
			if(i == num) {
				break;
			}
		}
		System.out.print(sum);
	}
}
