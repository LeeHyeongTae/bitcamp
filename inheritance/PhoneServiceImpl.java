package com.jse.inheritance;

public class PhoneServiceImpl implements PhoneService{
	private Phone[] phones;
	private CellPhone[] cellphones;
	private Iphone[] iphone;
	private GalaxyNote[] galaxyNote;
	private int count;
	
	public PhoneServiceImpl() {
		phones = new Phone[3];
		cellphones = new CellPhone[3];
		iphone = new Iphone[3];
		galaxyNote = new GalaxyNote[3];
		count = 0;
	}
	
	@Override
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	@Override
	public void add(CellPhone cellphone) {
		cellphones[count] = cellphone;
		count++;
	}
	@Override
	public void add(Iphone iphone) {
		this.iphone[count] = iphone;
		count++;
	}
	@Override
	public void add(GalaxyNote galaxyNote) {
		this.galaxyNote[count] = galaxyNote;
		count++;
	}
	
	@Override
	public int count() {
		return count;
	}

	@Override
	public Phone[] PhonesList() {
		return phones;
	}

	@Override
	public CellPhone[] CellphonesList() {
		return cellphones;
	}

	@Override
	public Iphone[] IphoneList() {
		return iphone;
	}
	
	@Override
	public GalaxyNote[] GalaxyNoteList() {
		return galaxyNote;
	}

	@Override
	public Phone phonedetail(Phone phone) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public CellPhone cellphonedetail(CellPhone cellphone) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Iphone iphonedetail(Iphone iphone) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public GalaxyNote galaxydetail(GalaxyNote galaxy) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void phoneUpdate(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cellphoneUpdate(CellPhone cellphone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void iphoneUpdate(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void galaxyUpdate(GalaxyNote galaxy) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void phoneDelete(Phone phone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void cellphoneDelete(CellPhone cellphone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void iphoneDelete(Iphone iphone) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void galaxyDelete(GalaxyNote galaxy) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String printPhone() {
		String message ="";
		for(int i=0; i<3; i++) {
		message += phones[i].toString();
		}
		return message;
	}
	@Override
	public String printCellPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String printIPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String printGalaxyNote() {
		// TODO Auto-generated method stub
		return null;
	}


}
