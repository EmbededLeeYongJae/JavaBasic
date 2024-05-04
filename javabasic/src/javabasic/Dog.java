package javabasic;

public class Dog {

	String name;
	int age;
	String color;
	
	
	Dog(){							//기본생성자
		
	}
	
	Dog(String name){				// 1개짜리 생성자
		this.name = name;
	}
	
	Dog(String name, int age){		//2개짜리 생성자
		this.name = name;
		this.age = age;
	}
	
	Dog(String name, int age, String color){
		this.name = name;
		this.age = age;
		this.color = color;
		
	}
	
	
	@Override
	public String toString() {
		return this.name + "은 " + this.age + "살이고 " + this.color + "색 입니다.";
	}
	
	
	
}
