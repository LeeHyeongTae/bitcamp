package com.jse.algorithm;

public class Sum1To5 {
	public static void main(String[] args) {
		sum2();
	}

//	static void sum() {
//		int sum = 0;
//		for(int i=1; i<=5; i++) {
//		//헤드가 공간을 잡아먹나? 잡아먹지 않는다. ()부분은 컨디션이기 때문에 바디 내의 메모리공간에 영향을 끼치지 않는다.	
//			System.out.println(i);
//			sum += i;
//		}
//		System.out.println(String.format(">>>>>>>>> %d", sum));
//	//overloading, overriding	
//	}
		
	static void sum2() {
		int sum2 = 0;
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			sum2 += i;
		}
		System.out.println(String.format("합 : ", sum2));
		
		
	}
}
