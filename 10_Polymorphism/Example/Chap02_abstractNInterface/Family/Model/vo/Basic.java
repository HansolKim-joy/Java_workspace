package com.kh.example.chap02_abstractNInterface.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable {
	//							----------------------  => Marker Interface : interface ���ο� ����Ȱ��� �ƹ��͵� ���� �̸��� ����� ��
	//										�� ����ϴ� ���� : �޼ҵ� ���� �������̵��� ������ �ƴ϶� �� interface�� ������ Ŭ������ Ư���� ��Ÿ���� ���ؼ� ���
	
	
	/*public abstract*/ void eat();
	/*public abstract*/ void sleep();
	// ���ͽ����̽������� public abstract �������� �ϱ� ������
	
	
	// �긦 �ٸ� Ŭ������ �ֱ� ���ؼ� �ٸ� Ŭ���� ����� �������κп� [implements �������̽���]�� ���ش�

}
