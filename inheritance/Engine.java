package com.jse.inheritance;

import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		
		PhoneService phoneService = new PhoneService();
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog("0.종료   1.집전화 입력  2.폰전화 입력")) {
			case "0": return;
			case "1":
				
					for(int i=0; i<5; i++) {
						String[] values = JOptionPane.showInputDialog("입력 전화번호, 이름, 제조사").split(",");
						phoneService.add(new Phone(values[0], values[1], values[2]));
					}
					break;
			
			case "2":
					Phone[] phones = phoneService.getPhones();
					String message ="";
					for(int i=0; i<5; i++) {
						message += String.format("[%s %s %s]\n", 
								phones[i].getPhoneNumber(), phones[i].getName(), phones[i].getCompany());
					}
					JOptionPane.showMessageDialog(null, message);
					break;
			}
		}

	}

}
