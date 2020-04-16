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
		this.phones[count] = phone;
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
	public Phone[] phonesList() {
		return phones;
	}


	@Override
	public Iphone[] iphoneList() {
		return iphone;
	}
	
	@Override
	public GalaxyNote[] galaxyNoteList() {
		return galaxyNote;
	}


	
	@Override
	public void phoneUpdate(Phone phone) {
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
	public String printIPhone() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String printGalaxyNote() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Phone detail(Phone phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iphone detail(Iphone iphone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public GalaxyNote detail(GalaxyNote galaxy) {
		// TODO Auto-generated method stub
		return null;
	}


}
