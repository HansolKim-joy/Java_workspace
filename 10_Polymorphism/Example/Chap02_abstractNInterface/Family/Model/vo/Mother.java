package com.kh.example.chap02_abstractNInterface.family.model.vo;

public class Mother extends Family implements Basic{
    // The type Mother must implement the inherited abstract method Family.sleep()
	// �߻�Ŭ���� Family���� �̿ϼ� �޼ҵ带 �ϼ����Ѿ� �Ѵٰ� ����ϴ� ����
	
	// - babyBirth : String
	
	// + Mother()
	// + mOTHER(name : String, weight : double, health : int, babyBirth : String)
	
	// + getter/ setter
	// + toString() : String
	
	private String babyBirth;
	
	public Mother() {}
	public Mother(String name, double weight, int health, String babyBirth) {
		super(name, weight, health);
		this.babyBirth = babyBirth;
	}
	
	public String getBabyBirth() {
		return babyBirth;
	}
	
	public void setBabyBirty(String babyBirty) {
		this.babyBirth = babyBirth;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "mother : " + super.toString() + " " + babyBirth;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.setWeight(super.getWeight() + 10);
		super.setHealth(super.getHealth() - 5);
		
	}
	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		super.setHealth(super.getHealth() + 10);
	}
}
