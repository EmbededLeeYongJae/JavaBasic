package javabasic;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		System.out.println(dog1);
		
		Dog dog2 = new Dog("진돗개");
		System.out.println(dog2);
		
		Dog dog3 = new Dog("진돗개",10);
		System.out.println(dog3);
		
		Dog dog4 = new Dog("진돗개",10,"흰");
		System.out.println(dog4);
		
		Dog dog5 = new Dog("똥개", 15, "빨간");
		System.out.println(dog5);
				
	}//main

}//class

