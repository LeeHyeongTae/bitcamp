package com.jse.inheritance;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CellPhone cellphone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxyNote);
	public GalaxyNote[] getGalaxyNote();
	public Iphone[] getIphone();
	public void setIphone(Iphone[] iphone);
	public CellPhone[] getCellphones();
	public void setCellphones(CellPhone[] cellphones);
	public void setPhones(Phone[] phones);
	public Phone[] getPhones();
	public int getCount();
	public void setCount(int count);
	public String printPhone();
	public String printCellPhone();
	public String printIPhone();
	public String printGalaxyNote();
	void setGalaxyNote(GalaxyNote[] galaxyNote);
}
