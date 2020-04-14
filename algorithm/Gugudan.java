package com.jse.algorithm;


public class Gugudan {
	
	public static void main(String[] args) {
		for(int i =1; i<10; i++) {
			for(int dan = 2; dan<6; dan++) {
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
		for(int i =1; i<10; i++) {
			for(int dan = 6; dan<10; dan++) {
				System.out.print(dan+"x"+i+"="+dan*i+"\t");
			}
			System.out.println();
		}
		
	}
}