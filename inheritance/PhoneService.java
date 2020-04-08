package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private CellPhone[] cellphones;
	private int count;
	
	public PhoneService() {
		cellphones = new CellPhone[5];
		phones = new Phone[5];
		count = 0;
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
	public void add(Phone phone) {
		phones[count] = phone;
		count++;
	}
	public void addCellphone(CellPhone cellphone) {
		cellphones[count] = cellphone;
		count++;
	}
}
