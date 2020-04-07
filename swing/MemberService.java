package com.jse.swing;

public class MemberService {
	//필드에서 선언하고 메서드에서 생성해야 한다.
	private MemberBean[] members;
	private int count;
	public MemberService() {
		members = new MemberBean[3];
	}
	public void setMemberBean(MemberBean[] members) {
		this.members = members;
	}
	public MemberBean[] getMemeberBean() {
		return members;
	}
	public void add(MemberBean member) {
		members[count] = member;
		count++;
	}
	
}
