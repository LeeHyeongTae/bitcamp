package com.jse.card;

public class CardService {
	private int count;
	private Card[] cards;
	public CardService() {
		cards = new Card[3];
		count = 0;
	}

	public Card[] getCards() {
		return cards;
	}

	public void setCards(Card[] card) {
		this.cards = card;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public void add(Card card) {
		cards[count] = card;
		count++;
	}
}
