package javabasic;

public class LoofExer {
	public static void main(String[] args) {
		
	
	
	// 별찍기 1
//	*
//	**
//	***
//	****
//	*****
//	for(int i = 0; i < 5; i++) {
//		for(int j = 0; j <= i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	
	
	// 별찍기 2
	// *
	// **
	// ***
	// ****
	// *****
	// o공백의 수
//	for(int i = 0 ; i<5; i++) {
//		for(int k = 0; k <4-i; k++) {
//			System.out.print("o");					
//		}
//		for(int j = 0;  j <= i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}

	// 별찍기 3
	// *****
	// ****
	// ***
	// **
	// *
//	for(int i = 5; i > 0; i--) {
//		for(int j = 0; j < i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}

	// 별찍기 4
	// *****
	// *   *
	// *   *
	// *   *
	// *****

//	for(int i = 0 ; i<5; i++) {
//		for(int j = 0;  j < 5; j++) {
//			if(i%4 == 0||j%4==0) {
//				System.out.print("*");		
//			}else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();
//	}
//	

//	for(int i = 0;i <5; i++) {
//	if(i%4 ==0) {
//		System.out.println("*****");
//	}else {
//		System.out.println("*   *");
//	}
//	

	// 별찍기 5
	// *****
	// ** **
	// * * *
	// ** **
	// *****

//	for(int i = 0 ; i<5; i++) {
//		for(int j = 0;  j < 5; j++) {
//			if(i==j) {
//				System.out.print("*");		
//			}else if(i*j==2||i*j==6) {
//				System.out.print(" ");
//			}else {
//				System.out.print("*");	
//			}
//		}
//		System.out.println();
//	}

	// 별찍기 6
	// *****
	//    *
	//   *
	//  *
	// *****

//	int keynum = 4;
//	for (int i = 0; i < keynum + 1; i++) {
//		for (int j = 0; j < keynum + 1; j++) {
//			if (i % keynum == 0  ||  i + j == keynum) {
//				System.out.print("*");
//			} else {
//				System.out.print(" ");
//			}
//		}
//		System.out.println();			
//	}

	// 별찍기 7 (H)
	// *   *
	// *   *
	// *****
	// *   *
	// *   *
	
//	int keynum = 4;
//	for(int i = 0 ; i<keynum +1 ; i++) {
//	for(int j = 0;  j < keynum +1 ; j++) {
//		if(j % keynum == 0 || i == keynum/2) {
//			System.out.print("*");		
//		}else {
//			System.out.print(" ");
//		}
//	}
//	System.out.println();
//}
//
//	
	// 별찍기 8 (다이아몬드)
	//   *
	//  ***
	// *****
	//  ***
	//   *
	//1. 행(i)의수 
	//2. 공백의 수
	//3. 별의 수
		
		
	int keynum = 4;
	int mid = keynum / 2;
	
	for(int i = 0 ; i < keynum +1; i++) {
		for(int j = 0;  j < keynum +1 ; j++) {
		if(i  == mid || j == mid || (i*j) % mid == 1 ) {
			System.out.print("*");		
		}else {
			System.out.print(" ");
		}
	}
	System.out.println();
}
	

	
	
	
	}// main

}//class
