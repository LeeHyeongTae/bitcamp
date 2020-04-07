package com.jse.arr;

public class CardService {
	private int count;
	private CardBean[] cards;
	public CardService() {
		cards = new CardBean[3];
		count = 0;
	}

	public CardBean[] getCards() {
		return cards;
	}

	public void setCards(CardBean[] card) {
		this.cards = card;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void add(CardBean card) {
		cards[count] = card;
		count++;
	}
}
