package com.jse.inheritance;

import lombok.Data;

@Data
public class Phone {
	private String phoneNumber, name, company;
		
}


class CellPhone extends Phone {
	private boolean portable;
	private String move;
	
	public CellPhone(String phoneNumber, String name, String company, String move) {
		super(phoneNumber, name, company);
//		this.move = move;//Phone으로 저장된다.	//boolean이 보이면 If else로 처리해야 한다.
//		setPortalbe(move);
	}
	
	public boolean isPortable() {
		return portable;
	}
	
	public void setPortable(boolean portable) {//출력 시 move를 가져와야 함. portable은 
		this.portable = portable;
	}

	public String getMove() {
		return move;
	}

	public void setMove(int portable) {
		this.move = (portable==0) ? "휴대불가능" : "휴대가능";
	}
	@Override
	public String toString() {
	
		return super.toString() +"휴대 :"+ move;
	}
	
}



class Iphone extends CellPhone {

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
	@Override
	public String toString() {
		return super.toString() + ", search = "+ search;
	}
}


class GalaxyNote extends Iphone {
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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "bigSize :"+ bigSize;
	}
}