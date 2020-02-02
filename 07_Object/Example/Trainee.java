package com.kh.example.chop06_method.model.vo;

public class Trainee {
	// �ʵ� ����
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;

	public Trainee() {} //�⺻������
	public Trainee(String name) {
		this.name = name;
	}
	public Trainee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
//		this.score = score; // static ������ �ִ� ���̱� ������ ���� ��ü�����ؼ� �ϴ� this�� �� �ʿ䰡 ����.
		Trainee.score = score; // Ŭ���� �̸���. ���� �ؼ� ?? - ���� �� ����Ф�	
	}
	
	// �ʵ忡 �ִ� name�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public void setName(String name) {
		// ������ setter�� ����?�ϴ� ���
		this.name = name;
	}
	
	// �ʵ忡 �ִ� classRoom�� �޾ƿ� �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	
	// �ʵ忡 �ִ� score�� �޾ƿ�  �Ű������� ���� �ʱ�ȭ ��Ű�� setter
	public static void setScore(double score) { //Ŭ����(static)�����̱� ������ static ���ִ°� ����
		Trainee.score = score;
	}
	
	// �ʵ忡 �ִ� name�� ��ȯ�ϴ� getter
	public String getName() {
		return name;
	}
	
	// �ʵ忡 �ִ� ACADEMY�� ��ȯ�ϴ� getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// �ʵ忡 �ִ� classRoom�� ��ȯ�ϴ� getter
	public char getClassRoom() {
		return classRoom;
	}
	
	// �ʵ忡 �ִ� score�� ��ȯ�ϴ� getter
	public static double getScore() {
		return score;
	}
	
	
	
	
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
}
