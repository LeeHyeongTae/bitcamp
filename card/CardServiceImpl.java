package com.jse.card;

public class CardServiceImpl implements CardService {
	private Card[] cards;
	private int count;
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0;
	}
	@Override
	public Card[] getCards() {
		return cards;
	}
	@Override
	public void setCards(Card[] card) {
		this.cards = card;
	}
	@Override
	public int getCount() {
		return count;
	}
	@Override
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	public void add(Card card) {
		cards[count] = card;
		count++;
	}
	@Override
	public String printCards() {
		String result ="";
		for(int i=0; i<3; i++) {
			result += String.format("카드무늬:%s, 카드숫자:%s\n", 
					cards[i].getKind(),
					cards[i].getNumber());
		}
		return result;
	}
}
