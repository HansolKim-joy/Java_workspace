package com.kh.example.test.model.vo;

public class Child1 {
	private String str;
	private int num;
	
	public Child1() { // ���� ��Ű��, Parent�� �ڽ��� �ƴ�
		Parent p = new Parent(); // ? // ��ü �����ؼ� �ϴ� ���;
		
//		p.num = 10;
		// Parent�� num�� private�̱� ������ Parent�� num�� Child1���� ���� �� ����
		p.dNum = 0.0; // dNum�� default ���� - ���� ��Ű�����̱� ������ ����
		p.bool = false; // bool�� protected ���� - ���� ��Ű�����̱� ������ ����
		p.ch = 'A'; // ch�� public ���� - ���� ��Ű�����̱� ������ ����
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}
