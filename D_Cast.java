package com.kh.variable;

public class D_Cast {
	public void rule1() {
		boolean flag = true;
//		boolean flag2 = 100; //����ȯ���� boolean�� ���ܵǱ� ������ �Ұ�
		
		int num = 'A' ; 
	//ũ�������δ� ���������� ���ڰ� ���ڷ� ���� ���� �̻������� ���ڰ� ���ڷ� ����Ǿ� �ֱ� ������ ����
		System.out.println("num : " + num);
		
		
		char ch = 97;
		System.out.println("ch : " + ch);
		
		char ch2 = (char) num;
		//�׳� num���� �Է����� �� : Type mismatch: cannot convert from int to char
		//int�� 4byte �̰� char�� 2byte �̴ϱ� ���� �� ���µ�
		//**���� �ٸ� ������ 97�� ���ͷ��̹Ƿ� �νİ����ѵ� num�� �����̱� ������ ��ü�� ũ�⸸ �� �� ���� - ũ�⸸�� ��
		//���� ��������ȯ�� �ʿ�������. ���� (char)�� �տ� �Է��ϸ鼭 ���� �ذ�
		System.out.println("ch2 : " + ch2);
		
		int num2 = -97;
		char ch3 = (char)num2;
		System.out.println("ch3 : " + ch3);
		// ��� ���� ?�� �����µ� �̰��� ���ڸ� ã�� �� ���ٴ� �ǹ��� - ���ڰ� ?�ΰ��� �ƴ�
		// char�� ������ 0~ �̹Ƿ� �������� -�� �Է��ϸ� ��� ���� ���ٴ� �ǹ� 
	}
	
	public void rule2 () {
		int iNum = 10;
		long lNum = 100;
		
//		int result = iNum + lNum;
		// iNum�� int�̰� lNum�� long�̹Ƿ� iNum�� long ������ ����(�ڵ� ����ȯ) ������ ��� ���� long������ �����µ�
		// ���ʿ��� int������ result���� ������ �ϴ� ������ �߻� 
		
		//iNum + lNum�� int result�� ������ �� �ִ� ��� : 
		// ��� 1. ���� ����� int�� ���� ����ȯ �ϴ� ���
		int result = (int)(iNum + lNum);
		
		// ��� 2. long���� int�� ���� ����ȯ ��Ű�� ���
		int result2 = iNum + (int)lNum;
		
		// ����, ��� ���� �����ϴ� result�� long ������ �޴� ���
		long result3 = iNum + lNum;
	}
	
	public void rule3() {
		int iNum = 290;
		
		byte bNum = (byte)iNum;
		// iNum���� �׳� �Է��� ��� : Type mismatch: cannot convert from int to byte
		
		System.out.println("bNum : " + bNum);
		
	}
	
	
	
	
	
	
	
}
