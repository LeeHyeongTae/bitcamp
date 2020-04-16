package com.jse.card;

public class CardServiceImpl implements CardService {
	private Card[] cards;
	private int count;
	public CardServiceImpl() {
		cards = new Card[3];
		count = 0;
	}

	@Override
	public void add(Card card) {
		cards[count] = card;
		count++;
	}
	
	@Override
	public Card[] list() {
		return cards;
	}
	
	@Override
	public Card detail(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return count;
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


	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub
		
	}
}
