package com.jse.inheritance;

public interface PhoneService {
	public void add(Phone phone);
	public void add(Iphone iphone); //편의성을 위해 파라미터에 의해서 오버로딩 허용
	public void add(GalaxyNote galaxyNote);
	
	public int count();
	public Phone[] phonesList();
	public Iphone[] iphoneList();
	public GalaxyNote[] galaxyNoteList();
	
	public Phone detail(Phone phone);
	public Iphone detail(Iphone iphone);
	public GalaxyNote detail(GalaxyNote galaxy);
	
	public void phoneUpdate(Phone phone);
	public void iphoneUpdate(Iphone iphone);
	public void galaxyUpdate(GalaxyNote galaxy);
	
	public void phoneDelete(Phone phone);
	public void iphoneDelete(Iphone iphone);
	public void galaxyDelete(GalaxyNote galaxy);
	

	public String printPhone();
	public String printIPhone();
	public String printGalaxyNote();
}
