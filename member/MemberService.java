package com.jse.member;

public interface MemberService {
		public void setMember(Member[] members);
		public Member[] getMemeber();
		public void add(Member member);
		public Member login(Member member);
	}


