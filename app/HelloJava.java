package com.jse.app; //보라색 기능어, 예약어, 명사와 기능어로 나눠놓았다.
//이름이 아닌 것은 기능어가 되고. package는 여러개의 class를 포함 가능.
import java.util.Scanner;
public class HelloJava {//대표 class는 오직 하나만 가능함. {}block 안은 body
	public static void main(String[] args) {//소문자는 폴더이나, 클래스 안에 폴더가 존재 할 수 없음. 새로운 개념 method. class는 method를 여러개 포함 가능.
		Scanner scanner = new Scanner(System.in); // Scanner 클래스 scanner 인스턴스
	//  클래스        인스턴스 변수     기능어  클래스         클래스     변수
		System.out.println("이름이 뭐에요 ?");// 인자값 "이름이 뭐에요"
	//  클래스     변수    메소드
		String name = scanner.next(); // assign 없으면 static 변수 local 변수다
	//  클래스      인스턴스변수  변수        인스턴스메소드
		System.out.println("안녕하세요, "+name+"씨.");
		System.out.println("어디사세요 ?");
		String where = scanner.next(); //implicited
		System.out.println(where +"이라니 좋은데 사시네요.");//class는 내장된 것과 호출해야 하는 것으로 나뉜다.
		System.out.println("몇 살이에요?");
		int age = scanner.nextInt(); // Integer
	// 로컬변수
		System.out.println(age+"살 이시군요.");
		System.out.println("키는 몇이고, 몸무게는  몇 kg입니까?");
		double heigt = scanner.nextFloat();//float는 작은 실수, double은 큰 실수
		double weight = scanner.nextDouble();//요즘은 double이 디폴트값이다.
		System.out.println("혈액형이 뭐에요?");
		char bloodType = scanner.next().charAt(0);
	
	}
}
