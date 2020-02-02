package com.kh.example.chop05_construnctor.model.vo;

import java.util.Date;

public class User {
	// - userId : String
	// - userPwd : String
	// - userName : String
	// - enrollDate : Date(java.util)
	
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	// import �Ǵ� �� �߿� java.util�� �ض�
	
	// ������ ��� ����(��ü�� �ϴ� ��)
	//	1. ��ü�� �������ֱ� ���� ����
	//	2. �Ű������� ���޹��� ������ �ʵ� �ʱ�ȭ
	
	
	// ������ ��� ��Ģ
	//	1. �����ڸ��� Ŭ������� �����ؾ� �Ѵ�.
	//	2. ��ȯ��(������)�� ����.
	
	//�ʵ�ؿ� �����ڸ� �ַ� ����
	
	public User() {} // �⺻������ : �Ű������� ���� ������
	// JVM�� �⺻������ �������� 
	// �Ű����� �ִ� �����ڸ� ����� JVM�� �ڵ����� ������ ���� �ʱ� ������ �ݵ�� ����ؾ� ��
	
	// �ۿ��� ��ü�� ������ �� �ְ� �Ҷ��� public / �ƴҋ��� private
	// + Ŭ������ + () + {}
	// �޼ҵ�� ������ : ��ȯ�ڰ� ����
	
//	public User() {}
	// Duplicate method User() in type User
	// ���� �̸��� ������(�޼ҵ嵵 ��������)�� ���� �� �����ε��� ������� ������ �����߻� 
	
	
	public User(String userId, String userPwd) {
//		System.out.println(id);
//		System.out.println(pwd);
		this.userId = userId;
		// userId�� �Ű������� ���������� ��� �̸��� ������ ���Ǹ�
		// �� �ȿ��� ���ǰ� �ֱ⶧���� ���� �Ű������� �����Ѵ�.
		// �� ������ �ذ��ϱ� ���� this ��� - �� �ڽſ� �ִ� userId�� ã���� ���������ϱ� ���� ������ ��Ÿ���� ���� this �߰�
		this.userPwd = userPwd;
	}
	
	
	public User(String userId, String userPwd, String userName) {
//		this.userId = userId;
//		this.userPwd = userPwd;
		this(userId,userPwd);
		// �̷��� �ϸ� 44, 48��° ���� this�� ȣ��Ǵ� ��;;
		this.userName = userName;
	}
	
//	public User(String id, String name) {
//		// Duplicate method User(String, String) in type User
//		// �����ε� �Ұ� : �Ű����� ����, Ÿ��, ������ ���� ������ - �������� �޶� ��� ���� ������� ����
//		userId = id;
//		userName = name;
//	}
	
	public User(String userId, String userPwd, String userName,Date enrollDate) {
	this(userId, userPwd, userName);
	this.enrollDate = enrollDate;
	
	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
	}
}
