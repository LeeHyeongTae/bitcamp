package com.jse.card;

import javax.swing.JOptionPane;

import com.jse.util.Constants;

public class CardController {
	
	public static void main(String[] args) {

		CardServiceImpl cardservice = new CardServiceImpl();
		Card card = null;
		while(true) {
			
			switch(JOptionPane.showInputDialog(Constants.CARD_MENU)) {
			case "0": return;
			case "1": System.out.println("카드 3장 받기");
			for(int i=0; i<3; i++) {
				String[] cards = JOptionPane.showInputDialog("카드무늬, 카드넘버 입력").split(",");
				card = new Card();
				card.setKind(cards[0]);
				card.setNumber(Integer.parseInt(cards[1]));
				cardservice.add(card);
			}
			break;
			case "2": 
				JOptionPane.showMessageDialog(null, cardservice.printCards());

			
			break;
			}
		}
	}

}
