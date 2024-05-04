package javabasic;

public class Phone {
	
	static int objCount = 0; // static은 초기화 해주는 것이 좋다.
		
	String name;   //""로 자동 초기화
	String brand;  //""로 자동 초기화
	int price;     //0으로 자동 초기화
	
	static int getObjCount() {
		return objCount;
	}
	
	void call() {
		System.out.println(this.name + "(으)로 전화한다.");
	}
	
	void message() {
		System.out.println(this.name + "(으)로 문자를 보낸다.");
	}
	
	void camera() {
		System.out.println(this.name + "(으)로 사진을 찍는다.");
	}
	
	
	
	
	
}
