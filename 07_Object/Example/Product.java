package com.kh.example.chap04_field.model.vo;

public class Product {
	private String name = "��������"; 
	private String brand = "������";
	private int price = 1500;
	private static int num = 100;
	
	{
		name = "ĭ��";
		brand = "�Ե�";
		price = 1000;
		num -= 10;
	}
	
	static {
//		name = "Ȩ����";
//		brand = "����";
//		price = 2000;
//		// Cannot make a static reference to the non-static field name
//		// �ν��Ͻ������� ��ü�� ��������� �޸𸮿���(Heap����)�� �ö󰡴µ�
//		// static�� ���� �ʱ�ȭ ����� ���� ���α׷��� �������ڸ��� �޸𸮿���(Static����)�� �ö󰡱� ������ �����߻�
		
		num = 150;
		num--;
	}
	
	public void inform() {
		System.out.println(name + ", " + brand + ", " + price + ", " + num);
	}
}
