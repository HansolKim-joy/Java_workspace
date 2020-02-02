package com.kh.example.animal.model.vo;

public class Animal {
	// - name : String
	// - age : int
	// - weight : double
	
	// + Animal()
	// + Animal(name : String, age : int, weight : double)
	
	// + getter/setter
	// + inform() : String
	//		��ȯ ���� : �̸� ���� ������
	
	private String name;
	private int age;
	private double weight;
	
	public Animal() {}
	public Animal(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setNmae(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String inform() {
		return name + " " + age + " " + weight;
	}
	
	// inform�޼ҵ�� override�Ѱ�(toString �޼ҵ�)�� ������ ���̰� inform�� ���� ������ ���� �ʾƵ� �Ʒ�ó�� ���� �� ����
	// ������ Dog�� SnakeŬ�������� inform�޼ҵ带 ȣ�� �ϰ� �ֱ� ������ ���⼭�� �׳� ����
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age + " " + weight;
		// Animal�� �θ�Ŭ���� Object�� super�� �� �ȿ� �ִ� toString�̶�� �޼ҵ带 ����ϴ� ��
		// ������ �ּҰ��� ����ϴ� ���� ���� ������ �ʴ� ���̱� ������ �������̵� �ϰ� ����
		// �׷��� return �ڿ��� ���ϴ� inform�� ��� ���Ĵ�� ����
	}
}
