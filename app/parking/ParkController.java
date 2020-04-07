package org.des.parking;

import java.util.Scanner;

public class ParkController {
		private Service service;
		private Scanner kb; //키보드 입력처리
		//생성자 : public {클래스명ParkController}(){}
		public ParkController () {
			//생성시 필드 초기화 작업
			this.service = new Service();
			this.kb = new Scanner(System.in);//(키보드=system.in)안에는 실제로 입력을 받아오는 것을 써줘야함.
		}
		//주차요금 프로그램 앞단(사용자 입출력 제어)
		public void start() {
			System.out.println("::::주차장 영업중::::");
			boolean isExit = false;//true : 종료? false:계속? 정해야함.
			while(!isExit){
				String table = service.getTable();
				System.out.println(table);
				System.out.println("[1]입차 [2]출차 [0]종료 선택 > ");// 입차, 출차 경우 선택
			int menu = kb.nextInt(); //계속 입력을 받다보면종종 1. 타입미스매치 2.지나감
			// kb.nextLine(); 키보드를 비운다는 동작임.
			//선택에 따라 처리 기능 실행
			if(menu == 0) {
				isExit = true; //반복 멈춤
			}else {
				if(menu ==1) {//들어올때
					System.out.println("[IN]car number  >");
					String number = kb.nextLine();//키보드 행단위 전체를 입력받음.
					System.out.println("[IN] Time (00xx)  >");
					int timev = kb.nextInt();
					kb.nextLine();
					
					int index = service.input(number, timev);
					if(index == -1) {
						System.out.println("Full");//어디다?
					}
				}
				if(menu ==2) {//나갈때
					System.out.println("[OUT]car number >");
					String number = kb.nextLine();//키보드 행단위 전체를 입력받음.
					System.out.println("[OUT] Time (00xx)  >");
					int timev = kb.nextInt(); //라인을 정리해야 함.
					kb.nextLine();
					//서비스에게 시킬일. 1. 계산, 2. 비우기
					double price = service.output(number, timev);// 수학계산 실수가 편할 수있음.
					System.out.println("요금 : "+price);
				}
			 }//else end
			//결과출력
			} //while end
				end();
				System.out.println("::::주차장 영업끝::::");
		}
		
		public void end() {
			this.kb.close(); //키보드 닫기
			//프로그램이 종료될 때 뒷 정리
		}
}
