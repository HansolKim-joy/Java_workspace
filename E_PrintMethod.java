package com.kh.variable;

public class E_PrintMethod {
	String str1 ="�ȳ��ϼ���";
	String str2 = "�ݰ����ϴ�"; 
	//�̷��� ������ ���� ������� �θ� - Ŭ���� �ȿ� ��� �޼ҵ忡 ����Ǵ� ����
	
	public void printExample() {
//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�";
		// printExample �޼ҵ� �ȿ����� ���Ǵ� ������ ���� ������� �θ�
		
		System.out.print(str1);
		System.out.print(str2);
	}
	
	public void printlnExample() {
//		String str1 = "�ȳ��ϼ���";
//		String str2 = "�ݰ����ϴ�"; 
		//�̷��� �ּ�ó���ϰ� �Ǹ� 24,25��° �ٿ����� str1,2�� �� �޼ҵ� �ȿ��� ã�� �� ���ٴ� �ǹ̷� ������ �߻�
		//�׷��� Ŭ���� ���� �ٷ� �Ʒ��� Ŭ���� ���� ���� str1,2�� �Է��ϸ�
		//printExample �޼ҵ�� printlnExample �޼ҵ� ��� Ŭ���� �ȿ� ���Ƿ� ������ �ذ�
		
		System.out.println(str1);
		System.out.println(str2);	
	}
	
	public void printfExample() {
		//�ȳ��ϼ���, �ڽſ��Դϴ�. �ݰ����ϴ�. => ����ϰ� ���� ����
		//-------             -------
		// str1                 str2
		// %s : ���ڿ�                    %s : ���ڿ� 
		System.out.printf("%s, �ڽſ��Դϴ�. %s.", str1, str2 );
		//               ("����ϰ� ���� ����" , ���� ���Ŀ� ���� ������ ������) - ���� 
		
		//�ݰ����ϴ�, ģ�ϰ� ������. => ����ϰ� ���� ����
		System.out.printf("%s, ģ�ϰ� ������.", str2);
		
		System.out.println();
		
		//�̴� ����
		// �ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		int age = 20;
		String name = "�ڽſ�";
		String job = "����";
		
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.", str1, age, name, job, str2);
	}
	
	
	
}
