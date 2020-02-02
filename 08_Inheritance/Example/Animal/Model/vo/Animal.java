package com.kh.example.animal.model.vo;

public class Animal {
	// - name : String
	// - age : int
	// - weight : double
	
	// + Animal()
	// + Animal(name : String, age : int, weight : double)
	
	// + getter/setter
	// + inform() : String
	//		반환 형식 : 이름 나이 몸무게
	
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
	
	// inform메소드와 override한것(toString 메소드)는 동일한 것이고 inform을 굳이 생성해 주지 않아도 아래처럼 만들 수 있음
	// 하지만 Dog와 Snake클래스에서 inform메소드를 호출 하고 있기 문에 여기서는 그냥 쓴다
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + age + " " + weight;
		// Animal의 부모클래스 Object가 super고 그 안에 있는 toString이라는 메소드를 사용하는 것
		// 하지만 주소값을 출력하는 것은 내가 원하지 않는 것이기 때문에 오버라이딩 하고 싶음
		// 그래서 return 뒤에를 원하는 inform의 기능 형식대로 만듬
	}
}
