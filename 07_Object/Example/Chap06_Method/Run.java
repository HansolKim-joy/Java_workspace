package com.kh.example.chop06_method.run;

import com.kh.example.chop05_construnctor.model.vo.User;
import com.kh.example.chop06_method.controller.MethodTest;
import com.kh.example.chop06_method.model.vo.Trainee;

public class Run {
	public static void main(String[] args) {
		MethodTest mt = new MethodTest();
//		int a = mt.method1();
		// Type mismatch: cannot convert from void to int
		// void�̱⶧���� ��ȯ���� �����Ƿ� int�� ���� �� ����(double ��� ��� �͵� ��������)
		mt.method1();
		
		int result = mt.method2();
		// int���̰� ��ȯ���� ��ƿ� ������ ����
		System.out.println(result);
		// �� ���� ���� ��ȯ���� result ������ ��Ƽ� result ���� ����ϴ� �Ű�
		System.out.println(mt.method2());
		// �� ���� ���� ��ȯ���� �ٷ� ����ϴ� ���̱� ������ �Ȱ���
		
		mt.method3(10, 20);
		
		int result2 = mt.method4(10, 30);
		System.out.println(result2);
		// ����ϱ⸦ ���Ѵٸ� �� �Ʒ� �����ؼ� ���� ���Ѱɷ�  �ϸ� �� 
		System.out.println(mt.method4(10, 30));
		
		// ��ȭ 1
		int resultArr[] = mt.method5();
		System.out.println("resultARR : " + resultArr);
		
		// ��ȭ 2
		User user = mt.method6(); // method�� �ڿ� :�� ������ ��ȯ���� ��Ÿ��
		System.out.println("Run user : " + user);
		
		
		/////////////////////////////////////////////////
		
		Trainee tt = new Trainee("�ڽſ�"); // ����
		System.out.println(tt.inform());
		
		// �� �˾ƺ��ϱ� KH �ʹ� ����! �ٳ�߰ڴ�
		// ����ҰԿ�~~~
		// ���� ���� ���Կ� => 20��
		Trainee.setScore(20);
		System.out.println(tt.inform());
		double score = Trainee.getScore();
		System.out.println(score);
		
		// ���� 20��
		// ����� ������ 23��
		// g���ε� ���? oooo ���
		tt.setClassRoom('g');
		System.out.println(tt.inform());
		System.out.println(tt.getClassRoom());
	}

}
