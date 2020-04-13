package com.jse.inheritance;
import com.jse.util.Constants;
import javax.swing.JOptionPane;

public class PhoneController {
	
	public static void main(String[] args) {
		
		PhoneServiceImpl phoneService = new PhoneServiceImpl();
		Phone phone = null;
		while(true) {
			switch(JOptionPane.showInputDialog(Constants.MENU)) {
			case "0": return;
			case "1":
					for(int i=0; i<3; i++) {
					String[] values = JOptionPane.showInputDialog(Constants.PHONE_MENU).split(",");
					phone = new Phone(null, null, null);
					phone.setPhoneNumber(values[0]);
					phone.setName(values[1]);
					phone.setCompany(values[2]);
					phoneService.add(phone);
					}
					break;
			
			case "2": JOptionPane.showMessageDialog(null, phoneService.getPhones());
					break;
//			case "3": 
//					for(int i=0; i<3; i++) {
//						String[] values = JOptionPane.showInputDialog(Constants.CELLPHONE_MENU).split(",");
//						phoneService.add(new CellPhone(values[0], values[1], values[2], values[3]));
//					}
//					break;
//			case "4": 
//					CellPhone[] cellPhones = phoneService.getCellphones();
//					message ="";
//					for(int i=0; i<3; i++) {
//						message += cellPhones[i].toString();
//					}
//				JOptionPane.showMessageDialog(null, message);
//				break;
//			case "5": 
//				for(int i=0; i<3; i++) {
//				String[] values = JOptionPane.showInputDialog(Constants.IPHONE_MENU).split(",");
//				phoneService.add(new Iphone(values[0], values[1], values[2], values[3], values[4]));
//				}
//				break;
//			case "6": 
//				Iphone[] iPhones = phoneService.getIphone();
//				message ="";
//				for(int i=0; i<3; i++) {
//				message += iPhones[i].toString(); 
//						}
//				JOptionPane.showMessageDialog(null, message);
//				break;
//			case "7": 
//				for(int i=0; i<3; i++) {
//				String[] values = JOptionPane.showInputDialog(Constants.GALAXY_MENU).split(",");
//				phoneService.add(new GalaxyNote(values[0], values[1], values[2], values[3], values[4], values[5]));
//				}
//				break;
//			case "8": 
//				GalaxyNote[] galaxyNotes = phoneService.getGalaxyNote();
//				message ="";
//				for(int i=0; i<3; i++) {
//				message += galaxyNotes[i].toString();
//				}
//				JOptionPane.showMessageDialog(null, message);
//				break;
//			
			}
		}

	}

}
