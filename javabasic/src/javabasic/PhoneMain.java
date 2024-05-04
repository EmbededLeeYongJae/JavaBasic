package javabasic;

public class PhoneMain {

	public static void main(String[] args) {
		
		//Phone타입 객체 3개 생성
		Phone phone1 = new Phone();
		Phone.objCount++;
		Phone phone2 = new Phone();
		Phone.objCount++;
		Phone phone3 = new Phone();
		Phone.objCount++;
		
		
		
		//객체 데이터 설정
		phone1.name = "아이폰";
		phone1.brand = "애플";
		phone1.price = 200;
		
		phone2.name = "갤럭시";
		phone2.brand = "삼성";
		phone2.price = 150;
		
		phone3.name = "샤오미";
		phone3.brand = "샤오미";
		phone3.price = 100;
		
		//객체 데이터 출력
		System.out.println(phone1.name + "의 회사는 " +phone1.brand + "이고 가격은 " + phone1.price + "이다.");
		System.out.println(phone2.name + "의 회사는 " +phone2.brand + "이고 가격은 " + phone2.price + "이다.");
		System.out.println(phone3.name + "의 회사는 " +phone3.brand + "이고 가격은 " + phone3.price + "이다.");
		
		//객체 메소드 호출 
		phone1.call();
		phone1.message();
		phone1.camera();;
		
		phone2.call();
		phone2.message();
		phone2.camera();;
		
		phone3.call();
		phone3.message();
		phone3.camera();;
		
		
		//생성된 객체 수
		System.out.println("총" + Phone.objCount + "개의 객체 생성됨!");
		System.out.println("총" + Phone.getObjCount() + "개의 객체 생성됨!");
		
		
		
		
	}//main

}//class
