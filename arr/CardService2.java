package com.jse.arr;

public class CardService2 {
	private CardBean2[] deck;
	private int count;
	
	public CardService2() {
		deck = new CardBean2[3];
		count = 0;
	}
	public void setCardBean2(CardBean2[] deck) {
		this.deck = deck;
	}
	public CardBean2[] getCardBean2() {
		return deck;
	}
	public void add(CardBean2 deck) {
		this.deck[count] = deck;
		count++;
	}
}
