package com.jse.member;

public interface MemberService {
		
		public void add(Member member);
		public Member[] list();
		public Member[] searchByName(String keyword);
		public Member[] searchByGender(int ssn);
		public Member detail(String userid);
		public int count();
		public int count(String name);
		public int count(int ssn);
		public Member login(Member member);

		public void update(Member member);
		public void delete(Member member);
		public String welcome(String name);
	}


