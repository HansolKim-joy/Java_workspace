package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceController {
	public void method() {
		// Parent Ŭ������ num�ʵ忡 ����
		System.out.println("Parent Ŭ������ num�ʵ忡 ����");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());
		
		System.out.println();
		
		System.out.println("Child1Ŭ������ str�ʵ� ����");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 �ȿ� �ִ� str : " + c1.getStr());
		
		System.out.println("Child1Ŭ������ num�ʵ� ����");
		c1.setNum(99);
		System.out.println("Chile1 �ȿ� �ִ� num : " + c1.getNum());
		
		System.out.println();
		
		System.out.println("Child2Ŭ������ str�ʵ� ����");
		Child2 c2 = new Child2();
		c2.setStr("World");
		System.out.println("Child2 �ȿ� �ִ� str : " + c2.getStr());
		
		System.out.println("Child2Ŭ������ ��ӹ��� Parent�� �ʵ� ����");
//		c2.num;
		// ParentŬ�������� num�ʵ带 private���� �����صξ��� ������ ��ӹ޾Ҵ� �ϴ��� �ڱ� �ڽ��� �ƴ� c2������ ������ �ʴ´�.
		c2.setNum(999);
		System.out.println("Child2 �ȿ� �ִ� num : " + c2.getNum());
		System.out.println("Parent �ȿ� �ִ� num : " + p.getNum());
		// Child2�� num�� Parent���� �����޾��� ����Ǿ� �ִ� ���� �ƴϱ� ������
		// Child2���� num���� �������൵ Parent�� num���� ������ �ʰ� Parent��ü���� setter�� �������� ���� ������
	}
}
