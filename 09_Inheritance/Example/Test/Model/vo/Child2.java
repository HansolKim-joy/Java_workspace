package com.kh.example.test.model.vo;

public class Child2 extends Parent {
	// ��� ���� ���� Ŭ���� ǥ����
	private String str;
	
	public Child2() {
		// ��ü ������ �� �ʿ䰡 ����
		// �ֳ��ϸ� ��ӹ޾ұ� ������
//		super.num = 10; // ���� ������ private�̱� ������ 
		super.dNum = 10.2; // ���� ������ default - ���� ��Ű���̱� ������
		super.bool = false; // ���� ������ protected - ���� ��Ű���̱� ������ (�ļ�)
		super.ch = 'A'; // ���� ������ public - ��ü�̱� ������
	}
	
	public void setStr(String str) {
		this.str = str;
	}
	
	public String getStr() {
		return str;
	}

}
