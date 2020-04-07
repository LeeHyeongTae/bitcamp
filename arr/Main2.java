package com.jse.arr;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CardService2 cardService = new CardService2();
		while(true) {
			System.out.println("프로그램 시작, \n"
					+ "0.종료  1.카드 3장 입력  3.입력한 카드 출력");
			switch(scanner.nextInt()) {
			case 0: System.out.println("종료");return;
			case 1: 
				System.out.println("카드 3장 입력");
				for(int i=0; i<3; i++) {
				System.out.println(i+1+"카드무늬, 카드숫자 입력");
				cardService.add(new CardBean2(scanner.next(), scanner.nextInt()));
				}
				break;
			case 2: System.out.println("입력한 카드 출력");break;
			}
		}
	}

}
