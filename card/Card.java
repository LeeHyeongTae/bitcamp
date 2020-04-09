package com.jse.card;

public class Card {//카드 한장을 입력 (카드 생성)
	private String kind;
	private int number;
	public Card(String setKind, int setNumber) {//카드 한장의 정보를 주입
		this.kind = setKind;
		this.number = setNumber;
	}
	public void setKind(String setKind) {
		this.kind = setKind;
	}
	public String getKind() {
		return kind;
	}
	public void setNumber(int setNumber) {
		this.number = setNumber;
	}
	public int getNumber() {
		return number;
	}
}
