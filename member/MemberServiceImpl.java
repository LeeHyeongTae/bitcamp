package com.jse.member;


public class MemberServiceImpl implements MemberService{
	private Member[] members;
	private int count;

	public MemberServiceImpl() {
		members = new Member[5];
		count = 0;
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
	public Member[] searchByName(String keyword) {
		Member[] nameMembers = new Member[count(keyword)];
		int j = 0;
		for(int i=0; i<count; i++) {
			if(count(keyword)!=0) {	
			if(keyword.equals(members[i].getName())) {
				nameMembers[j] = members[i];
				j++;
				}
			if(count(keyword)==j) {
				break;
				}
			}
		}
		return nameMembers;
	}

	@Override
	public Member[] searchByGender(int ssn) {
		Member[] genderMembers = null;
		
		return genderMembers;
	}

	@Override
	public Member detail(String userid) {
		Member member = new Member();
		for(int i=0; i<count; i++) {
			if(userid.equals(members[i].getUserid())) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public int count() {
		
		return count;
	}

	@Override
	public int count(String name) {
		int namecount =0;
		for(int i=0; i<count; i++) {
			if(name.equals(members[i].getName())) {
				namecount++;
			}
		}
		return namecount;
	}

	@Override
	public int ssnCount(String gender) {
		int gendercount = 0;
		
		return gendercount;
	}

	@Override
	public Member login(Member member) {
		Member loginmember = null;
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid()) &&
					member.getPasswd().equals(members[i].getPasswd())) {
				loginmember = members[i];
				break;
			}
		}
		
		return loginmember;
	}

	@Override
	public void update(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid())) {
				members[i] = member;
			}
		}
		
	}

	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid()) &&
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}
	}
}
