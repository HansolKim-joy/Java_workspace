package com.kh.example.chap04_field.run;

import com.kh.example.chap04_field.controller.B_KindsOfVariable2;
import com.kh.example.chap04_field.model.vo.Product;

public class Run {
	public static void main(String[] args) {
		// ��ü ���� 
		B_KindsOfVariable2 bkv = new B_KindsOfVariable2();
		//							--------------------- ��� ������
		
		int a = bkv.staticNum;
		// The static field B_KindsOfVariable2.staticNum should be accessed in a static way
		// static ������� �����ؾ� �Ѵٴ� �� ��ü�� �����ؼ� ������ �����ϴ� ���� �ƴ϶�� �ǹ�
		// �̴� ��ü�� ����� �������� �ʾƵ� �ȴ�
		
		int a1 = B_KindsOfVariable2.staticNum;
		// " Ŭ���� ��.������ "�� ������� ������
		// static�̶�� ���� ����߱⶧���� �̷��� ��� ���� 
		// ���α׷��� �����Ҷ� static ������ ������ �͵�(����, �޼ҵ� �� ��� ����)�� static������ �÷����´�.
		// ��, static������ �ö��ֱ� ������ ��ü ���� ���� ����
		// static ������ ���� ���� Stack����, Heap�������� ������ �� �� ����(����)
		
		B_KindsOfVariable2 bkv2 = new B_KindsOfVariable2();
		// testNum�� Stack������ �־ 
		// staticTestNum�� Static������ �־ 
		
		Product p = new Product();
		p.inform();
		// JVM �⺻�� �ʱ�ȭ : null, null, 0, 0
		// ����� �ʱ�ȭ : ��������, ������, 1500, 100
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 90
		
		Product p2 = new Product();
		p2.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 80
		// 80���� �� �پ�� ������ num��  static������ �ִ� ���̰� �̰� ���� 90���� �پ��� ������ �ű⼭ 10�� �� 80�� ����
		
		Product p3 = new Product();
		p3.inform();
		// �ν��Ͻ� �ʱ�ȭ �� : ĭ��, �Ե�, 1000, 70
		// ĭ��, �Ե�, 1000, 139
		// ĭ��, �Ե�, 1000, 129
		// ĭ��, �Ե�, 1000, 119
	}
}
