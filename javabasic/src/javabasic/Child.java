package javabasic;

public class Child extends Parent{

		
	String name;
	int age;
	String job;
	
	Child(String name, int age, String job){
//		super(name, age, job); // 원래 있어야하지만 컴파일러가 자동으로 넣어준다.
		this.name = name;
		this.age = age;
		this.job = job;
		
	}
	
	@Override
	void say() {
		System.out.println("자식이 말했다!");
	}
	
}//class
