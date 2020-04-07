package com.jse.app;

public class RPS {
	private int playerNum;
	private int comNum;
	
	public void setPlay(int playnumber) {
		playerNum = playnumber;
	}
	public int getPlay() {
		return playerNum;
	}
	public void setCom(int comnumber) {
		comNum = comnumber;
	}
	public int getCom() {
		return comNum;
	}
	
	public String game() {
		String userresult="보";
		switch(playerNum) {
		case 1: userresult = "가위";
			break;
		case 2: userresult = "바위"; 
			break;
		}
		String comresult = "보";
		switch(comNum) {
		case 1: comresult = "가위";
			break;
		case 2: comresult = "바위"; 
			break;
		}
		String gameresult = "사용자 우승!";
		if(playerNum==comNum) {
			gameresult = "무승부";		
		}else if(playerNum - comNum<0) {
			gameresult = "아쉽게 졌네요";
		}
		return "Player는 "+userresult+" Com는 "+comresult+"  따라서, "+gameresult;
	}
}
