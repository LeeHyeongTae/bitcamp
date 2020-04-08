package com.jse.inheritance;

public class CellPhone extends Phone {
	private boolean portable;
	private String move;
	
	public CellPhone(String phoneNumber, String name, String company, String move) {
		super(phoneNumber, name, company);
		this.move = move;//Phone으로 저장된다.	//boolean이 보이면 If else로 처리해야 한다.
		setMove(move);
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

	public void setMove(String move) {
		String y = "y";
		if(y.equals(move)) {
			this.portable = false;
		}else {
			this.portable = true;
		}
	}
	
	
}
