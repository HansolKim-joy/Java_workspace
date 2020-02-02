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
		return name + "(" + score + "점)";
	}
	
	@Override
	public int hashCode() { // 재정의 방법 여러가지임 => 그 중 이클립스에서 기본적으로 재정의 하는 방법을 사용할 것임
		final int prime = 31; // ?? 31은 컴퓨터가 인지할 때 적당히 크면서 계산하기 편한 숫자 => 큰 의미 없음
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode()); // String 형식일때
		result = prime * result + score; // 기본 자료형일때
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { // 마찬가지로 재정의 방법 여러가지임 => 그 중 이것을 사용한 것임
		if(this == obj) { // this 나 자신을 가리키는 주소값 
			return true; // 나 자신의 주소값과 그 객체의 주소값이 같다면 같은 것이기때문에 true를 반환
		}
		if(obj == null) {
			return false; // obj가  null이면 나와 같을 수 없으므로 false를 반환
		}
		if(getClass() != obj.getClass()) { // getClass() : 내 클래스에 대한 정보를 갖고 있는 메소드 \
			return false; // 내 클래스에 대한 정보와 obj의 정보가 다르다고 하면 false를 반환
		}
		// 여기까지가 객체 자체를 비교 한것 (주소값, 클래스 정보로 비교 )
		// 이젠 필드(Student에서는 name과 score 존재)에 대한 비교 필요
		Student other = (Student)obj; // 나는 나고 매개변수로 들어온 것을 other로 본다
		
		// String 일때
		if(name == null) {
			if(other.name != null) {
				return false;
			}
		}else if(!name.equals(other.name)) {
			return false;
		}
		
		// 기본 자료형 일때
		if(score != other.score) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public int compareTo(Student o) {
		// 이름에 대해서 오름차순 정렬
		// 이름 : String			
		// ==> String에 대해서 오름차순 정렬
		
		String otherName = o.getName(); // 이미 String에는 오름차순으로 정리하는 기준이 있기 때문에 
		
		/*
		 	compareTo의 반환 값 : int
		 	비교 주체가 비교 대상과 같으면 0을 반환 (하도록 되어있고)
		 	비교 주체가 비교 대상보다 크면 1을 반환 (하도록 되어있고)
		 	비교 주체가 비교 대상보다 작으면 -1을 반환 (하도록 되어있음)
		 */
		
		return name.compareTo(otherName);
//		return -name.compareTo(otherName); // => 반환값만 달라지게 하면 되니까 이렇게 하면 내림차순으로 정리됨
	}
}
