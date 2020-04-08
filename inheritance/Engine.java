package com.jse.inheritance;

import java.util.Scanner;

public class Engine {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PhoneService phoneService = new PhoneService();
		while(true) {
			System.out.println("0.종료   1.폰번호 입력  2.폰번호 출력");
			switch(scanner.nextInt()) {
			case 0:System.out.println("종료"); return;
			case 1:
					System.out.println("폰 번호 입력");
					for(int i=0; i<5; i++) {
						System.out.println("전화번호, 이름, 제조사 입력");
						phoneService.add(new Phone(scanner.next(), scanner.next(), scanner.next()));
					}
					break;
			
			case 2:System.out.println("폰 번호 출력");
					for(int i=0; i<5; i++) {
						Phone[] phones = phoneService.getPhones();
						System.out.println(String.format("[%s %s %s]", phones[i].getPhoneNumber(), phones[i].getName(), phones[i].getCompany()));
					}
					break;
			}
		}

	}

}
