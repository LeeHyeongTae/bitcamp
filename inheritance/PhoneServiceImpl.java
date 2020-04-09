package com.jse.inheritance;

public class PhoneServiceImpl {
	private Phone[] phones;
	private CellPhone[] cellphones;
	private Iphone[] iphone;
	private GalaxyNote[] galaxyNote;
	private int count;
	
	public PhoneServiceImpl() {
		galaxyNote = new GalaxyNote[3];
		iphone = new Iphone[3];
		cellphones = new CellPhone[3];
		phones = new Phone[3];
		count = 0;
		}
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void add(CellPhone cellphone) {
		cellphones[count] = cellphone;
		count++;
	}
	public void add(Iphone iphone) {
		this.iphone[count] = iphone;
		count++;
	}
	public void add(GalaxyNote galaxyNote) {
		this.galaxyNote[count] = galaxyNote;
		count++;
	}
	
	public GalaxyNote[] getGalaxyNote() {
		return galaxyNote;
	}

	public void setGalaxyNote(GalaxyNote[] galaxyNote) {
		this.galaxyNote = galaxyNote;
	}

	public Iphone[] getIphone() {
		return iphone;
	}

	public void setIphone(Iphone[] iphone) {
		this.iphone = iphone;
	}

	public CellPhone[] getCellphones() {
		return cellphones;
	}
	public void setCellphones(CellPhone[] cellphones) {
		this.cellphones = cellphones;
	}
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	public Phone[] getPhones() {
		return phones;
	}
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
}
