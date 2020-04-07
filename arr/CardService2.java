package com.jse.arr;

public class CardService2 {
	private CardBean2[] cards;
	private int count;
	
	public void setCardBean2(CardBean2[] cards) {
		this.cards = cards;
	}
	public CardBean2[] getCardBean2() {
		return cards;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getCount() {
		return count;
	}
	public CardService2() {
		cards = new CardBean2[3];
		count = 0;
	}
	public void add(CardBean2 cards) {
		this.cards[count] = cards;
		count++;
	}
	
}
