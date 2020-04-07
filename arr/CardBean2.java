package com.jse.arr;

public class CardBean2 {
	private String cardPattern;
	private int cardNumber;
	
	public void setCardPattern(String cardPattern) {
		this.cardPattern = cardPattern;
	}
	public String getCardPattern() {
		return cardPattern;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public CardBean2(String cardPattern, int cardNumber) {
		this.cardPattern = cardPattern;
		this.cardNumber = cardNumber;
	}
}
