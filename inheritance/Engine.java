package com.jse.inheritance;

import javax.swing.JOptionPane;

public class Engine {

	public static void main(String[] args) {
		
		PhoneService phoneService = new PhoneService();
		String message ="";
		
		while(true) {
			System.out.println();
			switch(JOptionPane.showInputDialog("0.종료\t 1.집전화 입력\t 2.집전화 출력\t 3.휴대전화입력\t 4.휴대전화출력\n"
					+ "5.아이폰 입력\t 6.아이폰출력\t 7.갤럭시입력\t 8. 갤럭시출력")) {
			case "0": return;
			case "1":
					for(int i=0; i<5; i++) {
					String[] values = JOptionPane.showInputDialog("입력: 전화번호, 이름, 제조사").split(",");
					phoneService.add(new Phone(values[0], values[1], values[2]));
					}
					break;
			
			case "2":
					Phone[] phones = phoneService.getPhones();
					for(int i=0; i<5; i++) {
					message += String.format("[%s %s %s]\n", 
					phones[i].getPhoneNumber(), phones[i].getName(), phones[i].getCompany());
					}
					JOptionPane.showMessageDialog(null, message);
					break;
			case "3": 
				for(int i=0; i<5; i++) {
				String[] values = JOptionPane.showInputDialog("입력: 전화번호, 이름, 제조사, 휴대폰(y/n)").split(",");
				phoneService.add(new CellPhone(values[0], values[1], values[2], values[3]));
				}
				break;
			case "4": 
				CellPhone[] cellPhones = phoneService.getCellphones();
				message ="";
				for(int i=0; i<5; i++) {
				message += String.format("[%s %s %s %s]\n", 
										cellPhones[i].getPhoneNumber(), cellPhones[i].getName(), cellPhones[i].getCompany(), cellPhones[i].getMove());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "5": 
				for(int i=0; i<5; i++) {
				String[] values = JOptionPane.showInputDialog("입력: 전화번호, 이름, 제조사, 휴대폰(y/n), 검색가능(y/n)").split(",");
				phoneService.add(new Iphone(values[0], values[1], values[2], values[3], values[4]));
				}
				break;
			case "6": 
				Iphone[] iPhones = phoneService.getIphone();
				message ="";
				for(int i=0; i<5; i++) {
				message += String.format("[%s %s %s %s %s]\n", 
										iPhones[i].getPhoneNumber(), iPhones[i].getName(), 
										iPhones[i].getCompany(), iPhones[i].getMove(), iPhones[i].getSearch());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			case "7": 
				for(int i=0; i<5; i++) {
				String[] values = JOptionPane.showInputDialog("입력: 전화번호, 이름, 제조사, 휴대폰(y/n), 검색가능(y/n), bigsize").split(",");
				phoneService.add(new GalaxyNote(values[0], values[1], values[2], values[3], values[4], values[5]));
				}
				break;
			case "8": 
				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNote();
				message ="";
				for(int i=0; i<5; i++) {
				message += String.format("[%s %s %s %s %s %s]\n", 
						galaxyNotes[i].getPhoneNumber(), galaxyNotes[i].getName(), 
						galaxyNotes[i].getCompany(), galaxyNotes[i].getMove(), 
						galaxyNotes[i].getSearch(), galaxyNotes[i].getBigSize());
				}
				JOptionPane.showMessageDialog(null, message);
				break;
			
			}
		}

	}

}
