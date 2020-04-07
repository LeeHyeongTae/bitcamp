package com.jse.swing;

public class MemberServie {
	//필드에서 선언하고 메서드에서 생성해야 한다.
	private MemberBean[] members;
	public MemberServie() {
		members = new MemberBean[10];
	}
	public void setMemberBean(MemberBean[] members) {
		this.members = members;
	}
	public MemberBean[] getMemeberBean() {
		return members;
	}
}
