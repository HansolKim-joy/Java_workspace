package com.kh.example.chop06_method.model.vo;

public class Trainee {
	// 필드 선언
	private String name;
	private final String ACADEMY = "KH";
	private char classRoom;
	private static double score;

	public Trainee() {} //기본생성자
	public Trainee(String name) {
		this.name = name;
	}
	public Trainee(String name, char classRoom, double score) {
		this.name = name;
		this.classRoom = classRoom;
//		this.score = score; // static 영역에 있는 것이기 때문에 굳이 객체생성해서 하는 this를 할 필요가 없다.
		Trainee.score = score; // 클래스 이름명. 으로 해서 ?? - 어제 한 내용ㅠㅠ	
	}
	
	// 필드에 있는 name을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setName(String name) {
		// 위에가 setter를 설정?하는 모습
		this.name = name;
	}
	
	// 필드에 있는 classRoom을 받아온 매개변수를 통해 초기화 시키는 setter
	public void setClassRoom(char classRoom) {
		this.classRoom = classRoom;
	}
	
	
	// 필드에 있는 score를 받아온  매개변수를 통해 초기화 시키는 setter
	public static void setScore(double score) { //클래스(static)변수이기 때문에 static 해주는게 좋다
		Trainee.score = score;
	}
	
	// 필드에 있는 name을 반환하는 getter
	public String getName() {
		return name;
	}
	
	// 필드에 있는 ACADEMY을 반환하는 getter
	public String getACADEMY() {
		return ACADEMY;
	}
	
	// 필드에 있는 classRoom을 반환하는 getter
	public char getClassRoom() {
		return classRoom;
	}
	
	// 필드에 있는 score을 반환하는 getter
	public static double getScore() {
		return score;
	}
	
	
	
	
	public String inform() {
		return name + ", " + ACADEMY + ", " + classRoom + ", " + score;
	}
}
