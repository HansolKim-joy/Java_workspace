package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 extends Parent {
	public Child3() {
//		super.num = 10; // private - �� �ڽ��̶� �ȵ�
//		super.dNum = 90.9; // default - �� �ڽŵ� ���� ��Ű���� �ƴϾ �ȵ�
		super.bool = false; // protected - �� �ڽŵ� ��Ű���� �ƴ����� �ٸ� ��Ű���� �ļ�Ŭ�����̱� ������
		super.ch = 'b'; // public - ��ü�̱� ������
	}
}
