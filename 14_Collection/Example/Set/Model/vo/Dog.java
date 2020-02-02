package com.kh.example.set.model.vo;

public class Dog implements Comparable<Dog> {
	// - name : String
	// - weight : double
	
	// + 기본생성자
	// + 매개변수 있는 생성자(모두)
	
	// + getter/ setter
	// + toString() : String
	
	private String name;
	private double weight;
	
	public Dog() {}
	public Dog(String name, double weight) {
		this.name = name;
		this.weight = weight;
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
	
	@Override
	public String toString() {
		return name + "(" + weight + "kg)";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int)weight;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()) {
			return false;
		}
		
		Dog other = (Dog)obj;
		
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		
		if(weight != other.weight) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Dog o) {
		// 이름에 대해서 오름차순(내림차순)
		String otherName = o.getName();
		
		return /*(-)*/name.compareTo(otherName);
	}
	
//	@Override // Comparable에 제네릭이 없이 한 경우
//	public int compareTo(Object arg0) {
//		return 0;
//	}
}
