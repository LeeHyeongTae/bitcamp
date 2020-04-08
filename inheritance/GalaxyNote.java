package com.jse.inheritance;

public class GalaxyNote extends Iphone {
	public GalaxyNote(String phoneNumber, String name, String company, 
						String move, String search, String bigsize) {
		super(phoneNumber, name, company, move, search);
		this.bigSize = bigsize;
	}

	public String getBigSize() {
		return bigSize;
	}

	public void setBigSize(String bigSize) {
		this.bigSize = bigSize;
	}

	private String bigSize;
}
