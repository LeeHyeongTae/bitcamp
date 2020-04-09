package com.jse.card;

public interface CardService {

	public Card[] getCards();
	public void setCards(Card[] card);
	public int getCount();
	public void setCount(int count);
	public void add(Card card);
	public String printCards();

}
