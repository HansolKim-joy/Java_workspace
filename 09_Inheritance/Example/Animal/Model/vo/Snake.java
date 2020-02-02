package com.kh.example.animal.model.vo;

public class Snake extends Animal{
	// - name : String
	// - age : int
	// - weight : double
	// - pattern : String
	
	// + Snake()
	// + Snake(name : String, age : int, weight : double, pattern : String)
	
	// + getter/setter
	// + inform() : String
	//		馆券 屈侥 : 捞抚 唱捞 个公霸 公刺
	
	private String pattern;
	
	public Snake() {}
	public Snake(String name, int age, double weight, String pattern) {
		super(name, age, weight);
		this.pattern = pattern;
	}
	
	public String getPattern() {
		return pattern;
	}
	
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	
//	public String inform() {
//		return super.inform() + " " + pattern;
//	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.inform() + " " + pattern;
	}
}
