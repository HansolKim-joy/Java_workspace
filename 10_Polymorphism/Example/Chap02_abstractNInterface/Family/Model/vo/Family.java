package com.kh.example.chap02_abstractNInterface.family.model.vo;

public abstract class Family {
	// - name : String
	// - weight : double
	// - health : int
	
	// + Family()
	// + Family(name : String, weight : double, health : int)
	
	// + getter/ setter
	// + toString() : String
	
	private String name;
	private double weight;
	private int health;
	
	public Family() {}
	public Family(String name, double weight, int health) {
		this.name = name;
		this.weight = weight;
		this.health = health;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getHealth() {
		return health;
	}
	
	public void setHealth(int health) {
		this.health = health;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " " + weight + " " + health;
	}
//	
//	public abstract void eat(); // abstract 붙은 추상 메소드 - 몸통이 없기 때문에 {}말고 ;으로 종결
//	//The abstract method eat in type Family can only be defined by an abstract class
//	// 추상클래스로 정의되어야만 한다는 에러
//	
//	public abstract void sleep(); // 
}
