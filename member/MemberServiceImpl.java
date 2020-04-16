package com.jse.member;


public class MemberServiceImpl implements MemberService {
	//필드에서 선언하고 메서드에서 생성해야 한다.
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
	public Member[] searchByName(String name) {
		Member[] searchresult = null;
		int searchCount = count(name);
		if(searchCount!=0) {
			searchresult = new Member[count(name)];
			int j=0;
			for(int i=0; i<this.count; i++) {
				if(name.equals(members[i].getName())) {
						searchresult[j] = members[i];
						j++;
						if(searchCount==j) {
							break;
						}
				}
			}
		}
		return searchresult;
	}
	
	@Override
	public Member[] searchByGender(int ssn) {
		Member[] genderCheck = null;
		int searchCount = count(ssn);
		if(searchCount!=0) {
			genderCheck = new Member[count(ssn)];
		int j=0;
		for(int i=0; i<count; i++) {
		if(ssn == members[i].getSsn().charAt(7)) {
			genderCheck[j] = members[i];
			j++;
			if(searchCount==j) {
				break;
					}
				}
			}
		}
		return genderCheck;
	}
	
	@Override
	public Member detail(String userid) {
		Member member = null;
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
		int count = 0;
		for(int i=0; i<count; i++) {
			if(name.equals(members[i].getName())) {
				count++;
			}
		}
		
		return count;
	}

	@Override
	public int count(int ssn) {
		int count =0;
		for(int i=0; i<count; i++) {
			if(ssn == members[i].getSsn().charAt(7)) {
				count++;
			}
		}
		return count;
	}

	@Override
	public Member login(Member member) {//서치와 소팅
		Member result = new Member();
		for(int i=0; i<count; i++) {
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
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid()) &&
					member.getPasswd().equals(members[i].getPasswd())) {
				members[i] = member;
				break;
			}
		}
		
	}

	@Override
	public void delete(Member member) {
		for(int i=0; i<count; i++) {
			if(member.getUserid().equals(members[i].getUserid()) &&
					member.getPasswd().equals(members[i].getPasswd())) {
				if(i!=count-1) {
					members[i] = members[count-1];
					members[count-1] = null;
					count--;
				}
				break;
			}
		}
		
	}
		
}
