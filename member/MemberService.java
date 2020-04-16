package com.jse.member;

public interface MemberService {
		
		public void add(Member member);
		public Member[] list();
		public Member[] searchByName(String keyword);
		public Member detail(String userid);
		public int count();
		
		public Member login(Member member);

		public void update(Member member);
		public void delete(Member member);
		public String welcome(String name);
	}


