package com.jse.inheritance;

public class Iphone extends CellPhone {

	private String search;

	public Iphone(String phoneNumber, String name, String company, String move, String search) {
		super(phoneNumber, name, company, move);
		this.search = search;
	}

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

}
