package com.jse.inheritance;

public interface PhoneService {
	public void add(Phone phone);
	public void add(CellPhone cellphone);
	public void add(Iphone iphone);
	public void add(GalaxyNote galaxyNote);
	
	public int count();
	public Phone[] PhonesList();
	public CellPhone[] CellphonesList();
	public Iphone[] IphoneList();
	public GalaxyNote[] GalaxyNoteList();
	
	public Phone phonedetail(Phone phone);
	public CellPhone cellphonedetail(CellPhone cellphone);
	public Iphone iphonedetail(Iphone iphone);
	public GalaxyNote galaxydetail(GalaxyNote galaxy);
	
	public void phoneUpdate(Phone phone);
	public void cellphoneUpdate(CellPhone cellphone);
	public void iphoneUpdate(Iphone iphone);
	public void galaxyUpdate(GalaxyNote galaxy);
	
	public void phoneDelete(Phone phone);
	public void cellphoneDelete(CellPhone cellphone);
	public void iphoneDelete(Iphone iphone);
	public void galaxyDelete(GalaxyNote galaxy);
	

	public String printPhone();
	public String printCellPhone();
	public String printIPhone();
	public String printGalaxyNote();
}
