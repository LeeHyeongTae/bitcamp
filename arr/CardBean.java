package com.jse.arr;

public class CardBean {
	private String kind;
	private int number;
	public CardBean(String setKind, int setNumber) {
		this.kind = setKind;
		this.number = setNumber;
		// TODO Auto-generated constructor stub
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
