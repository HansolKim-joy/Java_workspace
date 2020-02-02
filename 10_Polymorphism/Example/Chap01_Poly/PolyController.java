package com.kh.example.chap01_poly.test.controller;

import com.kh.example.chap01_poly.test.model.vo.Child1;
import com.kh.example.chap01_poly.test.model.vo.Child2;
import com.kh.example.chap01_poly.test.model.vo.Parent;

public class PolyController {

	public void method() {
		// TODO Auto-generated method stub
		System.out.println("1. �θ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
		// ���� ���Ÿ� ��ڴ�
		Parent p = new Parent(); 
		// ���θ�Ÿ�� ���۷���	���θ� ��ü
		p.printParent();
		System.out.println();
		
		System.out.println("2. �ڽ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		// ���� ���Ÿ� ��ڴ�
		Child1 c1 = new Child1();
		// ���ڽ�Ÿ�� ���۷���	���ڽ� ��ü
		c1.printChild1();
		c1.printParent();
		System.out.println();
		
		System.out.println("3. �θ�Ÿ�� ���۷����� �ڽ� ��ü�� �ٷ�� ���");
		Parent p2 = new Child2(); // ������ 
//		Parent p3 = new Child1(); // ������
		p2.printParent();
		// p2.printChild2(); ��ü�� Child2�ε� �� printChild2�� �ȵǴ°�?
		// �ֳ��ϸ� ����(��������)�� ���� �� ����� ���µ�
		// Parent Ÿ������ �����߱� ������ �������� ������ Parent�� ����鸸 �������� �Ǳ� �����̴�.
		
		
//		((Child2)p2).printChild2();
//		((Child2)p2).printParent();
//		// ���� ����ȯ ���� �Ͱ� ���� Child2�� �Ұ�ȣ �ȿ� �־��ָ� Child2�� �޼ҵ���� ȣ���� �� �ִ�.

		// �ڽ� ��ü�� �θ� ���۷����ȿ� ���� ��(�θ� Ÿ���� ������ ���� (= ���۷��� ����)�� ��� �ڽ� ��ü�� ���� �� �ִ� ��) : �� ĳ����
		// ((Child2)p2).printParent();
		// �θ��� method�� ��밡���� ��츦 �ذ��ϱ� ���ؼ� �ڽ� Ŭ���� Ÿ������ �� ��ȯ�� �����ָ� �ڽ��� method���� ��밡���� ���ְ� ����
		// ���� ���� �θ� Ŭ���� Ÿ���� ������ ������ �ڽ� Ŭ���� Ÿ������ �� ��ȯ �����ִ� �� : �ٿ� ĳ����
		
		System.out.println();
		
		System.out.println("4. �ڽ�Ÿ�� ���۷����� �θ� ��ü�� �ٷ�� ���");
//		Child2 c2 = new Parent();
		// Type mismatch: cannot convert from Parent to Child2
		// ����������  8���� ������ �����Ǿ� �ְ� ** �� ��쿡�� �ذ��� ����� �ƹ��͵� ����
		
//		Child c2 = (Child2) new Parent(); // �Ұ���
		
		
		System.out.println();
		System.out.println("==== ���� ���� ====");
		System.out.println();
		
		Parent[] pArr = new Parent[4];
		pArr[0] = new Child1();
		pArr[1] = new Child2();
		pArr[2] = new Child1();
		pArr[3] = new Child2();
		
		for(int i = 0; i < pArr.length; i++) {
			if(pArr[i] instanceof Child1) {
				((Child1)pArr[i]).printChild1();
			}else if(pArr[i] instanceof Child2) {
				((Child2)pArr[i]).printChild2();
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < pArr.length; i++) {
			pArr[i].print();
		}
		// �θ��!! �� ���� �� ������ �ڽ��̾�!! ��� ����� ���� : �̷� ������ �������ε��̶�� ��
		// �� ���� print�޼ҵ尡 �������̵� �Ǿ��ֱ� ������ �������̵��� Ư¡ ���� �ϳ���
		// �ڽ� ��ü�� ���� ���� �� �ļ� ���� �켱���� ������ Ư¡ ������
		
	}

}
