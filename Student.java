package com.kh.example.list.model.vo;

public class Student implements Comparable<Student> {
	// - name : String
	// - score : int
	
	// + Student()
	// + Student(name : String, score : int)
	
	// + getter / setter
	// + toString() : String
	
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return name + "(" + score + "��)";
	}
	
	@Override
	public int hashCode() { // ������ ��� ���������� => �� �� ��Ŭ�������� �⺻������ ������ �ϴ� ����� ����� ����
		final int prime = 31; // ?? 31�� ��ǻ�Ͱ� ������ �� ������ ũ�鼭 ����ϱ� ���� ���� => ū �ǹ� ����
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode()); // String �����϶�
		result = prime * result + score; // �⺻ �ڷ����϶�
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { // ���������� ������ ��� ���������� => �� �� �̰��� ����� ����
		if(this == obj) { // this �� �ڽ��� ����Ű�� �ּҰ� 
			return true; // �� �ڽ��� �ּҰ��� �� ��ü�� �ּҰ��� ���ٸ� ���� ���̱⶧���� true�� ��ȯ
		}
		if(obj == null) {
			return false; // obj��  null�̸� ���� ���� �� �����Ƿ� false�� ��ȯ
		}
		if(getClass() != obj.getClass()) { // getClass() : �� Ŭ������ ���� ������ ���� �ִ� �޼ҵ� \
			return false; // �� Ŭ������ ���� ������ obj�� ������ �ٸ��ٰ� �ϸ� false�� ��ȯ
		}
		// ��������� ��ü ��ü�� �� �Ѱ� (�ּҰ�, Ŭ���� ������ �� )
		// ���� �ʵ�(Student������ name�� score ����)�� ���� �� �ʿ�
		Student other = (Student)obj; // ���� ���� �Ű������� ���� ���� other�� ����
		
		// String �϶�
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		
		// �⺻ �ڷ��� �϶�
		if(score != other.score) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Student o) {
		// �̸��� ���ؼ� �������� ����
		// �̸� : String			
		// ==> String�� ���ؼ� �������� ����
		
		String otherName = o.getName(); // �̹� String���� ������������ �����ϴ� ������ �ֱ� ������ 
		
		/*
		 	compareTo�� ��ȯ �� : int
		 	�� ��ü�� �� ���� ������ 0�� ��ȯ (�ϵ��� �Ǿ��ְ�)
		 	�� ��ü�� �� ��󺸴� ũ�� 1�� ��ȯ (�ϵ��� �Ǿ��ְ�)
		 	�� ��ü�� �� ��󺸴� ������ -1�� ��ȯ (�ϵ��� �Ǿ�����)
		 */
		
		return name.compareTo(otherName);
//		return -name.compareTo(otherName); // => ��ȯ���� �޶����� �ϸ� �Ǵϱ� �̷��� �ϸ� ������������ ������
	}
}
