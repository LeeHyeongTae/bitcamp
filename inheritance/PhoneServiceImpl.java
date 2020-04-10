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
	public GalaxyNote[] getGalaxyNote() {
		return galaxyNote;
	}
	@Override
	public void setGalaxyNote(GalaxyNote[] galaxyNote) {
		this.galaxyNote = galaxyNote;
	}
	@Override
	public Iphone[] getIphone() {
		return iphone;
	}
	@Override
	public void setIphone(Iphone[] iphone) {
		this.iphone = iphone;
	}
	@Override
	public CellPhone[] getCellphones() {
		return cellphones;
	}
	@Override
	public void setCellphones(CellPhone[] cellphones) {
		this.cellphones = cellphones;
	}
	@Override
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	@Override
	public Phone[] getPhones() {
		return phones;
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
