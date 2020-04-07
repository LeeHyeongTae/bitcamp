package com.jse.app;

public class Service {
/*
 * UpAndDownGame(1 ~ 10)
 * 1부터 10 사이의 난수를 맞추는 게임.
 * ##맞춰보자 업 아니면 다운!##
 * ~컴퓨터가 생각하는 숫자를 맞춰보세요~
 * 유저 입력 (1 ~ 10) 사이의 수
 * "입력하신 숫자는 %d 입니다."
 * 컴퓨터 난수 추출 (1 ~ 10)
 * 유저숫자와 컴퓨터숫자가 같으면, "정답!"
 * 유저숫자가 컴퓨터숫자보다 작으면, "좀 더 쓰시죠?"
 * 유저숫자가 컴퓨터숫자보다 크면, "적당히좀 하세요."
 * 	
 */
	private int userNum;
	private int compNum;
	
	public void setuserNum(int expect) {
		userNum = expect;
	}
	public int getuserNum() {
		return userNum;
	}
	public void setcompNum(int random) {
		compNum = random;
	}
	public int getcompNum() {
		return compNum;
	}
	public String UpAndDown() {
	
		String gameResult = "정답!";
		if(userNum>10) {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}else {
		if(userNum<compNum) {
			gameResult = "좀 더 쓰시죠?";
		}else if(userNum>compNum){
			gameResult = "적당히좀 하세요";
		}
		
		}
		return gameResult;
	
	
	}
}
