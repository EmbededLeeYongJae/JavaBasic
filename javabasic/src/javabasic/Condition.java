package javabasic;

import java.util.Scanner;

public class Condition {
	public static void main(String[] args) {
		
		int i = 15;
		
		if(i<10) {
			System.out.println("i가 10보다 작습니다.");
		}else if (i==15) {
			System.out.println("i가 15입니다.");
		}else {
			System.out.println("i가 10보다 작지않고 15가 아닙니다!");
		}
			
			
			int j = 1;
			
			switch(j) {
			
			case 1 : System.out.println("남성입니다!"); break;
			case 2 : System.out.println("여성입니다!"); break; default:
				System.out.println("남성도 여성도 아닙니다!");
			}
			
			if(j==1) {
				System.out.println("남성입니다!");
			}else if(j==2) {
				System.out.println("여성입니다!");
			}else {
				System.out.println("남성도 여성도 아닙니다!");
			}
			
			
			//실습 1)
			//두개의 int 변수를 만들어 각각 5와 10의 값을 대입하고
			//두 변수의 합을 sum이라는 byte변수에 저장한 후
			//값이 10보다 큰지 비교하여 출력
			
			int a = 5;
			int b = 10;
			
			byte sum = (byte)(a+b);
			
			if(sum>10) {
				System.out.println("sum이 10보다 크다.");
			}else {
				System.out.println("sum이 10보다 크지않다.");
			}
			
			//실습 2)
			// num3이라는 int변수에는 5를 대입하고
			// num4이라는 int변수에는 10을 대입하고
			// sum2에는 int변수에는 두 변수의 합을 대입하고
			// mul에는 int변수에는 두 변수의 곱을 대입하고
			// 두 변수의 곱에서 두 변수의 합을 뺀 값을 result라는 short변수에 저장 
			// result가 0~10사이에 있는지, 11~20사이에 있는지, 
			// 21에서 30사이에 있는지, 31~40사이에 있는지 출력

			int num3 = 5;
			int num4 = 10;
			int sum2 = num3+num4;
			int mul = num3*num4;
			short result = (short)(mul - sum2);
			
			if(result>=0 && result<=10) {
				System.out.println("result값은 0~10사이에 있다.");
							
			}else if (result>=11 && result<=20) {
				System.out.println("result값은 11~20사이에 있다.");
			}else if (result>=21 && result<=30) {
				System.out.println("result값은 21~30사이에 있다.");
			}else if(result>=31 && result<=40) {
				System.out.println("result값은 31~40사이에 있다.");
			}
			
			// 실습3)
			// 키보드에서 숫자를 하나 입력받아서 입력받은 숫자를 5로 나눈 나머지를 출력
			
//			Scanner scanner = new Scanner(System.in);
//			int remain = scanner.nextInt();
//			System.out.println(remain + "를 5로 나눈 나머지는" + remain%5 + "입니다.");
			
			
			// 실습4)
			//키보드에서 숫자를 두 개 입력받아서 입력받은 두 수의 합을 출력
			
//			Scanner scanner2 = new Scanner(System.in);
//			int num5 = scanner2.nextInt();
//			int num6 = scanner2.nextInt();
//			System.out.println("입력받은 두 수의 합은"+ (num5+num6)+"입니다.");
			
			
			// 실습5)
			// 키보드에서 0~6까지의 숫자를 입력받아서 0이면 일요일, 1이면 월요일...출력
			
			Scanner scanner3 = new Scanner(System.in);
			int num7 = scanner3.nextInt();
			switch(num7) {
			case 0 : System.out.println("일요일!"); break;
			case 1 : System.out.println("월요일!"); break;
			case 2 : System.out.println("화요일!"); break;
			case 3 : System.out.println("수요일!"); break;
			case 4 : System.out.println("목요일!"); break;
			case 5 : System.out.println("금요일!"); break;
			case 6 : System.out.println("토요일!");
			
			}
	

	}//main
}//class
