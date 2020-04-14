package com.jse.pratice;

public interface MemberService {
	public Member[] getMembers();
	public void setMembers(Member[] members);
	public int getCount();
	public void setCount(int count);
	public void add(Member member);
	public Member login(Member member);
}
