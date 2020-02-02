package com.kh.example.chap03.branch;

public class B_Continue {
	// continue�� �ݺ��� �ȿ����� ����� ����
	// continue�� ������ �Ʒ������� �������� �ʰ�
	// �ݺ����� �ٽ� ������
	// for���� ��� ���������� ���� while���� ��� ���ǽ����� ��
	public void method1() {
		// 1~100���� �������� �հ踦 ����ϵ� ��, 4�� ����� ���� ���
		
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			if(i % 4 == 0) {
				continue;
			}else {
				System.out.print(i + " ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}
	
	public void method2() {
		//������ ��� : ¦�� ��, ¦�� �� ���� ���
//		
//		for(int dan = 2; dan < 10; dan++) {
//			for(int su = 1; su <10; su++) {
//				if(dan % 2 != 0) {
//					if(su % 2 != 0) {
//						System.out.printf("%d * %d = %d", dan, su , dan*su);
//						System.out.println();
//					}
//				}else {
//				continue;
//				}
//			}
//			System.out.println();
//		}
//	}
		// ������ ���� �� ��
		// �ؿ��� �������� �� ��
		
		for(int dan = 2; dan <= 9; dan++) {
			for(int su = 1; su <= 9; su++) {
				
				if(dan % 2 == 0 || su % 2 == 0) {
					continue;
				}
				System.out.println(dan + "*" + su + " = " + (dan * su));
			}
			System.out.println();
		}
	}
}