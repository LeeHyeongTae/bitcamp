package com.jse.inheritance;

import java.util.Scanner;

public class Must {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("0.종료  1.go");
			switch(scanner.nextInt()) {
			case 0:System.out.println("종료"); return;
			case 1:System.out.println("go");break;
			}
		}

	}

}
