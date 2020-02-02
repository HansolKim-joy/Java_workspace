package com.kh.example.list.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.example.list.model.compare.StudentComparator;
import com.kh.example.list.model.vo.Student;

public class ListController {
	public void doList() {
//		List list1 = new ArrayList(); // ���׸� Ÿ���� ������ ���� �ʾƼ� Object������ ����
//		list1.
		
		List<Student> list = new ArrayList<Student>(/*3*/); // �̸� 3��¥���� ����(������ �⺻ 10��¥��)  
		// �տ� �ִ� ���׸� Ÿ���� ���� �������� �� �ֱ� ������ ArrayList�ڿ��� <> ���� ������ ����(�ڹ� ������ ���� �ٸ�)
		
		// add(E e) : ����Ʈ ���� ������ e�� �߰�
		list.add(new Student("�׽�Ʈ", 0));
		list.add(new Student("�����", 60));
		
		System.out.println("list : " + list);
		
		list.add(new Student("������", 90));
		list.add(new Student("����ȣ", 85)); // ���� 3��¥���� �����ߴµ� �ڵ����� �þ�� �� ( ���� 1: ũ�⿡ ������ ����)
		
		System.out.println("���� list�� ��� element ���� : " + list.size()); 
		System.out.println("list : " + list);
		
		list.add(new Student("���̹�", 66));
		System.out.println("���� list�� ��� element ���� : " + list.size()); 
		System.out.println("list : " + list);
		
		// �÷��� ���� 2 : �߰�/����/���� ���� ���ó���� ����
		// add(int index, E e) : index��° �ε����� e �߰�
		list.add(0, new Student("�����", 100));
		System.out.println("list : " + list);
		
		list.add(3, new Student("���ǰ�", 40));
		System.out.println("list : " + list);
		
		// remove(int index) : �ش� index���� ��ü ����
		list.remove(1);
		System.out.println("list : " + list);
		
		// remove(Object o) : �ش� Object ��ü ����
		list.remove(new Student("���ǰ�", 40)); 
		System.out.println("list : " + list); // �� ����������? => ���ο� ��ü�� �����ϰ� �ٸ� �ּҰ��� ���� �ֱ� ������
		// ObjectŬ���� �ȿ� �ִ� equals / hashCode �޼ҵ带 �������̵�(������)�ؼ� �ּҰ��� ���ϴ� �� �ƴ϶� ���� �ʵ尪�� ���ϵ��� �ؾ���
		// �̷��� �ϱ� ���� �ʵ带 ������ Ŭ������ ���� equals / hashCode �޼ҵ带 �������̵���
		
		// ���� ��� 1. Collections Ŭ���� �̿� - Collection�� ����ϱ� ������ �͵��� ��Ƴ��� Ŭ����
		Collections.sort(list); 
		// ���ı����� ���� ������ sort�� ������ ���� �߻� => ���� ���߸� ������� �� by Comparable, Comparator �������̽�
		// StudentŬ�������� Comparable �������̽��� �ް� compareTo �޼ҵ带 �̿��� ������ ����� �ִϱ� ��밡�� ���� => �̸� ������������ �������־ �׷��� ��µ�
		System.out.println("�̸� �������� : " + list); 
		
//		ArrayList<String> strList = new ArrayList<String>(); // ���׸��� String�̰� �� ���ı����� �̹� �־ �ѹ� �غ���
//		strList.add("����ð�");
//		strList.add("���ɽð�");
//		strList.add("��ٽð�");
//		strList.add("���ð�");
//		strList.add("��ٽð�");
//		strList.add("��ħ�ð�");
//		
//		System.out.println(strList);
//		Collections.sort(strList); // String�� �̹� ���ı����� �����ϰ� �ֱ� ������ �������� ���ı������� ��µ�
//		System.out.println(strList);
		
		// ���� ��� 2. List.sort()�޼ҵ� �̿�
		list.add(new Student("�ں���", 85));
		list.sort(new StudentComparator());
		System.out.println("���� ���� ���� : " + list);
		
		// set(int index, E e) : index��° �ε����� �ִ� ��Ҹ� e�� ����
		list.set(2, new Student("�����", 31));
		System.out.println("list : " + list);
		
		// get(int index) : index���� �ε����� �ִ� ��Ҹ� ������ ��
		Student s = list.get(2);
		System.out.println(s);
		System.out.println("list : " + list); // ������ ����Ʈ���� ������ ���� �ƴϰ� �׳� ���� ���� ���� ��
		
		// subList(int index1, int index2) : index1��° �ε������� index2���� �ε������� ����Ʈ ��ȯ
		System.out.println("list ���� : " + list.subList(2, 5)); // index2��° �ε����� �������� �ʰ� ��µ�
		
		// contains(Object o) : o�� ����Ʈ�� �����Ѵٸ� true��ȯ 
		// indexOf(Object o) : o�� ����Ʈ�� ��ġ�ϴ� �ε��� ��ȣ ��ȯ, ���ٸ� -1 ��ȯ
		System.out.println("������, 90�� �ִ°�? : " + list.contains(new Student("������", 90)));
		System.out.println("������, 90�� �ε��� ��ġ��? : " + list.indexOf(new Student("������", 90)));
		System.out.println("�׽�Ʈ, 0�� �ε��� ��ġ��? : " + list.indexOf(new Student("�׽�Ʈ", 0))); // ����Ʈ�� ���� ������ -1 ��ȯ�ϴ� ����
		
		// clear() : ����� ��� ��ü�� ����
		// isEmpty() : ����Ʈ�� ����� �� true ��ȯ
		list.clear();
		System.out.println("list : " + list);
		System.out.println("list�� �������? : " + list.isEmpty());
		
	}
}
