package com.jse.member;

public class MemberService {
	//필드에서 선언하고 메서드에서 생성해야 한다.
	private Member[] members;
	private int count;
	public MemberService() {
		members = new Member[3];
	}
	public void setMemberBean(Member[] members) {
		this.members = members;
	}
	public Member[] getMemeberBean() {
		return members;
	}
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	
}
