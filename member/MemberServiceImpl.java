package com.jse.member;

public class MemberServiceImpl implements MemberService {
	//필드에서 선언하고 메서드에서 생성해야 한다.
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[3];
	}
	@Override
	public void setMemberBean(Member[] members) {
		this.members = members;
	}
	@Override
	public Member[] getMemeberBean() {
		return members;
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}
	
}
