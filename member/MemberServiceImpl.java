package com.jse.member;

public class MemberServiceImpl implements MemberService {
	//필드에서 선언하고 메서드에서 생성해야 한다.
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
	}
	@Override
	public void setMember(Member[] members) {
		this.members = members;
	}
	@Override
	public Member[] getMemeber() {
		return members;
	}
	@Override
	public void add(Member member) {
		System.out.println("서비스로 들어온 멤버");
		System.out.println(member);
		members[count] = member;
		count++;
	}
	
}
