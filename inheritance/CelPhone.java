package com.jse.inheritance;

public class CelPhone extends Phone {
	private boolean portable;
	private String move;
	
	public CelPhone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company); //Phone으로 저장된다.
		this.portable = portable;
	}
	
	public boolean isPortable() {
		return portable;
	}
	
	public void setPortable(boolean portable) {//출력 시 move를 가져와야 함. portable은 
		if(portable) {
			this.move = "휴대가능";
		}else {
			this.move = "휴대불능";
		}
	}

	public String getMove() {
		return move;
	}

	public void setMove(String move) {
		this.move = move;
	}
	
	
}
