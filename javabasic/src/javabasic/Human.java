package javabasic;

public class Human {

	private String name;
	private int age;

	Human(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age + 15;
	}

	public void setAge(int age) {
		this.age = age;
	}

//	// getter(get + 대문자 시작 변수명)
//	public String getName() {
//		return name;
//	}
//	
//	// setter(set + 대문자 시작 변수명)
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	// age getter/setter 만들어보자 
//	
//	//getter
//	public int getAge() {
//		return age;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}

}
