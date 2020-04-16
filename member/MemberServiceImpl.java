package com.jse.member;


public class MemberServiceImpl implements MemberService {
	//필드에서 선언하고 메서드에서 생성해야 한다.
	private Member[] members;
	private int count;
	public MemberServiceImpl() {
		members = new Member[5];
	}
	@Override
	public void add(Member member) {
		members[count] = member;
		count++;
	}

	@Override
	public Member[] list() {
		return members;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Member login(Member member) {//서치와 소팅
		Member result = new Member();
		for(int i=0; i<members.length; i++) {
			if(member.getUserid().equals(members[i].getUserid()) 
					&& member.getPasswd().equals(members[i].getPasswd())) {//fix 된 값이 왼쪽에 가야 퍼포먼스가 좋다.
				result = members[i];
				break; //매우 중요!!
			}
		}
		return result;
	}
	@Override
	public String welcome(String name) {
		String welcome = "안녕하세요, "+name+"님, 좋은 하루 되세요~";
		return welcome;
	}
		
	@Override
	public void update(Member member) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Member member) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Member detail(Member member) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
