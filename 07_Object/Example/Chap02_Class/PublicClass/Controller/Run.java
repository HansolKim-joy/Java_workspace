package com.kh.example.chap02_class.publicClass.run;

import com.kh.example.chap02_class.publicClass.controller.PublicClassTest;

public class Run {
	public static void main(String[] args) {
		PublicClassTest pct = new PublicClassTest();
		
		// import ���ϴ� ��� : 
		// com.kh.example.chap02_class.publicClass.controller.PublicClassTest pct = new com.kh.example.chap02_class.publicClass.controller.PublicClassTest();
		// �ٸ� ��Ű���� ���� �̸��� Ŭ������ ����ϰ� ������ 
		// �ϳ��� ������ ���� import�� �ϸ� ������ �͵��� ��� �̹� �ҷ��� ��Ű�������� ���� ���
		// �ٸ� ��Ű���� ������ ����ϰ� ���� �� ���� ���� ����� ����Ͽ� ���� �����Ѵ�.
		
		pct.test();
	}
}
